package com.proyect.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parcial")
public class Parcial {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idparcial;
	private int idquimestre;
	private Date fechainicio;
	private Date fechafin;
	
	public Parcial() {
		// TODO Auto-generated constructor stub
	}

	public Parcial(int idparcial, int idquimestre, Date fechainicio, Date fechafin) {
		super();
		this.idparcial = idparcial;
		this.idquimestre = idquimestre;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
	}

	public int getIdparcial() {
		return idparcial;
	}

	public void setIdparcial(int idparcial) {
		this.idparcial = idparcial;
	}

	public int getIdquimestre() {
		return idquimestre;
	}

	public void setIdquimestre(int idquimestre) {
		this.idquimestre = idquimestre;
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
	
	
}
