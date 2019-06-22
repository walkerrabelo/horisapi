package com.horis.api.dto;

import com.horis.api.model.Professor;

public class ProfessorFormDto {

	private String nome;
	private String area;
	private boolean ativo;
	/**
	 * @param nome
	 * @param area
	 * @param ativo
	 */
	public ProfessorFormDto(String nome, String area, boolean ativo) {
		this.nome = nome;
		this.area = area;
		this.ativo = ativo;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @return the ativo
	 */
	public boolean isAtivo() {
		return ativo;
	}
	
	public Professor getProfessor() {
		return new Professor(this.nome, this.area, this.ativo);
	}
	
}
