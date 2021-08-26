package com.proyect.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nivel")
public class Nivel {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idnivel;
	private String grado;
	
	public Nivel() {
		// TODO Auto-generated constructor stub
	}

	public Nivel(int idnivel, String grado) {
		super();
		this.idnivel = idnivel;
		this.grado = grado;
	}

	public int getIdnivel() {
		return idnivel;
	}

	public void setIdnivel(int idnivel) {
		this.idnivel = idnivel;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}
	
	
}
