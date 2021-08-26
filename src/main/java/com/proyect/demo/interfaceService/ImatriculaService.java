package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Matricula;


public interface ImatriculaService {
	public List<Matricula>listar();
	public Optional<Matricula>listarId(int id);
	public int save(Matricula a);
	public void delete(int id);
}
