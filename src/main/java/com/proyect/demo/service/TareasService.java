package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.ItareasService;
import com.proyect.demo.interfaces.ITareas;
import com.proyect.demo.modelo.Tareas;



@Service
public class TareasService implements ItareasService{

	@Autowired
	private ITareas data;
	
	@Override
	public List<Tareas> listar() {
		
		return (List<Tareas>)data.findAll();
	}

	@Override
	public Optional<Tareas> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Tareas a) {
		int res=0;
		Tareas aula=data.save(a);
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
