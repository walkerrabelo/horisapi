package com.horis.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.horis.api.model.Professor;
import com.horis.api.repository.ProfessorRepository;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

	@Autowired
	ProfessorRepository professorRepository;
	
	@GetMapping
	public ResponseEntity<List<Professor>> getList() {
		return ResponseEntity.ok(professorRepository.findAll());
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Professor> getById(@PathVariable Integer id) {
		Optional<Professor> optionalProfessor = professorRepository.findById(id);
		if(optionalProfessor.isPresent()) {
			return ResponseEntity.ok(optionalProfessor.get());	
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<Professor> insert(@RequestBody Professor professor) {
		return ResponseEntity.ok(professorRepository.save(professor));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Professor> update(@PathVariable Integer id, @RequestBody Professor professor) {
		Optional<Professor> optionalProfessor = professorRepository.findById(id);
		if(optionalProfessor.isPresent()) {
			// Extract this code to a DTO 
			Professor p = optionalProfessor.get();
			p.setArea(professor.getArea());
			p.setAtivo(professor.isAtivo());
			p.setNome(professor.getNome());
			p.setAulas(professor.getAulas());
			return ResponseEntity.ok(professorRepository.save(p));	
		}
		return ResponseEntity.notFound().build();
	}
}
