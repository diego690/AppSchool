package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Pago;


public interface IpagoService {
	public List<Pago>listar();
	public Optional<Pago>listarId(int id);
	public int save(Pago a);
	public void delete(int id);
}
