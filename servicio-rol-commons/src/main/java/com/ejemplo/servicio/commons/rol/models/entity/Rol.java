package com.ejemplo.servicio.commons.rol.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="roles")
public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=45)
	private String nombre_rol;
	
	@Column(length=45)
	private String tipo_rol;

	
	public Rol() {
		super();
	}

	public Rol(Integer id, String nombre_rol, String tipo_rol) {
		super();
		this.id = id;
		this.nombre_rol = nombre_rol;
		this.tipo_rol = tipo_rol;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre_rol() {
		return nombre_rol;
	}

	public void setNombre_rol(String nombre_rol) {
		this.nombre_rol = nombre_rol;
	}

	public String getTipo_rol() {
		return tipo_rol;
	}

	public void setTipo_rol(String tipo_rol) {
		this.tipo_rol = tipo_rol;
	}

}
