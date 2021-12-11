package com.ejemplo.servicio.cursogrupo.service;

import java.util.List;

import com.ejemplo.servicio.cursogrupo.models.Curso_Grupo;

public interface CursoGrupoService {

	public List<Curso_Grupo> listar();
	public Curso_Grupo guardar(Curso_Grupo c);
	
	public void eliminar(Integer id);
}
