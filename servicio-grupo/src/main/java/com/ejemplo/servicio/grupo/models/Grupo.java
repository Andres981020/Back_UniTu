package com.ejemplo.servicio.grupo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grupos")
public class Grupo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer estado;
	private Integer cupo_estudiantes;
	private Integer semestre;
	private Integer numero_estudiantes;
	
	public Grupo() {
		super();
	}
	public Grupo(Integer id, Integer estado, Integer cupo_estudiantes, Integer semestre, Integer numero_estudiantes) {
		super();
		this.id = id;
		this.estado = estado;
		this.cupo_estudiantes = cupo_estudiantes;
		this.semestre = semestre;
		this.numero_estudiantes = numero_estudiantes;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public Integer getCupo_estudiantes() {
		return cupo_estudiantes;
	}
	public void setCupo_estudiantes(Integer cupo_estudiantes) {
		this.cupo_estudiantes = cupo_estudiantes;
	}
	public Integer getSemestre() {
		return semestre;
	}
	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}
	public Integer getNumero_estudiantes() {
		return numero_estudiantes;
	}
	public void setNumero_estudiantes(Integer numero_estudiantes) {
		this.numero_estudiantes = numero_estudiantes;
	}
	
}
