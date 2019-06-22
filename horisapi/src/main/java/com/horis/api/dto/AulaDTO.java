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
public class AulaDTO {

	private LocalDateTime inicio;
	private LocalDateTime fim;
	private String idTurma;
	private String idUnidadeCurricular;
	private String idProfessor;
	/**
	 * @param inicio
	 * @param fim
	 * @param idTurma
	 * @param idUnidadeCurricular
	 * @param idProfessor
	 */
	public AulaDTO(LocalDateTime inicio, LocalDateTime fim, String idTurma, String idUnidadeCurricular,
			String idProfessor) {
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
	public String getIdTurma() {
		return idTurma;
	}
	/**
	 * @return the idUnidadeCurricular
	 */
	public String getIdUnidadeCurricular() {
		return idUnidadeCurricular;
	}
	/**
	 * @return the idProfessor
	 */
	public String getIdProfessor() {
		return idProfessor;
	}

}
