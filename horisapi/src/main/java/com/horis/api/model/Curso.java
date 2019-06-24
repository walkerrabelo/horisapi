package com.horis.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	@ManyToMany
	private List<UnidadeCurricular> unidadesCurriculares;
	@OneToMany(mappedBy = "curso")
	private List<Turma> turmas;
	private int cargaHoraria;
	private String area;
	
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
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the unidadesCurriculares
	 */
	public List<UnidadeCurricular> getUnidadesCurriculares() {
		return unidadesCurriculares;
	}
	/**
	 * @param unidadesCurriculares the unidadesCurriculares to set
	 */
	public void setUnidadesCurriculares(List<UnidadeCurricular> unidadesCurriculares) {
		this.unidadesCurriculares = unidadesCurriculares;
	}
	/**
	 * @return the cargaHoraria
	 */
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	/**
	 * @param cargaHoraria the cargaHoraria to set
	 */
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the turmas
	 */
	public List<Turma> getTurmas() {
		return turmas;
	}
	/**
	 * @param turmas the turmas to set
	 */
	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
}
