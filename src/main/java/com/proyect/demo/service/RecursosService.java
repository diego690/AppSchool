package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IrecursosService;
import com.proyect.demo.interfaces.IRecursos;
import com.proyect.demo.modelo.Recursos;



@Service
public class RecursosService implements IrecursosService{

	@Autowired
	private IRecursos data;
	
	@Override
	public List<Recursos> listar() {
		
		return (List<Recursos>)data.findAll();
	}

	@Override
	public Optional<Recursos> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Recursos a) {
		int res=0;
		Recursos aula=data.save(a);
		if(!aula.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);	
	}

}
