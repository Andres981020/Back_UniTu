package com.ejemplo.servicio.rol.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.servicio.commons.rol.models.entity.Rol;
import com.ejemplo.servicio.rol.repository.IRolRepository;
import com.ejemplo.servicio.rol.service.RolService;

@Service
public class RolServiceImpl implements RolService {

	@Autowired
	private IRolRepository repo;
	
	@Override
	public List<Rol> listar() {
		return (List<Rol>) repo.findAll();
	}

	@Override
	public Rol listarPorId(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Rol guardar(Rol rol) {
		return repo.save(rol);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
