package com.ejemplo.servicio.cursogrupo.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cursos")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer estado;
	private Integer creditos_curso;
	private Integer categoria_curso;
	
	@Column(length=45)
	private String codigo_curso;
	
	@Column(length=100)
	private String nombre_curso;
	
	@Column(length=255)
	private String descripcion_curso;
	
	@OneToMany(mappedBy = "curso")
	private Set<Curso_Grupo> curso_grupo;
	
	public Curso() {
		super();
	}

	public Curso(Integer id, Integer estado, Integer creditos_curso, Integer categoria_curso, String codigo_curso,
			String nombre_curso, String descripcion_curso) {
		super();
		this.id = id;
		this.estado = estado;
		this.creditos_curso = creditos_curso;
		this.categoria_curso = categoria_curso;
		this.codigo_curso = codigo_curso;
		this.nombre_curso = nombre_curso;
		this.descripcion_curso = descripcion_curso;
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

	public Integer getCreditos_curso() {
		return creditos_curso;
	}

	public void setCreditos_curso(Integer creditos_curso) {
		this.creditos_curso = creditos_curso;
	}

	public Integer getCategoria_curso() {
		return categoria_curso;
	}

	public void setCategoria_curso(Integer categoria_curso) {
		this.categoria_curso = categoria_curso;
	}

	public String getCodigo_curso() {
		return codigo_curso;
	}

	public void setCodigo_curso(String codigo_curso) {
		this.codigo_curso = codigo_curso;
	}

	public String getNombre_curso() {
		return nombre_curso;
	}

	public void setNombre_curso(String nombre_curso) {
		this.nombre_curso = nombre_curso;
	}

	public String getDescripcion_curso() {
		return descripcion_curso;
	}

	public void setDescripcion_curso(String descripcion_curso) {
		this.descripcion_curso = descripcion_curso;
	}
	
	
}
