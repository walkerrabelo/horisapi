package com.horis.api.controllers;

import java.net.URI;
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
import org.springframework.web.util.UriComponentsBuilder;

import com.horis.api.dto.ProfessorDto;
import com.horis.api.dto.AtualizacaoProfessorDto;
import com.horis.api.dto.CriacaoProfessorDto;
import com.horis.api.model.Professor;
import com.horis.api.repository.ProfessorRepository;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

	@Autowired
	ProfessorRepository professorRepository;
	
	@GetMapping
	public ResponseEntity<List<ProfessorDto>> getList() {
		return ResponseEntity.ok(ProfessorDto.toList(professorRepository.findAll()));
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<ProfessorDto> getById(@PathVariable Long id) {
		Optional<Professor> optionalProfessor = professorRepository.findById(id);
		if(optionalProfessor.isPresent()) {
			return ResponseEntity.ok(new ProfessorDto(optionalProfessor.get()));	
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<ProfessorDto> insert(
			@RequestBody CriacaoProfessorDto professorFormDto,
			UriComponentsBuilder uriBuilder) {
		Professor professor = professorFormDto.getProfessor();
		professorRepository.save(professor);
		URI uri = uriBuilder.path("/professores/{id}").buildAndExpand(professor.getId()).toUri();
		return ResponseEntity.created(uri).body(new ProfessorDto(professor));
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<ProfessorDto> update(@PathVariable Long id, 
			@RequestBody AtualizacaoProfessorDto atualizacaoProfessorDto) {
		Optional<Professor> optionalProfessor = professorRepository.findById(id);
		if(optionalProfessor.isPresent()) {
			// Extract this code to a DTO 
			Professor professor = atualizacaoProfessorDto.atualizar(id, professorRepository);
			return ResponseEntity.ok(new ProfessorDto(professor));	
		}
		return ResponseEntity.notFound().build();
	}
}
