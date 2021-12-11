package com.ejemplo.servicio.usuariosmembresias.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.servicio.usuariosmembresias.models.Usuario_Membresia;
import com.ejemplo.servicio.usuariosmembresias.repository.IUsuarioMembresiaRepository;
import com.ejemplo.servicio.usuariosmembresias.service.UsuarioMembresiaService;

@Service
public class UsuarioMembresiaServiceImpl implements UsuarioMembresiaService {

	@Autowired
	private IUsuarioMembresiaRepository repo;

	@Override
	public List<Usuario_Membresia> listar() {
		return (List<Usuario_Membresia>) repo.findAll();
	}

	@Override
	public Usuario_Membresia guardar(Usuario_Membresia u) {
		return repo.save(u);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	};
}
