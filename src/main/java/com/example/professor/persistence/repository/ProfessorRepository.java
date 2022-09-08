package com.example.professor.persistence.repository;

import com.example.professor.persistence.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
