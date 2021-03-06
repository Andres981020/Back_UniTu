package com.ejemplo.servicio.cursogrupo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.servicio.cursogrupo.models.Curso_Grupo;
import com.ejemplo.servicio.cursogrupo.service.CursoGrupoService;

@RestController
public class CursoGrupoController {

	@Autowired
	private CursoGrupoService service;
	
	@GetMapping("/grupos-cursos")
	public List<Curso_Grupo> listar() {
		return service.listar();
	}
	
	@PostMapping("/grupos-cursos/guardar-relacion")
	public Curso_Grupo guardar(@RequestBody Curso_Grupo c) {
		return service.guardar(c);
	}
	
	@DeleteMapping("/grupos-cursos/eliminar-relacion/{id}")
	public void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
	
}
