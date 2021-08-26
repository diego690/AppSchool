package com.proyect.demo.modelo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="asistenciaestudiante")
public class Asistenciaestudiante {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private int idasistencia;
	private int idestudiante;
	private Boolean asistencia;
	
	public Asistenciaestudiante() {
		// TODO Auto-generated constructor stub
	}

	public Asistenciaestudiante(int id, int idasistencia, int idestudiante, Boolean asistencia) {
		super();
		this.id = id;
		this.idasistencia = idasistencia;
		this.idestudiante = idestudiante;
		this.asistencia = asistencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdasistencia() {
		return idasistencia;
	}

	public void setIdasistencia(int idasistencia) {
		this.idasistencia = idasistencia;
	}

	public int getIdestudiante() {
		return idestudiante;
	}

	public void setIdestudiante(int idestudiante) {
		this.idestudiante = idestudiante;
	}

	public Boolean getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(Boolean asistencia) {
		this.asistencia = asistencia;
	}
	
	
}
