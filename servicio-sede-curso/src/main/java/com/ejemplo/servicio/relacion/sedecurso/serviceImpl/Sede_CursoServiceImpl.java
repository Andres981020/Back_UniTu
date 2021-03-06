package com.ejemplo.servicio.relacion.sedecurso.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.servicio.relacion.sedecurso.models.Sede_Curso;
import com.ejemplo.servicio.relacion.sedecurso.repository.ISedesCursosRepository;
import com.ejemplo.servicio.relacion.sedecursos.service.Sede_CursoService;

@Service
public class Sede_CursoServiceImpl implements Sede_CursoService {

	@Autowired
	private ISedesCursosRepository repo;
	
	@Override
	public List<Sede_Curso> listar() {
		return (List<Sede_Curso>) repo.findAll();
	}

	@Override
	public Sede_Curso guardar(Sede_Curso rel) {
		return repo.save(rel);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
