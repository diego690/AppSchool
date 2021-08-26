package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Horasclase;

public interface IhorasclaseService {
	public List<Horasclase>listar();
	public Optional<Horasclase>listarId(int id);
	public int save(Horasclase a);
	public void delete(int id);
}
