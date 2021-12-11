package com.ejemplo.servicio.membresias.service;

import java.util.List;

import com.ejemplo.servicio.membresias.models.Membresia;

public interface MembresiaService {

	public List<Membresia> listar();
	public Membresia listarPorId(Integer id);
	
	public Membresia guardar(Membresia m);
	public void eliminar(Integer id);
}
