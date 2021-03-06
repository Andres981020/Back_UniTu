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
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length=45)
	private String primer_nombre;
	
	@Column(length=45)
	private String segundo_nombre;
	
	@Column(length=45)
	private String primer_apellido;
	
	@Column(length=45)
	private String segundo_apellido;
	
	@Column
	private Integer sexo;
	
	@Column
	private Integer tipo_documento;
	
	@Column(length=45)
	private String numero_documento;
	
	@Column(length=100)
	private String correo_electronico;
	
	@Column(length=10)
	private String celular;
	
	@Column
	private Integer id_rol_asig;
	
	@Column(length=45)
	private String password;
	
	@OneToMany(mappedBy = "usuario")
	private Set<Usuario_Membresia> usuario_membresia;

	public Usuario() {
		super();
	}

	public Usuario(Integer id, String primer_nombre, String segundo_nombre, String primer_apellido,
			String segundo_apellido, Integer sexo, Integer tipo_documento, String numero_documento,
			String correo_electronico, String celular, Integer id_rol_asig, String password) {
		super();
		this.id = id;
		this.primer_nombre = primer_nombre;
		this.segundo_nombre = segundo_nombre;
		this.primer_apellido = primer_apellido;
		this.segundo_apellido = segundo_apellido;
		this.sexo = sexo;
		this.tipo_documento = tipo_documento;
		this.numero_documento = numero_documento;
		this.correo_electronico = correo_electronico;
		this.celular = celular;
		this.id_rol_asig = id_rol_asig;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrimer_nombre() {
		return primer_nombre;
	}

	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
	}

	public String getSegundo_nombre() {
		return segundo_nombre;
	}

	public void setSegundo_nombre(String segundo_nombre) {
		this.segundo_nombre = segundo_nombre;
	}

	public String getPrimer_apellido() {
		return primer_apellido;
	}

	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}

	public String getSegundo_apellido() {
		return segundo_apellido;
	}

	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public Integer getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(Integer tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public String getNumero_documento() {
		return numero_documento;
	}

	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Integer getId_rol_asig() {
		return id_rol_asig;
	}

	public void setId_rol_asig(Integer id_rol_asig) {
		this.id_rol_asig = id_rol_asig;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
