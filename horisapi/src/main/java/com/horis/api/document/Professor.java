package com.horis.api.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Professor {

	@Id
	private String id;
	private String nome;
	private String area;
	private boolean ativo;
	private List<Aula> aulas;
	
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
