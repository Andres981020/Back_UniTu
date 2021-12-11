package com.ejemplo.cursos.service;

import java.util.List;

import com.ejemplo.cursos.models.Curso;

public interface CursoService {

	public List<Curso> listar();
	public Curso listarPorId(Integer id);
	
	public Curso guardar(Curso c);
	public void eliminar(Integer id);
}
