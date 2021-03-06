package com.ejemplo.sedes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.sedes.models.Sede;
import com.ejemplo.sedes.repository.ISedeRepository;
import com.ejemplo.sedes.service.SedeService;

@Service
public class SedeServiceImpl implements SedeService {

	@Autowired
	private ISedeRepository repo;
	
	@Override
	public List<Sede> listar() {
		
		return (List<Sede>) repo.findAll();
		
	}

	@Override
	public Sede listarPorId(Integer id) {
		
		return repo.findById(id).orElse(null);
		
	}

	@Override
	public Sede guardar(Sede s) {
		
		return repo.save(s);
		
	}

	@Override
	public void eliminar(Integer id) {
		
		repo.deleteById(id);
		
	}

}
