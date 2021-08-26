package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Tiporecurso;


public interface ItiporecursoService {
	public List<Tiporecurso>listar();
	public Optional<Tiporecurso>listarId(int id);
	public int save(Tiporecurso a);
	public void delete(int id);
}
