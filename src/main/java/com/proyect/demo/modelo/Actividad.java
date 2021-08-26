package com.proyect.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="actividad")
public class Actividad {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idactividad;
	private String titulo;
	private String descripcion;
	private Date fechainicio;
	private Date fechafin;
	private int idmateriacurso;
	
	public Actividad() {
		// TODO Auto-generated constructor stub
	}

	public Actividad(int idactividad, String titulo, String descripcion, Date fechainicio, Date fechafin,
			int idmateriacurso) {
		super();
		this.idactividad = idactividad;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.idmateriacurso = idmateriacurso;
	}

	public int getIdactividad() {
		return idactividad;
	}

	public void setIdactividad(int idactividad) {
		this.idactividad = idactividad;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public Date getFechafin() {
		return fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	public int getIdmateriacurso() {
		return idmateriacurso;
	}

	public void setIdmateriacurso(int idmateriacurso) {
		this.idmateriacurso = idmateriacurso;
	}
	
	
}
