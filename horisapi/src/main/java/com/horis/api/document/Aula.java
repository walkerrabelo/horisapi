package com.horis.api.document;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Aula {

	@Id
	private String id;
	private LocalDateTime inicio;
	private LocalDateTime fim;
	private Turma turma;
	private UnidadeCurricular unidadeCurricular;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the inicio
	 */
	public LocalDateTime getInicio() {
		return inicio;
	}
	/**
	 * @param inicio the inicio to set
	 */
	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}
	/**
	 * @return the fim
	 */
	public LocalDateTime getFim() {
		return fim;
	}
	/**
	 * @param fim the fim to set
	 */
	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}
	/**
	 * @return the turma
	 */
	public Turma getTurma() {
		return turma;
	}
	/**
	 * @param turma the turma to set
	 */
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	/**
	 * @return the unidadeCurricular
	 */
	public UnidadeCurricular getUnidadeCurricular() {
		return unidadeCurricular;
	}
	/**
	 * @param unidadeCurricular the unidadeCurricular to set
	 */
	public void setUnidadeCurricular(UnidadeCurricular unidadeCurricular) {
		this.unidadeCurricular = unidadeCurricular;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Aula aula = (Aula)obj;
		return this.inicio.equals(aula.getInicio()) 
				&& this.fim.equals(aula.getFim())
				&& this.turma.equals(aula.getTurma())
				&& this.unidadeCurricular.equals(aula.getUnidadeCurricular());
	}	
	
}
