package com.example.professor.controller;

import com.example.professor.persistence.model.Professor;
import com.example.professor.persistence.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfessorController {


    private final ProfessorRepository professorRepository;

    @Autowired
    public ProfessorController(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    @GetMapping("/mostrarProfessor")
    public ResponseEntity<?> mostrarTudo(){
        return new ResponseEntity<>(professorRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/salvar")
    public ResponseEntity<Professor> salvarProfessor(@RequestBody Professor professor){
        return new ResponseEntity<>(professorRepository.save(professor), HttpStatus.CREATED);
    }

}
