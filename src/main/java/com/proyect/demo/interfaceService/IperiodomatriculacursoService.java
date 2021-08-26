package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Periodomatriculacurso;


public interface IperiodomatriculacursoService {
	public List<Periodomatriculacurso>listar();
	public Optional<Periodomatriculacurso>listarId(int id);
	public int save(Periodomatriculacurso a);
	public void delete(int id);
}
