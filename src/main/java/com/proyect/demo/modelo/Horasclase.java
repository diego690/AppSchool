package com.proyect.demo.modelo;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="horasclase")
public class Horasclase {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idhoras;
	private int idmateriacurso;
	private String dia;
	private Time horainicio;
	private Time horafin;
	
	public Horasclase() {
		// TODO Auto-generated constructor stub
	}

	public Horasclase(int idhoras, int idmateriacurso, String dia, Time horainicio, Time horafin) {
		super();
		this.idhoras = idhoras;
		this.idmateriacurso = idmateriacurso;
		this.dia = dia;
		this.horainicio = horainicio;
		this.horafin = horafin;
	}

	public int getIdhoras() {
		return idhoras;
	}

	public void setIdhoras(int idhoras) {
		this.idhoras = idhoras;
	}

	public int getIdmateriacurso() {
		return idmateriacurso;
	}

	public void setIdmateriacurso(int idmateriacurso) {
		this.idmateriacurso = idmateriacurso;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Time getHorainicio() {
		return horainicio;
	}

	public void setHorainicio(Time horainicio) {
		this.horainicio = horainicio;
	}

	public Time getHorafin() {
		return horafin;
	}

	public void setHorafin(Time horafin) {
		this.horafin = horafin;
	}
	
	
}
