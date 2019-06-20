package com.horis.api.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.horis.api.document.Professor;

public interface ProfessorRepository extends ReactiveMongoRepository<Professor, String>{
	
}
