package com.horis.api.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Turma {
	
	@Id
	private String id;
	private Curso curso;
	private List<Aula> aulas;
	
	
}
