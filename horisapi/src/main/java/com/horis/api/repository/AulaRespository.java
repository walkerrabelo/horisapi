/**
 * 
 */
package com.horis.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horis.api.model.Aula;

/**
 * @author Walker
 *
 */
public interface AulaRespository extends JpaRepository<Aula, Long>{
	List<Aula> findByProfessorNome(String nomeProfessor);
}
