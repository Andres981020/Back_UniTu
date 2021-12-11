package com.ejemplo.sedes.service;

import java.util.List;

import com.ejemplo.sedes.models.Sede;

public interface SedeService {
	
	public List<Sede> listar();
	public Sede listarPorId(Integer id);
	
	public Sede guardar(Sede s);
	public void eliminar(Integer id);

}
