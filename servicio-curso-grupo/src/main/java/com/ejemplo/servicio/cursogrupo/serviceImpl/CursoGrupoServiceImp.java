package com.ejemplo.servicio.cursogrupo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.servicio.cursogrupo.models.Curso_Grupo;
import com.ejemplo.servicio.cursogrupo.repository.ICursoGrupoRepository;
import com.ejemplo.servicio.cursogrupo.service.CursoGrupoService;

@Service
public class CursoGrupoServiceImp implements CursoGrupoService {

	@Autowired
	private ICursoGrupoRepository repo;
	
	@Override
	public List<Curso_Grupo> listar() {
		return (List<Curso_Grupo>) repo.findAll();
	}

	@Override
	public Curso_Grupo guardar(Curso_Grupo c) {
		return repo.save(c);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
