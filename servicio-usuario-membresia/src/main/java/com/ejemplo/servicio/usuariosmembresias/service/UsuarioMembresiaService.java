package com.ejemplo.servicio.usuariosmembresias.service;

import java.util.List;

import com.ejemplo.servicio.usuariosmembresias.models.Usuario_Membresia;

public interface UsuarioMembresiaService {

	public List<Usuario_Membresia> listar();
	public Usuario_Membresia guardar(Usuario_Membresia u);
	public void eliminar(Integer id);
}
