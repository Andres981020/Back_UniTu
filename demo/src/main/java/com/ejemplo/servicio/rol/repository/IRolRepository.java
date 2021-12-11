package com.ejemplo.servicio.rol.repository;

import org.springframework.data.repository.CrudRepository;

import com.ejemplo.servicio.commons.rol.models.entity.Rol;


public interface IRolRepository extends CrudRepository<Rol, Integer> {

}
