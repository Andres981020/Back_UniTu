package com.ejemplo.servicio.membresias.repository;

import org.springframework.data.repository.CrudRepository;

import com.ejemplo.servicio.membresias.models.Membresia;

public interface IMembresiaRepository extends CrudRepository<Membresia, Integer> {

}
