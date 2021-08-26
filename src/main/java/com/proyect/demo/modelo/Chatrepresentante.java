package com.proyect.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chatrepresentante")
public class Chatrepresentante {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idchatrepresentante;
	private int idrepresentante;
	private int idchat;
	private String mensaje;
	private Date fecha;
	
	public Chatrepresentante() {
		// TODO Auto-generated constructor stub
	}

	public Chatrepresentante(int idchatrepresentante, int idrepresentante, int idchat, String mensaje, Date fecha) {
		super();
		this.idchatrepresentante = idchatrepresentante;
		this.idrepresentante = idrepresentante;
		this.idchat = idchat;
		this.mensaje = mensaje;
		this.fecha = fecha;
	}

	public int getIdchatrepresentante() {
		return idchatrepresentante;
	}

	public void setIdchatrepresentante(int idchatrepresentante) {
		this.idchatrepresentante = idchatrepresentante;
	}

	public int getIdrepresentante() {
		return idrepresentante;
	}

	public void setIdrepresentante(int idrepresentante) {
		this.idrepresentante = idrepresentante;
	}

	public int getIdchat() {
		return idchat;
	}

	public void setIdchat(int idchat) {
		this.idchat = idchat;
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
