package com.ejemplo.servicio.relacion.sedecursos.service;

import java.util.List;

import com.ejemplo.servicio.relacion.sedecurso.models.Sede_Curso;

public interface Sede_CursoService {
	
	public List<Sede_Curso> listar();
	public Sede_Curso guardar(Sede_Curso rel); 
	public void eliminar(Integer id);

}
