package com.proyect.demo.modelo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="administrador")
public class Administrador {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idadministrador;
	private int idpersona;
	private int idusuario;
	
	public Administrador() {
		// TODO Auto-generated constructor stub
	}

	public Administrador(int idadministrador, int idpersona, int idusuario) {
		super();
		this.idadministrador = idadministrador;
		this.idpersona = idpersona;
		this.idusuario = idusuario;
	}

	public int getIdadministrador() {
		return idadministrador;
	}

	public void setIdadministrador(int idadministrador) {
		this.idadministrador = idadministrador;
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
