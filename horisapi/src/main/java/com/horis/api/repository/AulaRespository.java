/**
 * 
 */
package com.horis.api.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.horis.api.document.Aula;

/**
 * @author Walker
 *
 */
public interface AulaRespository extends ReactiveMongoRepository<Aula, String>{

}
