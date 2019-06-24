package com.horis.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Turma {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Curso curso;
	@OneToMany(mappedBy = "turma")
	private List<Aula> aulas;
	/**
	 * @param id
	 */
	public Turma(Long id) {
		this.id = id;
	}
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
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	/**
	 * @return the aulas
	 */
	public List<Aula> getAulas() {
		return aulas;
	}
	/**
	 * @param aulas the aulas to set
	 */
	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}
		
	
}
