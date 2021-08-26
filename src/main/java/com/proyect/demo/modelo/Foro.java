package com.proyect.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="foro")
public class Foro {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idforo;
	private int idactividad;
	
	public Foro() {
		// TODO Auto-generated constructor stub
	}

	public Foro(int idforo, int idactividad) {
		super();
		this.idforo = idforo;
		this.idactividad = idactividad;
	}

	public int getIdforo() {
		return idforo;
	}

	public void setIdforo(int idforo) {
		this.idforo = idforo;
	}

	public int getIdactividad() {
		return idactividad;
	}

	public void setIdactividad(int idactividad) {
		this.idactividad = idactividad;
	}
	
	
}
