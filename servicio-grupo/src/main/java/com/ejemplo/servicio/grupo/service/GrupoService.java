package com.ejemplo.servicio.grupo.service;

import java.util.List;

import com.ejemplo.servicio.grupo.models.Grupo;

public interface GrupoService {
	
	public List<Grupo> listar();
	public Grupo listarPorId(Integer id);
	
	public Grupo guardar(Grupo grupo);
	public void eliminar(Integer id);

}
