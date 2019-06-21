/**
 * 
 */
package com.horis.api.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.horis.api.document.Turma;

/**
 * @author Walker
 *
 */
public interface TurmaRepository extends ReactiveMongoRepository<Turma, String> {

}
