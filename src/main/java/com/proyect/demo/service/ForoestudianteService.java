package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IforoestudianteService;
import com.proyect.demo.interfaces.IForoestudiante;
import com.proyect.demo.modelo.Foroestudiante;



@Service
public class ForoestudianteService implements IforoestudianteService{

	@Autowired
	private IForoestudiante data;
	
	@Override
	public List<Foroestudiante> listar() {
		
		return (List<Foroestudiante>)data.findAll();
	}

	@Override
	public Optional<Foroestudiante> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Foroestudiante a) {
		int res=0;
		Foroestudiante aula=data.save(a);
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
