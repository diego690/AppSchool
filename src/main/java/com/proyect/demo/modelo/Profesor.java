package com.proyect.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profesor")
public class Profesor {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idprofesor;
	private int idpersona;
	private int idusuario;
	
	public Profesor() {
		// TODO Auto-generated constructor stub
	}

	public Profesor(int idprofesor, int idpersona, int idusuario) {
		super();
		this.idprofesor = idprofesor;
		this.idpersona = idpersona;
		this.idusuario = idusuario;
	}

	public int getIdprofesor() {
		return idprofesor;
	}

	public void setIdprofesor(int idprofesor) {
		this.idprofesor = idprofesor;
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
	
	
}
