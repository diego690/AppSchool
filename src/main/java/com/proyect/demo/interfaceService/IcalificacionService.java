package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Calificacion;



public interface IcalificacionService {
	public List<Calificacion>listar();
	public Optional<Calificacion>listarId(int id);
	public int save(Calificacion a);
	public void delete(int id);
}
