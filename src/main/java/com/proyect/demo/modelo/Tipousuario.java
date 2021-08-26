package com.proyect.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipousuario")
public class Tipousuario {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idtipousu;
	private String nombre;
	private String descripcion;
	
	public Tipousuario() {
		// TODO Auto-generated constructor stub
	}

	public Tipousuario(int idtipousu, String nombre, String descripcion) {
		super();
		this.idtipousu = idtipousu;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getIdtipousu() {
		return idtipousu;
	}

	public void setIdtipousu(int idtipousu) {
		this.idtipousu = idtipousu;
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
