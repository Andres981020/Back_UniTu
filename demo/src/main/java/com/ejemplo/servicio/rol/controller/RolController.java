package com.ejemplo.servicio.rol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.servicio.commons.rol.models.entity.Rol;
import com.ejemplo.servicio.rol.service.RolService;

@RestController
public class RolController {

	@Autowired
	private RolService service;
	
	@GetMapping("")
	public String mostrar() {
		
		return "hola mundo";
		
	}
	
	@GetMapping("/roles")

	public List<Rol> listar(){
		
		return service.listar();
		
	}
	
	@PostMapping("/roles/guardar-rol")
	@ResponseStatus(HttpStatus.CREATED)
	public Rol guardar(@RequestBody Rol rol) {
		
		return service.guardar(rol);
		
	}
	
	@GetMapping("/roles/{id}")
	@ResponseStatus(HttpStatus.FOUND)
	public Rol listarPorId(@PathVariable Integer id) {
		
		Rol rol = service.listarPorId(id);
		
		if(rol == null) {
			
			throw new IllegalStateException("Rol no encontrado");
			
		}
		
		return rol;
	}
	
	@PutMapping("/roles/actualizar-rol/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Rol actualizar(@RequestBody Rol rol, @PathVariable Integer id) {
		
		Rol nuevoRol = service.listarPorId(id);
		
		if(nuevoRol == null) {

			throw new IllegalStateException("Rol no encontrado");

		}
		
		nuevoRol.setNombre_rol(rol.getNombre_rol());
		nuevoRol.setTipo_rol(rol.getTipo_rol());
		
		return service.guardar(nuevoRol);
		
	}
	
	@DeleteMapping("roles/eliminar-rol/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Integer id) {
		Rol nuevoRol = service.listarPorId(id);
		
		if (nuevoRol == null) {
			
			throw new IllegalStateException("Rol no encontrado");
			
		}
		
		service.eliminar(id);
				
	}
}
