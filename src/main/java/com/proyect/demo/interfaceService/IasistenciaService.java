package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Asistencia;



public interface IasistenciaService {
	public List<Asistencia>listar();
	public Optional<Asistencia>listarId(int id);
	public int save(Asistencia a);
	public void delete(int id);
}
