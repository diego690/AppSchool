package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Foro;

public interface IforoService {
	public List<Foro>listar();
	public Optional<Foro>listarId(int id);
	public int save(Foro a);
	public void delete(int id);
}
