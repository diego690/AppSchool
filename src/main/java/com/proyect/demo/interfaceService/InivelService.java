package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Nivel;


public interface InivelService {
	public List<Nivel>listar();
	public Optional<Nivel>listarId(int id);
	public int save(Nivel n);
	public void delete(int id);
}
