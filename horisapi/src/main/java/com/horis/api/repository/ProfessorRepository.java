package com.horis.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horis.api.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{
}
