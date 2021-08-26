package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Foroprofesor;

public interface IforoprofesorService {
	public List<Foroprofesor>listar();
	public Optional<Foroprofesor>listarId(int id);
	public int save(Foroprofesor a);
	public void delete(int id);
}
