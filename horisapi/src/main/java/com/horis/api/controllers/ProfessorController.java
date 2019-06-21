package com.horis.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.horis.api.document.Professor;
import com.horis.api.repository.ProfessorRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

	@Autowired
	ProfessorRepository professorRepository;
	
	@GetMapping
	public Flux<Professor> getList() {
		return professorRepository.findAll();		
	}
	
	@GetMapping(value="/{id}")
	public Mono<Professor> getById(@PathVariable String id) {
		return professorRepository.findById(id);		
	}
	
	@PostMapping
	public Mono<Professor> save(@RequestBody Professor professor) {
		return professorRepository.save(professor);
	}
	
	@PutMapping
	public Mono<Professor> update(@RequestBody Professor professor) {
		return professorRepository.save(professor);
	}
	
}
