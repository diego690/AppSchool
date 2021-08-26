package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Estudiante;


public interface IestudianteService {
	public List<Estudiante>listar();
	public Optional<Estudiante>listarId(int id);
	public int save(Estudiante a);
	public void delete(int id);
}
