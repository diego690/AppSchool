package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Usuario;


public interface IusuarioService {
	public List<Usuario>listar();
	public Optional<Usuario>listarId(int id);
	public int save(Usuario a);
	public void delete(int id);
}
