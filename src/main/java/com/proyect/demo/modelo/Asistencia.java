package com.proyect.demo.modelo;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="asistencia")
public class Asistencia {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idasistencia;
	private Date fecha;
	private int idmateriacurso;
	
	public Asistencia() {
		// TODO Auto-generated constructor stub
	}

	public Asistencia(int idasistencia, Date fecha, int idmateriacurso) {
		super();
		this.idasistencia = idasistencia;
		this.fecha = fecha;
		this.idmateriacurso = idmateriacurso;
	}

	public int getIdasistencia() {
		return idasistencia;
	}

	public void setIdasistencia(int idasistencia) {
		this.idasistencia = idasistencia;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getIdmateriacurso() {
		return idmateriacurso;
	}

	public void setIdmateriacurso(int idmateriacurso) {
		this.idmateriacurso = idmateriacurso;
	}
	
	
	
	
}
