package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IpersonaService;
import com.proyect.demo.interfaces.IPersona;
import com.proyect.demo.modelo.Persona;



@Service
public class PersonaService implements IpersonaService{

	@Autowired
	private IPersona data;
	
	@Override
	public List<Persona> listar() {
		
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Persona a) {
		int res=0;
		Persona aula=data.save(a);
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
