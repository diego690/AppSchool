package com.proyect.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="foroprofesor")
public class Foroprofesor {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idforoprofesor;
	private int idforo;
	private int idprofesor;
	private String mensaje;
	private Date fecha;
	
	public Foroprofesor() {
		// TODO Auto-generated constructor stub
	}

	public Foroprofesor(int idforoprofesor, int idforo, int idprofesor, String mensaje, Date fecha) {
		super();
		this.idforoprofesor = idforoprofesor;
		this.idforo = idforo;
		this.idprofesor = idprofesor;
		this.mensaje = mensaje;
		this.fecha = fecha;
	}

	public int getIdforoprofesor() {
		return idforoprofesor;
	}

	public void setIdforoprofesor(int idforoprofesor) {
		this.idforoprofesor = idforoprofesor;
	}

	public int getIdforo() {
		return idforo;
	}

	public void setIdforo(int idforo) {
		this.idforo = idforo;
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
