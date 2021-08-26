package com.proyect.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tiponotas")
public class Tiponota {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idnotas;
	private int idtareas;
	private String nombre;
	private String descripcion;
	
	public Tiponota() {
		// TODO Auto-generated constructor stub
	}

	public Tiponota(int idnotas, int idtareas, String nombre, String descripcion) {
		super();
		this.idnotas = idnotas;
		this.idtareas = idtareas;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getIdnotas() {
		return idnotas;
	}

	public void setIdnotas(int idnotas) {
		this.idnotas = idnotas;
	}

	public int getIdtareas() {
		return idtareas;
	}

	public void setIdtareas(int idtareas) {
		this.idtareas = idtareas;
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
