package com.ejemplo.servicio.relacion.sedecurso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.servicio.relacion.sedecurso.models.Sede_Curso;
import com.ejemplo.servicio.relacion.sedecursos.service.Sede_CursoService;

@RestController
public class Sede_CursoController {

	@Autowired
	private Sede_CursoService service;
	
	@GetMapping("/sedes-cursos")
	public List<Sede_Curso> listar() {
		return service.listar();
	}
	
	@PostMapping("/sedes-cursos/guardar-relacion")
	public Sede_Curso guardar(@RequestBody Sede_Curso rel) {
		return service.guardar(rel);
	}
	
	@DeleteMapping("/sedes-cursos/eliminar-relacion/{id}")
	public void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
	
}
