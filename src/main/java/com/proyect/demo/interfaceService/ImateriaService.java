package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Materia;


public interface ImateriaService {
	public List<Materia>listar();
	public Optional<Materia>listarId(int id);
	public int save(Materia a);
	public void delete(int id);
}
