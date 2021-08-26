package com.proyect.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="foroestudiante")
public class Foroestudiante {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idforo;
	private int idestudiante;
	private String mensaje;
	private Date fecha;
	private int idforoestudiante;
	
	public Foroestudiante() {
		// TODO Auto-generated constructor stub
	}

	public Foroestudiante(int idforo, int idestudiante, String mensaje, Date fecha, int idforoestudiante) {
		super();
		this.idforo = idforo;
		this.idestudiante = idestudiante;
		this.mensaje = mensaje;
		this.fecha = fecha;
		this.idforoestudiante = idforoestudiante;
	}

	public int getIdforo() {
		return idforo;
	}

	public void setIdforo(int idforo) {
		this.idforo = idforo;
	}

	public int getIdestudiante() {
		return idestudiante;
	}

	public void setIdestudiante(int idestudiante) {
		this.idestudiante = idestudiante;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getIdforoestudiante() {
		return idforoestudiante;
	}

	public void setIdforoestudiante(int idforoestudiante) {
		this.idforoestudiante = idforoestudiante;
	}
	
	
}
