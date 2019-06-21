package com.horis.api.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UnidadeCurricular {

	@Id
	private String id;
	private String nome;
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
	
	
}
