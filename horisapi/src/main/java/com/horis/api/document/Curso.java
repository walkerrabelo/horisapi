package com.horis.api.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Curso {

	@Id
	private String id;
	private String nome;
	private List<UnidadeCurricular> unidadesCurriculares;
	private int cargaHoraria;
	private String area;
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


}
