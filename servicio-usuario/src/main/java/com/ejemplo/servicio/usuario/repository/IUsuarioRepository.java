package com.ejemplo.servicio.usuario.repository;

import org.springframework.data.repository.CrudRepository;

import com.ejemplo.servicio.commons.usuario.model.entity.Usuario;

public interface IUsuarioRepository extends CrudRepository<Usuario, Integer>{

}
