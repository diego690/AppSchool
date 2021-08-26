package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Quimestre;


public interface IquimestreService {
	public List<Quimestre>listar();
	public Optional<Quimestre>listarId(int id);
	public int save(Quimestre a);
	public void delete(int id);
}
