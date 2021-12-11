package com.ejemplo.servicio.membresias.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.servicio.membresias.models.Membresia;
import com.ejemplo.servicio.membresias.repository.IMembresiaRepository;
import com.ejemplo.servicio.membresias.service.MembresiaService;

@Service
public class MembresiaServiceImpl implements MembresiaService{

	@Autowired
	private IMembresiaRepository repo;
	
	@Override
	public List<Membresia> listar() {
		return (List<Membresia>) repo.findAll();
	}

	@Override
	public Membresia listarPorId(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Membresia guardar(Membresia m) {
		return repo.save(m);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
