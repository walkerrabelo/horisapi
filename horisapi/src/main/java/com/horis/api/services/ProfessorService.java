package com.horis.api.services;

import com.horis.api.document.Professor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProfessorService {
	
	Flux<Professor> findAll();
	Mono<Professor> findById(String id);
	Mono<Professor> save(Professor professor);
}
