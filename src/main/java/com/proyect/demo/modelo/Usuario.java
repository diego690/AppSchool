package com.proyect.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idusuario;
	private String cuenta;
	private String contrasena;
	private int idtipousu;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(int idusuario, String cuenta, String contrasena, int idtipousu) {
		super();
		this.idusuario = idusuario;
		this.cuenta = cuenta;
		this.contrasena = contrasena;
		this.idtipousu = idtipousu;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public int getIdtipousu() {
		return idtipousu;
	}

	public void setIdtipousu(int idtipousu) {
		this.idtipousu = idtipousu;
	}
	
	
}
