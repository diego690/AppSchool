package com.proyect.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chatprofesor")
public class Chatprofesor {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idchatprofesor;
	private int idchat;
	private int idprofesor;
	private String mensaje;
	private Date fecha;
	
	public Chatprofesor() {
		// TODO Auto-generated constructor stub
	}

	public Chatprofesor(int idchatprofesor, int idchat, int idprofesor, String mensaje, Date fecha) {
		super();
		this.idchatprofesor = idchatprofesor;
		this.idchat = idchat;
		this.idprofesor = idprofesor;
		this.mensaje = mensaje;
		this.fecha = fecha;
	}

	public int getIdchatprofesor() {
		return idchatprofesor;
	}

	public void setIdchatprofesor(int idchatprofesor) {
		this.idchatprofesor = idchatprofesor;
	}

	public int getIdchat() {
		return idchat;
	}

	public void setIdchat(int idchat) {
		this.idchat = idchat;
	}

	public int getIdprofesor() {
		return idprofesor;
	}

	public void setIdprofesor(int idprofesor) {
		this.idprofesor = idprofesor;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
