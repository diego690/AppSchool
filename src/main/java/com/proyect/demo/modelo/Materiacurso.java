package com.proyect.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="materiacurso")
public class Materiacurso {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idmateriacurso;
	private int idcurso;
	private String nombre;
	private String descripcion;
	private int idmateria;
	
	public Materiacurso() {
		// TODO Auto-generated constructor stub
	}

	public Materiacurso(int idmateriacurso, int idcurso, String nombre, String descripcion, int idmateria) {
		super();
		this.idmateriacurso = idmateriacurso;
		this.idcurso = idcurso;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.idmateria = idmateria;
	}

	public int getIdmateriacurso() {
		return idmateriacurso;
	}

	public void setIdmateriacurso(int idmateriacurso) {
		this.idmateriacurso = idmateriacurso;
	}

	public int getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
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

	public int getIdmateria() {
		return idmateria;
	}

	public void setIdmateria(int idmateria) {
		this.idmateria = idmateria;
	}
	
	
}
