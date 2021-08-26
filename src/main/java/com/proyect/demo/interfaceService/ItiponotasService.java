package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Tiponota;


public interface ItiponotasService {
	public List<Tiponota>listar();
	public Optional<Tiponota>listarId(int id);
	public int save(Tiponota a);
	public void delete(int id);
}
