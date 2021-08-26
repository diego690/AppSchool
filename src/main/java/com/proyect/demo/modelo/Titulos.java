package com.proyect.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="titulos")
public class Titulos {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idtitulos;
	private int idprofesor;
	private String titulacion;
	private String descripcion;
	
	public Titulos() {
		// TODO Auto-generated constructor stub
	}

	public Titulos(int idtitulos, int idprofesor, String titulacion, String descripcion) {
		super();
		this.idtitulos = idtitulos;
		this.idprofesor = idprofesor;
		this.titulacion = titulacion;
		this.descripcion = descripcion;
	}

	public int getIdtitulos() {
		return idtitulos;
	}

	public void setIdtitulos(int idtitulos) {
		this.idtitulos = idtitulos;
	}

	public int getIdprofesor() {
		return idprofesor;
	}

	public void setIdprofesor(int idprofesor) {
		this.idprofesor = idprofesor;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
