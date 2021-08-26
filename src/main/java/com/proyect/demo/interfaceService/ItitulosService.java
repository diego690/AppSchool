package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Titulos;


public interface ItitulosService {
	public List<Titulos>listar();
	public Optional<Titulos>listarId(int id);
	public int save(Titulos a);
	public void delete(int id);
}
