package com.horis.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class UnidadeCurricular {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private int cargaHoraria;
	private String area;
	@ManyToMany
	private List<Curso> cursos;
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
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		UnidadeCurricular unidadeCurricular = (UnidadeCurricular)obj;
		return this.nome.equals(unidadeCurricular.getNome())
				&& this.cargaHoraria == unidadeCurricular.getCargaHoraria()
				&& this.area.equals(unidadeCurricular.getArea());
	}
	/**
	 * @return the cursos
	 */
	public List<Curso> getCursos() {
		return cursos;
	}
	/**
	 * @param cursos the cursos to set
	 */
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
}
