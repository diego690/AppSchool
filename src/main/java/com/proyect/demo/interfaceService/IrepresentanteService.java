package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Representante;


public interface IrepresentanteService {
	public List<Representante>listar();
	public Optional<Representante>listarId(int id);
	public int save(Representante a);
	public void delete(int id);
}
