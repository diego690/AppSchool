package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IprofesorService;
import com.proyect.demo.interfaces.IProfesor;
import com.proyect.demo.modelo.Profesor;



@Service
public class ProfesorService implements IprofesorService{

	@Autowired
	private IProfesor data;
	
	@Override
	public List<Profesor> listar() {
		
		return (List<Profesor>)data.findAll();
	}

	@Override
	public Optional<Profesor> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Profesor a) {
		int res=0;
		Profesor aula=data.save(a);
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
