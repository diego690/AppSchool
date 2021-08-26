package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Tipousuario;


public interface ItipousuarioService {
	public List<Tipousuario>listar();
	public Optional<Tipousuario>listarId(int id);
	public int save(Tipousuario a);
	public void delete(int id);
}
