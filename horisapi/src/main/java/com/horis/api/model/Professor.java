package com.horis.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private String area;
	private boolean ativo;
	@OneToMany(mappedBy = "professor")
	private List<Aula> aulas;
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}
	public Professor(String nome, String area, boolean ativo) {
		this.nome = nome;
		this.area = area;
		this.ativo = ativo;
		this.aulas = new ArrayList<Aula>();
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
	 * @return the name
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param name the name to set
	 */
	public void setNome(String name) {
		this.nome = name;
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
	 * @return the active
	 */
	public boolean isAtivo() {
		return ativo;
	}
	/**
	 * @param active the active to set
	 */
	public void setAtivo(boolean active) {
		this.ativo = active;
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

	public void addAula(Aula aula) {
		if (!this.aulas.contains(aula)) {
			this.aulas.add(aula);
		}
	}
}
