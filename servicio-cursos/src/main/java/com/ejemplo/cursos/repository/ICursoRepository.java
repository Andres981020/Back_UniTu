package com.ejemplo.cursos.repository;

import org.springframework.data.repository.CrudRepository;

import com.ejemplo.cursos.models.Curso;

public interface ICursoRepository extends CrudRepository<Curso, Integer> {

}
