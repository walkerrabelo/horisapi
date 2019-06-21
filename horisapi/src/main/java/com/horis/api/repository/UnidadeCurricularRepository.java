package com.horis.api.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.horis.api.document.UnidadeCurricular;

public interface UnidadeCurricularRepository extends ReactiveMongoRepository<UnidadeCurricular, String> {

}
