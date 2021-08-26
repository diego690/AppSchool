package com.proyect.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="periodo")
public class Periodo {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idperiodo;
	private Date fechainicio;
	private Date fechafin;
	private String estado;
	
	public Periodo() {
		// TODO Auto-generated constructor stub
	}

	public Periodo(int idperiodo, Date fechainicio, Date fechafin, String estado) {
		super();
		this.idperiodo = idperiodo;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.estado = estado;
	}

	public int getIdperiodo() {
		return idperiodo;
	}

	public void setIdperiodo(int idperiodo) {
		this.idperiodo = idperiodo;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
