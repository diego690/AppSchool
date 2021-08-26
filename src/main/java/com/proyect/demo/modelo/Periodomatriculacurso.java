package com.proyect.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="periodomatriculacurso")
public class Periodomatriculacurso {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idperiodomatricula;
	private int idperiodo;
	private int idmatricula;
	private int idcurso;
	
	public Periodomatriculacurso() {
		// TODO Auto-generated constructor stub
	}

	public Periodomatriculacurso(int idperiodomatricula, int idperiodo, int idmatricula, int idcurso) {
		super();
		this.idperiodomatricula = idperiodomatricula;
		this.idperiodo = idperiodo;
		this.idmatricula = idmatricula;
		this.idcurso = idcurso;
	}

	public int getIdperiodomatricula() {
		return idperiodomatricula;
	}

	public void setIdperiodomatricula(int idperiodomatricula) {
		this.idperiodomatricula = idperiodomatricula;
	}

	public int getIdperiodo() {
		return idperiodo;
	}

	public void setIdperiodo(int idperiodo) {
		this.idperiodo = idperiodo;
	}

	public int getIdmatricula() {
		return idmatricula;
	}

	public void setIdmatricula(int idmatricula) {
		this.idmatricula = idmatricula;
	}

	public int getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}
	
	
}
