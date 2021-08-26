package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IrepresentanteService;
import com.proyect.demo.interfaces.IRepresentante;
import com.proyect.demo.modelo.Representante;



@Service
public class RepresentanteService implements IrepresentanteService{

	@Autowired
	private IRepresentante data;
	
	@Override
	public List<Representante> listar() {
		
		return (List<Representante>)data.findAll();
	}

	@Override
	public Optional<Representante> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Representante a) {
		int res=0;
		Representante aula=data.save(a);
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
