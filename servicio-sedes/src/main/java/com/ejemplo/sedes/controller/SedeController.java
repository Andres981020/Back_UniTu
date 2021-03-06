package com.ejemplo.sedes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.sedes.models.Sede;
import com.ejemplo.sedes.service.SedeService;

@RestController
public class SedeController {

	@Autowired
	private SedeService service;
	
	@GetMapping("/sedes")
	public List<Sede> listar() {
		return service.listar();
	}
	
	@GetMapping("/sedes/{id}")
	public Sede listarPorId(@PathVariable Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping("/sedes/guardar-sede")
	public Sede guardar(@RequestBody Sede s) {
		return service.guardar(s);
	}
	
	@PutMapping("/sedes/actualizar-sede/{id}")
	public Sede actualizar(@RequestBody Sede s, @PathVariable Integer id) {
		
		Sede nuevaSede = service.listarPorId(id);
		
		if(nuevaSede == null) {
			throw new IllegalStateException("Usuario no encontrado");
		}
		
		nuevaSede.setNombre_sede(s.getNombre_sede());
		nuevaSede.setEstado(s.getEstado());
		nuevaSede.setId_ciudad(s.getId_ciudad());
		nuevaSede.setLatitud(s.getLatitud());
		nuevaSede.setLongitud(s.getLongitud());
		
		return service.guardar(nuevaSede);
	}
	
	@DeleteMapping("/sedes/eliminar-sede/{id}")
	public void eliminar(@PathVariable Integer id) {
		
		Sede nuevaSede = service.listarPorId(id);
		
		if(nuevaSede == null) {
			throw new IllegalStateException("Usuario no encontrado");
		}
		
		service.eliminar(id);
	}
}
