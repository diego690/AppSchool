package com.proyect.demo.modelo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idcurso;
	private int idnivel;
	private int idprofesor;
	private int cantidad;
	private String paralelo;
	
	public Curso() {
		// TODO Auto-generated constructor stub
	}

	public Curso(int idcurso, int idnivel, int idprofesor, int cantidad, String paralelo) {
		super();
		this.idcurso = idcurso;
		this.idnivel = idnivel;
		this.idprofesor = idprofesor;
		this.cantidad = cantidad;
		this.paralelo = paralelo;
	}

	public int getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public int getIdnivel() {
		return idnivel;
	}

	public void setIdnivel(int idnivel) {
		this.idnivel = idnivel;
	}

	public int getIdprofesor() {
		return idprofesor;
	}

	public void setIdprofesor(int idprofesor) {
		this.idprofesor = idprofesor;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getParalelo() {
		return paralelo;
	}

	public void setParalelo(String paralelo) {
		this.paralelo = paralelo;
	}
	
	
}
