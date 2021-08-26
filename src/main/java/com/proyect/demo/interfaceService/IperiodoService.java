package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Periodo;


public interface IperiodoService {
	public List<Periodo>listar();
	public Optional<Periodo>listarId(int id);
	public int save(Periodo a);
	public void delete(int id);
}
