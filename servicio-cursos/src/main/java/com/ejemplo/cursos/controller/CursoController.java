package com.ejemplo.cursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.cursos.models.Curso;
import com.ejemplo.cursos.service.CursoService;

@RestController
public class CursoController {

	@Autowired
	private CursoService service;
	
	@GetMapping("/cursos")
	public List<Curso> listar() {
		
		return service.listar();
		
	}
	
	@GetMapping("/cursos/{id}")
	public Curso listarPorId(@PathVariable Integer id) {
		
		return service.listarPorId(id);
		
	}
	
	@PostMapping("/cursos/guardar-curso")
	public Curso guardar(@RequestBody Curso s) {
		
		return service.guardar(s);
		
	}
	
	@PutMapping("/cursos/actualizar-curso/{id}")
	public Curso actualizar(@RequestBody Curso c, @PathVariable Integer id) {
		
		Curso nuevoCurso = service.listarPorId(id);
		
		if(nuevoCurso == null) {
			
			throw new IllegalStateException("Curso no encontrado");
			
		}
		
		nuevoCurso.setNombre_curso(c.getNombre_curso());
		nuevoCurso.setCategoria_curso(c.getCategoria_curso());
		nuevoCurso.setCodigo_curso(c.getCodigo_curso());
		nuevoCurso.setCreditos_curso(c.getCreditos_curso());
		nuevoCurso.setDescripcion_curso(c.getDescripcion_curso());
		nuevoCurso.setEstado(c.getEstado());
		
		return service.guardar(nuevoCurso);
	}
	
	@DeleteMapping("/cursos/eliminar-curso/{id}")
	public void eliminar(@PathVariable Integer id) {
		
		Curso nuevoCurso = service.listarPorId(id);
		
		if(nuevoCurso == null) {
			
			throw new IllegalStateException("Curso no encontrado");
			
		}
		
		service.eliminar(id);
	}
}
