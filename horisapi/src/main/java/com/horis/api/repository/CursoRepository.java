package com.horis.api.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.horis.api.document.Curso;

public interface CursoRepository extends ReactiveMongoRepository<Curso, String> {

}
