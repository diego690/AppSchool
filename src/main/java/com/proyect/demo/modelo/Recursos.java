package com.proyect.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recursos")
public class Recursos {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idrecursos;
	private String dato;
	private Date fecha;
	private int idmateria;
	private int idtiporecurso;
	
	public Recursos() {
		// TODO Auto-generated constructor stub
	}

	public Recursos(int idrecursos, String dato, Date fecha, int idmateria, int idtiporecurso) {
		super();
		this.idrecursos = idrecursos;
		this.dato = dato;
		this.fecha = fecha;
		this.idmateria = idmateria;
		this.idtiporecurso = idtiporecurso;
	}

	public int getIdrecursos() {
		return idrecursos;
	}

	public void setIdrecursos(int idrecursos) {
		this.idrecursos = idrecursos;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getIdmateria() {
		return idmateria;
	}

	public void setIdmateria(int idmateria) {
		this.idmateria = idmateria;
	}

	public int getIdtiporecurso() {
		return idtiporecurso;
	}

	public void setIdtiporecurso(int idtiporecurso) {
		this.idtiporecurso = idtiporecurso;
	}
	
	
}
