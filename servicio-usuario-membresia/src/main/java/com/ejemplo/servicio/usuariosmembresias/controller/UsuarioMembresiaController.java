package com.ejemplo.servicio.usuariosmembresias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.servicio.usuariosmembresias.models.Usuario_Membresia;
import com.ejemplo.servicio.usuariosmembresias.service.UsuarioMembresiaService;

@RestController
public class UsuarioMembresiaController {

	@Autowired
	private UsuarioMembresiaService service;
	
	@GetMapping("/usuarios-membresias")
	public List<Usuario_Membresia> listar() {
		return service.listar();
	}
	
	@PostMapping("/usuarios-membresias/guardar-relacion")
	public Usuario_Membresia guardar(@RequestBody Usuario_Membresia u) {
		return service.guardar(u);
	}
	
	@DeleteMapping("/usuarios-membresias/eliminar-relacion/{id}")
	public void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
}
