package com.ejemplo.servicio.grupo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.servicio.grupo.models.Grupo;
import com.ejemplo.servicio.grupo.service.GrupoService;

@RestController
public class GrupoController {

	@Autowired 
	private GrupoService service;
	
	@GetMapping("/grupos")
	public List<Grupo> listar() {
		
		return service.listar();
		
	}
	
	@GetMapping("/grupos/{id}")
	public Grupo listarPorId(@PathVariable Integer id) {
		
		return service.listarPorId(id);
		
	}
	
	@PostMapping("/grupos/guardar-grupo")
	public Grupo guardar(@RequestBody Grupo grupo) {
		
		return service.guardar(grupo);
		
	}
	
	@PutMapping("/grupos/actualizar-grupo/{id}")
	public Grupo actualizar(@RequestBody Grupo grupo, @PathVariable Integer id) {
		
		Grupo nuevoGrupo = service.listarPorId(id);
		
		if(nuevoGrupo == null) {
			
			throw new IllegalStateException("Curso no encontrado");
			
		}
		
		nuevoGrupo.setEstado(grupo.getEstado());
		nuevoGrupo.setCupo_estudiantes(grupo.getCupo_estudiantes());
		nuevoGrupo.setNumero_estudiantes(grupo.getNumero_estudiantes());
		nuevoGrupo.setSemestre(grupo.getSemestre());
		
		return service.guardar(nuevoGrupo);
	}
	
	@DeleteMapping("/grupos/eliminar-grupo/{id}")
	public void eliminar(@PathVariable Integer id) {
		
		Grupo nuevoGrupo = service.listarPorId(id);
		
		if(nuevoGrupo == null) {
			
			throw new IllegalStateException("Curso no encontrado");
			
		}
		
		service.eliminar(id);
	}
	
}
