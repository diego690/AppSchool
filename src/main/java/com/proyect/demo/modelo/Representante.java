package com.proyect.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="representante")
public class Representante {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idrepresentante;
	private int idusuario;
	private int idpersona;
	
	public Representante() {
		// TODO Auto-generated constructor stub
	}

	public Representante(int idrepresentante, int idusuario, int idpersona) {
		super();
		this.idrepresentante = idrepresentante;
		this.idusuario = idusuario;
		this.idpersona = idpersona;
	}

	public int getIdrepresentante() {
		return idrepresentante;
	}

	public void setIdrepresentante(int idrepresentante) {
		this.idrepresentante = idrepresentante;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	
	
}
