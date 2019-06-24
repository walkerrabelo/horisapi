package com.horis.api.dto.professor;

import org.springframework.data.domain.Page;

import com.horis.api.model.Professor;

public class ProfessorDto {
	
	private Long id;
	private String nome;
	private String area;
	private boolean ativo;
	/**
	 * @param nome
	 * @param area
	 * @param ativo
	 */
	public ProfessorDto(Professor professor) {
		this.id = professor.getId();
		this.nome = professor.getNome();
		this.area = professor.getArea();
		this.ativo = professor.isAtivo();
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
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
	
	public static Page<ProfessorDto> toList(Page<Professor> professores){
		return professores.map(ProfessorDto::new);
	}

}
