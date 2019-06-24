package com.horis.api.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Aula {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private LocalDateTime inicio;
	private LocalDateTime fim;
	@ManyToOne
	private Turma turma;
	@ManyToOne
	private UnidadeCurricular unidadeCurricular;
	@ManyToOne
	private Professor professor;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
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
	/**
	 * @return the professor
	 */
	public Professor getProfessor() {
		return professor;
	}
	/**
	 * @param professor the professor to set
	 */
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}	
	
}
