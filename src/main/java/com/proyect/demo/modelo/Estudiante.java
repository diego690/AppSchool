package com.proyect.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudiante")
public class Estudiante {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idestudiante;
	private int idmatricula;
	private int idpersona;
	private int idusuario;
	private int idrepresentante;
	
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}

	public Estudiante(int idestudiante, int idmatricula, int idpersona, int idusuario, int idrepresentante) {
		super();
		this.idestudiante = idestudiante;
		this.idmatricula = idmatricula;
		this.idpersona = idpersona;
		this.idusuario = idusuario;
		this.idrepresentante = idrepresentante;
	}

	public int getIdestudiante() {
		return idestudiante;
	}

	public void setIdestudiante(int idestudiante) {
		this.idestudiante = idestudiante;
	}

	public int getIdmatricula() {
		return idmatricula;
	}

	public void setIdmatricula(int idmatricula) {
		this.idmatricula = idmatricula;
	}

	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public int getIdrepresentante() {
		return idrepresentante;
	}

	public void setIdrepresentante(int idrepresentante) {
		this.idrepresentante = idrepresentante;
	}
	
	
}
