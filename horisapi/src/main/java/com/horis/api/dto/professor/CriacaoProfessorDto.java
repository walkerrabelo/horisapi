package com.horis.api.dto.professor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.horis.api.model.Professor;

public class CriacaoProfessorDto {

	@NotNull @NotEmpty @Length(min = 8)
	private String nome;
	@NotNull @NotEmpty @Length(min = 5)
	private String area;
	private boolean ativo;
	/**
	 * @param nome
	 * @param area
	 * @param ativo
	 */
	public CriacaoProfessorDto(String nome, String area, boolean ativo) {
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
