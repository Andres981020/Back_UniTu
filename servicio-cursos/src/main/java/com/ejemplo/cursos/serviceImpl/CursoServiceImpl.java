package com.ejemplo.cursos.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.cursos.models.Curso;
import com.ejemplo.cursos.repository.ICursoRepository;
import com.ejemplo.cursos.service.CursoService;


@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	private ICursoRepository repo;
	
	@Override
	public List<Curso> listar() {
		return (List<Curso>) repo.findAll();
	}

	@Override
	public Curso listarPorId(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Curso guardar(Curso c) {
		return repo.save(c);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
