package com.ejemplo.servicio.usuario.service;

import java.util.List;

import com.ejemplo.servicio.commons.usuario.model.entity.Usuario;

public interface UsuarioService {

	public List<Usuario> listar();
	public Usuario listarPorId(Integer id);
	
	public Usuario guardar(Usuario u);
	public void eliminar(Integer id);
}
