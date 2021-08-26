package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Parcial;


public interface IparcialService {
	public List<Parcial>listar();
	public Optional<Parcial>listarId(int id);
	public int save(Parcial a);
	public void delete(int id);
}
