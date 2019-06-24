/**
 * 
 */
package com.horis.api.dto;

import java.time.LocalDateTime;

import org.springframework.data.domain.Example;

import com.horis.api.model.Aula;
import com.horis.api.model.Turma;
import com.horis.api.repository.ProfessorRepository;
import com.horis.api.repository.TurmaRepository;
import com.horis.api.repository.UnidadeCurricularRepository;

/**
 * @author Walker
 *
 */
public class AulaDto {

	private LocalDateTime inicio;
	private LocalDateTime fim;
	private Integer idTurma;
	private Integer idUnidadeCurricular;
	private Integer idProfessor;
	/**
	 * @param inicio
	 * @param fim
	 * @param idTurma
	 * @param idUnidadeCurricular
	 * @param idProfessor
	 */
	public AulaDto(LocalDateTime inicio, LocalDateTime fim, 
			Integer idTurma, Integer idUnidadeCurricular, Integer idProfessor) {
		this.inicio = inicio;
		this.fim = fim;
		this.idTurma = idTurma;
		this.idUnidadeCurricular = idUnidadeCurricular;
		this.idProfessor = idProfessor;
	}
	/**
	 * @return the inicio
	 */
	public LocalDateTime getInicio() {
		return inicio;
	}
	/**
	 * @return the fim
	 */
	public LocalDateTime getFim() {
		return fim;
	}
	/**
	 * @return the idTurma
	 */
	public Integer getIdTurma() {
		return idTurma;
	}
	/**
	 * @return the idUnidadeCurricular
	 */
	public Integer getIdUnidadeCurricular() {
		return idUnidadeCurricular;
	}
	/**
	 * @return the idProfessor
	 */
	public Integer getIdProfessor() {
		return idProfessor;
	}

}
