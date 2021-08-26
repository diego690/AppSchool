package com.proyect.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pago")
public class Pago {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idpago;
	private Date fecha;
	private double valor;
	private String tipo;
	private int idperiodomatriculacurso;
	private String evidencia;
	
	public Pago() {
		// TODO Auto-generated constructor stub
	}

	public Pago(int idpago, Date fecha, double valor, String tipo, int idperiodomatriculacurso, String evidencia) {
		super();
		this.idpago = idpago;
		this.fecha = fecha;
		this.valor = valor;
		this.tipo = tipo;
		this.idperiodomatriculacurso = idperiodomatriculacurso;
		this.evidencia = evidencia;
	}

	public int getIdpago() {
		return idpago;
	}

	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIdperiodomatriculacurso() {
		return idperiodomatriculacurso;
	}

	public void setIdperiodomatriculacurso(int idperiodomatriculacurso) {
		this.idperiodomatriculacurso = idperiodomatriculacurso;
	}

	public String getEvidencia() {
		return evidencia;
	}

	public void setEvidencia(String evidencia) {
		this.evidencia = evidencia;
	}
	
	
}
