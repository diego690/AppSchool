package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Tareas;


public interface ItareasService {
	public List<Tareas>listar();
	public Optional<Tareas>listarId(int id);
	public int save(Tareas a);
	public void delete(int id);
}
