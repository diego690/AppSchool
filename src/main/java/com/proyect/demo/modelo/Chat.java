package com.proyect.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chat")
public class Chat {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idchat;
	private String nombrechat;
	
	public Chat() {
		// TODO Auto-generated constructor stub
	}

	public Chat(int idchat, String nombrechat) {
		super();
		this.idchat = idchat;
		this.nombrechat = nombrechat;
	}

	public int getIdchat() {
		return idchat;
	}

	public void setIdchat(int idchat) {
		this.idchat = idchat;
	}

	public String getNombrechat() {
		return nombrechat;
	}

	public void setNombrechat(String nombrechat) {
		this.nombrechat = nombrechat;
	}
	
	
	
	
}
