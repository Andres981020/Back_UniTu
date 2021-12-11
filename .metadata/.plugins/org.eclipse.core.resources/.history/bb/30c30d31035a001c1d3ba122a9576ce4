package com.ejemplo.sedes.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sedes")
public class Sede {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer estado;
	
	@Column(length=250)
	private String nombre_sede;
	
	private Double latitud;
	private Double longitud;
	private Integer id_ciudad;
	
	
	
	public Sede() {
		super();
	}
	
	public Sede(Integer id, Integer estado, String nombre_sede, Double latitud, Double longitud, Integer id_ciudad) {
		super();
		this.id = id;
		this.estado = estado;
		this.nombre_sede = nombre_sede;
		this.latitud = latitud;
		this.longitud = longitud;
		this.id_ciudad = id_ciudad;
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
	
	public String getNombre_sede() {
		return nombre_sede;
	}
	
	public void setNombre_sede(String nombre_sede) {
		this.nombre_sede = nombre_sede;
	}
	
	public Double getLatitud() {
		return latitud;
	}
	
	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}
	
	public Double getLongitud() {
		return longitud;
	}
	
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	
	public Integer getId_ciudad() {
		return id_ciudad;
	}
	
	public void setId_ciudad(Integer id_ciudad) {
		this.id_ciudad = id_ciudad;
	}
	
}
