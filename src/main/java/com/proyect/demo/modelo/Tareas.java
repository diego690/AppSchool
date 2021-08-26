package com.proyect.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tareas")
public class Tareas {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idtareas;
	private int idactividad;
	private int idparcial;
	private boolean requiereenvio;
	private String estado;
	private String recurso;
	
	public Tareas() {
		// TODO Auto-generated constructor stub
	}

	public Tareas(int idtareas, int idactividad, int idparcial, boolean requiereenvio, String estado, String recurso) {
		super();
		this.idtareas = idtareas;
		this.idactividad = idactividad;
		this.idparcial = idparcial;
		this.requiereenvio = requiereenvio;
		this.estado = estado;
		this.recurso = recurso;
	}

	public int getIdtareas() {
		return idtareas;
	}

	public void setIdtareas(int idtareas) {
		this.idtareas = idtareas;
	}

	public int getIdactividad() {
		return idactividad;
	}

	public void setIdactividad(int idactividad) {
		this.idactividad = idactividad;
	}

	public int getIdparcial() {
		return idparcial;
	}

	public void setIdparcial(int idparcial) {
		this.idparcial = idparcial;
	}

	public boolean isRequiereenvio() {
		return requiereenvio;
	}

	public void setRequiereenvio(boolean requiereenvio) {
		this.requiereenvio = requiereenvio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getRecurso() {
		return recurso;
	}

	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}
	
	
}
