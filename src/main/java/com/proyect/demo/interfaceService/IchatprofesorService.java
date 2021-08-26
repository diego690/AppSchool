package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Chatprofesor;


public interface IchatprofesorService {
	public List<Chatprofesor>listar();
	public Optional<Chatprofesor>listarId(int id);
	public int save(Chatprofesor a);
	public void delete(int id);
}
