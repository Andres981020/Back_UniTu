package com.ejemplo.servicio.rol.service;

import java.util.List;

import com.ejemplo.servicio.commons.rol.models.entity.Rol;

public interface RolService {
	
	public List<Rol> listar();
	public Rol listarPorId(Integer id);
	
	public Rol guardar(Rol rol);
	public void eliminar(Integer id);
	

}
