package com.ejemplo.servicio.usuario.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.servicio.commons.usuario.model.entity.Usuario;
import com.ejemplo.servicio.usuario.repository.IUsuarioRepository;
import com.ejemplo.servicio.usuario.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private IUsuarioRepository repo;
	
	@Override
	public List<Usuario> listar() {
		return (List<Usuario>) repo.findAll();
	}

	@Override
	public Usuario listarPorId(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Usuario guardar(Usuario u) {
		return repo.save(u);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
