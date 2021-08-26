package com.proyect.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idpersona;
	private String nombres;
	private String apellidos;
	private String identificacion;
	private Date fechnacimineto;
	private String telefono;
	private String direccion;
	private String correo;
	private String estado;
	private String imagen;
	private String genero;
	private int idusuario;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(int idpersona, String nombres, String apellidos, String identificacion, Date fechnacimineto,
			String telefono, String direccion, String correo, String estado, String imagen, String genero,
			int idusuario) {
		super();
		this.idpersona = idpersona;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.identificacion = identificacion;
		this.fechnacimineto = fechnacimineto;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.estado = estado;
		this.imagen = imagen;
		this.genero = genero;
		this.idusuario = idusuario;
	}

	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public Date getFechnacimineto() {
		return fechnacimineto;
	}

	public void setFechnacimineto(Date fechnacimineto) {
		this.fechnacimineto = fechnacimineto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	
	
}
