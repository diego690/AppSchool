package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Asistenciaestudiante;


public interface IasistenciaestudianteService {
	public List<Asistenciaestudiante>listar();
	public Optional<Asistenciaestudiante>listarId(int id);
	public int save(Asistenciaestudiante a);
	public void delete(int id);
}
