package com.ejemplo.servicio.usuariosmembresias.models;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuario_x_membresia")
public class Usuario_Membresia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer estado;
	
	@Column(name="id_membresia_obtenida")
	private Integer id_membresia;
	@Column(name="id_usuario_obtenido")
	private Integer id_usuario;
	
	private Date fecha_compra;
	private Date fecha_activacion;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="id_membresia")
	private Membresia membresia;

	public Usuario_Membresia() {
		super();
	}

	public Usuario_Membresia(Integer id, Integer estado, Integer id_membresia, Integer id_usuario, Date fecha_compra,
			Date fecha_activacion, Usuario usuario, Membresia membresia) {
		super();
		this.id = id;
		this.estado = estado;
		this.id_membresia = id_membresia;
		this.id_usuario = id_usuario;
		this.fecha_compra = fecha_compra;
		this.fecha_activacion = fecha_activacion;
		this.usuario = usuario;
		this.membresia = membresia;
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

	public Integer getId_membresia() {
		return membresia.getId();
	}

	public void setId_membresia(Integer id_membresia) {
		this.id_membresia = id_membresia;
	}

	public Integer getId_usuario() {
		return usuario.getId();
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Date getFecha_compra() {
		return fecha_compra;
	}

	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}

	public Date getFecha_activacion() {
		return fecha_activacion;
	}

	public void setFecha_activacion(Date fecha_activacion) {
		this.fecha_activacion = fecha_activacion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Membresia getMembresia() {
		return membresia;
	}

	public void setMembresia(Membresia membresia) {
		this.membresia = membresia;
	}
	
	
	
}
