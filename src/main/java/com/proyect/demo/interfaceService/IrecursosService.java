package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Recursos;


public interface IrecursosService {
	public List<Recursos>listar();
	public Optional<Recursos>listarId(int id);
	public int save(Recursos a);
	public void delete(int id);
}
