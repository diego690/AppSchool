package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IestudianteService;
import com.proyect.demo.interfaces.IEstudiante;
import com.proyect.demo.modelo.Estudiante;



@Service
public class EstudianteService implements IestudianteService{

	@Autowired
	private IEstudiante data;
	
	@Override
	public List<Estudiante> listar() {
		
		return (List<Estudiante>)data.findAll();
	}

	@Override
	public Optional<Estudiante> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Estudiante a) {
		int res=0;
		Estudiante aula=data.save(a);
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
