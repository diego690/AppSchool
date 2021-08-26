package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IforoprofesorService;
import com.proyect.demo.interfaces.IForoprofesor;
import com.proyect.demo.modelo.Foroprofesor;



@Service
public class ForoprofesorService implements IforoprofesorService{

	@Autowired
	private IForoprofesor data;
	
	@Override
	public List<Foroprofesor> listar() {
		
		return (List<Foroprofesor>)data.findAll();
	}

	@Override
	public Optional<Foroprofesor> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Foroprofesor a) {
		int res=0;
		Foroprofesor aula=data.save(a);
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
