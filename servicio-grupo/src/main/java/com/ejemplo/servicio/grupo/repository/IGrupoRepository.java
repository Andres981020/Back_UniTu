package com.ejemplo.servicio.grupo.repository;

import org.springframework.data.repository.CrudRepository;

import com.ejemplo.servicio.grupo.models.Grupo;

public interface IGrupoRepository extends CrudRepository<Grupo, Integer> {

}
