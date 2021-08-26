package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Actividad;

public interface IactividadService {
	public List<Actividad>listar();
	public Optional<Actividad>listarId(int id);
	public int save(Actividad a);
	public void delete(int id);
}
