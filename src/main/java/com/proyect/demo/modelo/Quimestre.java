package com.proyect.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quimestre")
public class Quimestre {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idquimestre;
	private int idperiodo;
	private Date fechainicio;
	private Date fechafin;
	
	public Quimestre() {
		// TODO Auto-generated constructor stub
	}

	public Quimestre(int idquimestre, int idperiodo, Date fechainicio, Date fechafin) {
		super();
		this.idquimestre = idquimestre;
		this.idperiodo = idperiodo;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
	}

	public int getIdquimestre() {
		return idquimestre;
	}

	public void setIdquimestre(int idquimestre) {
		this.idquimestre = idquimestre;
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
	
	
}
