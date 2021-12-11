package com.ejemplo.servicio.grupo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.servicio.grupo.models.Grupo;
import com.ejemplo.servicio.grupo.repository.IGrupoRepository;
import com.ejemplo.servicio.grupo.service.GrupoService;

@Service
public class GrupoServiceImpl implements GrupoService {

	@Autowired
	private IGrupoRepository repo;
	
	@Override
	public List<Grupo> listar() {
		
		return (List<Grupo>) repo.findAll();
		
	}

	@Override
	public Grupo listarPorId(Integer id) {
		
		return repo.findById(id).orElse(null);
		
	}

	@Override
	public Grupo guardar(Grupo grupo) {
		
		return repo.save(grupo);
		
	}

	@Override
	public void eliminar(Integer id) {
		
		repo.deleteById(id);
		
	}

}
