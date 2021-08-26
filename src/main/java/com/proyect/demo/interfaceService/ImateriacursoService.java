package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Materiacurso;


public interface ImateriacursoService {
	public List<Materiacurso>listar();
	public Optional<Materiacurso>listarId(int id);
	public int save(Materiacurso a);
	public void delete(int id);
}
