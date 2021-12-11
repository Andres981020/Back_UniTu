package com.ejemplo.servicio.usuariosmembresias.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="membresias")
public class Membresia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer estado;
	private Integer duracion;
	
	private Double precio;
	
	@Column(length=255)
	private String nombre_membresia;
	
	@OneToMany(mappedBy = "membresia")
	private Set<Usuario_Membresia> usuario_membresia;

	public Membresia() {
		super();
	}

	public Membresia(Integer id, Integer estado, Integer duracion, Double precio, String nombre_membresia) {
		super();
		this.id = id;
		this.estado = estado;
		this.duracion = duracion;
		this.precio = precio;
		this.nombre_membresia = nombre_membresia;
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

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getNombre_membresia() {
		return nombre_membresia;
	}

	public void setNombre_membresia(String nombre_membresia) {
		this.nombre_membresia = nombre_membresia;
	}
	
}
