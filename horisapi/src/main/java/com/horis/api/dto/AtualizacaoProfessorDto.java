package com.horis.api.dto;

import com.horis.api.model.Professor;
import com.horis.api.repository.ProfessorRepository;

public class AtualizacaoProfessorDto {

	private String nome;
	private String area;
	private boolean ativo;
	/**
	 * @param nome
	 * @param area
	 * @param ativo
	 */
	public AtualizacaoProfessorDto(String nome, String area, boolean ativo) {
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
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
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
	 * @return the ativo
	 */
	public boolean isAtivo() {
		return ativo;
	}
	/**
	 * @param ativo the ativo to set
	 */
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public Professor atualizar(Long id, ProfessorRepository professorRepository) {
		Professor professor = professorRepository.getOne(id);
		professor.setArea(this.area);
		professor.setAtivo(this.ativo);
		professor.setNome(this.nome);
		
		return professor;		
	}
}
