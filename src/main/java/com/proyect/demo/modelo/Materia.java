package com.proyect.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="materia")
public class Materia {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idmateria;
	private String nombre;
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}

	public Materia(int idmateria, String nombre) {
		super();
		this.idmateria = idmateria;
		this.nombre = nombre;
	}

	public int getIdmateria() {
		return idmateria;
	}

	public void setIdmateria(int idmateria) {
		this.idmateria = idmateria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
