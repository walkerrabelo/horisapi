package com.horis.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horis.api.document.Professor;
import com.horis.api.repository.ProfessorRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProfessorServiceImpl implements ProfessorService {

	@Autowired
	ProfessorRepository professorRepository;
	
	@Override
	public Flux<Professor> findAll() {
		return professorRepository.findAll();
	}

	@Override
	public Mono<Professor> findById(String id) {
		return professorRepository.findById(id);
	}

	@Override
	public Mono<Professor> save(Professor professor) {
		return professorRepository.save(professor);
	}

}
