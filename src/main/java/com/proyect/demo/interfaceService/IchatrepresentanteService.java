package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Chatrepresentante;


public interface IchatrepresentanteService {
	public List<Chatrepresentante>listar();
	public Optional<Chatrepresentante>listarId(int id);
	public int save(Chatrepresentante a);
	public void delete(int id);
}
