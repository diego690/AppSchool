package com.proyect.demo.modelo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="calificacion")
public class Calificacion {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idcalificacion;
	private int idtareas;
	private int idperiodomatricula;
	private double calificacion;
	private String observacion;
	private String Envio;
	
	public Calificacion() {
		// TODO Auto-generated constructor stub
	}

	public Calificacion(int idcalificacion, int idtareas, int idperiodomatricula, double calificacion,
			String observacion, String envio) {
		super();
		this.idcalificacion = idcalificacion;
		this.idtareas = idtareas;
		this.idperiodomatricula = idperiodomatricula;
		this.calificacion = calificacion;
		this.observacion = observacion;
		Envio = envio;
	}

	public int getIdcalificacion() {
		return idcalificacion;
	}

	public void setIdcalificacion(int idcalificacion) {
		this.idcalificacion = idcalificacion;
	}

	public int getIdtareas() {
		return idtareas;
	}

	public void setIdtareas(int idtareas) {
		this.idtareas = idtareas;
	}

	public int getIdperiodomatricula() {
		return idperiodomatricula;
	}

	public void setIdperiodomatricula(int idperiodomatricula) {
		this.idperiodomatricula = idperiodomatricula;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getEnvio() {
		return Envio;
	}

	public void setEnvio(String envio) {
		Envio = envio;
	}
	
	
}
