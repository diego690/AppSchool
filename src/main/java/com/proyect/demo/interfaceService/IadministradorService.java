package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Administrador;


public interface IadministradorService {
	public List<Administrador>listar();
	public Optional<Administrador>listarId(int id);
	public int save(Administrador a);
	public void delete(int id);
}
