package com.horis.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horis.api.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
