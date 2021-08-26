package com.proyect.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tiporecurso")
public class Tiporecurso {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idtiporecurso;
	private String nombre;
	private String descripcion;
	
	public Tiporecurso() {
		// TODO Auto-generated constructor stub
	}

	public Tiporecurso(int idtiporecurso, String nombre, String descripcion) {
		super();
		this.idtiporecurso = idtiporecurso;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getIdtiporecurso() {
		return idtiporecurso;
	}

	public void setIdtiporecurso(int idtiporecurso) {
		this.idtiporecurso = idtiporecurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
