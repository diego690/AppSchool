package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Foroestudiante;

public interface IforoestudianteService {
	public List<Foroestudiante>listar();
	public Optional<Foroestudiante>listarId(int id);
	public int save(Foroestudiante a);
	public void delete(int id);
}
