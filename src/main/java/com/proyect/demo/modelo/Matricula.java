package com.proyect.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="matricula")
public class Matricula {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idmatricula;
	private String numero;
	private String evidencia;
	private boolean estado;
	
	public Matricula() {
		// TODO Auto-generated constructor stub
	}

	public Matricula(int idmatricula, String numero, String evidencia, boolean estado) {
		super();
		this.idmatricula = idmatricula;
		this.numero = numero;
		this.evidencia = evidencia;
		this.estado = estado;
	}

	public int getIdmatricula() {
		return idmatricula;
	}

	public void setIdmatricula(int idmatricula) {
		this.idmatricula = idmatricula;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEvidencia() {
		return evidencia;
	}

	public void setEvidencia(String evidencia) {
		this.evidencia = evidencia;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}
