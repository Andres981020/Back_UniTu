package com.ejemplo.servicio.usuario.controller;

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

import com.ejemplo.servicio.commons.usuario.model.entity.Usuario;
import com.ejemplo.servicio.usuario.service.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@GetMapping("/usuarios")
	public List<Usuario> listar(){
		
		return service.listar();
	
	}
	
	@GetMapping("/usuarios/{id}")
	@ResponseStatus(HttpStatus.FOUND)
	public Usuario listarPorId(@PathVariable Integer id) {
		
		return service.listarPorId(id);
		
	}
	
	@PostMapping("/usuarios/guardar-usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario guardar(@RequestBody Usuario u) {
		
		return service.guardar(u);
		
	}
	
	@PutMapping("/usuarios/actualizar-usuario/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Usuario actualizar(@RequestBody Usuario u, @PathVariable Integer id) {
		
		Usuario nuevoUsuario = service.listarPorId(id);
		
		if(nuevoUsuario == null) {
			
			throw new IllegalStateException("Usuario no encontrado");
		
		}
		
		nuevoUsuario.setPrimer_nombre(u.getPrimer_nombre());
		nuevoUsuario.setSegundo_nombre(u.getSegundo_nombre());
		nuevoUsuario.setPrimer_apellido(u.getPrimer_apellido());
		nuevoUsuario.setSegundo_apellido(u.getSegundo_apellido());
		nuevoUsuario.setSexo(u.getSexo());
		nuevoUsuario.setTipo_documento(u.getTipo_documento());
		nuevoUsuario.setNumero_documento(u.getNumero_documento());
		nuevoUsuario.setCorreo_electronico(u.getCorreo_electronico());
		nuevoUsuario.setCelular(u.getCelular());
		nuevoUsuario.setId_rol_asig(u.getId_rol_asig());
		nuevoUsuario.setPassword(u.getPassword());
		nuevoUsuario.setRol(u.getRol());
		
		System.out.println(nuevoUsuario.getRol().getId());
		return service.guardar(nuevoUsuario);
		
	}
	
	@DeleteMapping("/usuarios/eliminar-usuario/{id}")
	public void eliminar(@PathVariable Integer id) {
		
		Usuario nuevoUsuario = service.listarPorId(id);
		
		if(nuevoUsuario == null) {
			
			throw new IllegalStateException("Usuario no encontrado");
			
		}
		
		service.eliminar(id);
		
	}
}
