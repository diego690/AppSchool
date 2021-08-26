package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Curso;


public interface IcursoService {
	public List<Curso>listar();
	public Optional<Curso>listarId(int id);
	public int save(Curso a);
	public void delete(int id);
}
