package com.ejemplo.servicio.membresias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.servicio.membresias.models.Membresia;
import com.ejemplo.servicio.membresias.service.MembresiaService;

@RestController
public class MembresiaController {

	@Autowired
	private MembresiaService service;
	
	@GetMapping("/membresias")
	public List<Membresia> listar() {
		
		return service.listar();
		
	}
	
	@GetMapping("/membresias/{id}")
	public Membresia listarPorId(@PathVariable Integer id) {
		
		return service.listarPorId(id);
		
	}
	
	@PostMapping("/membresias/guardar-membresia")
	public Membresia guardar(@RequestBody Membresia m) {
		
		return service.guardar(m);
		
	}
	
	@PutMapping("/membresias/actualizar-membresia/{id}")
	public Membresia actualizar(@RequestBody Membresia m, @PathVariable Integer id) {
		
		Membresia nuevaMembresia = service.listarPorId(id);
		
		if(nuevaMembresia == null) {
			
			throw new IllegalStateException("Membresia no encontrada");
			
		}
		
		nuevaMembresia.setEstado(m.getEstado());
		nuevaMembresia.setDuracion(m.getDuracion());
		nuevaMembresia.setNombre_membresia(m.getNombre_membresia());
		nuevaMembresia.setPrecio(m.getPrecio());
		
		return service.guardar(nuevaMembresia);
		
	}
	
	@DeleteMapping("/membresias/eliminar-membresia/{id}")
	public void eliminar(@PathVariable Integer id) {
		
		Membresia nuevaMembresia = service.listarPorId(id);
		
		if(nuevaMembresia == null) {
			
			throw new IllegalStateException("Membresia no encontrada");
			
		}
		
		service.eliminar(id);
	}
}
