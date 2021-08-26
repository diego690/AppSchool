package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.ItitulosService;
import com.proyect.demo.interfaces.ITitulos;
import com.proyect.demo.modelo.Titulos;



@Service
public class TitulosService implements ItitulosService{

	@Autowired
	private ITitulos data;
	
	@Override
	public List<Titulos> listar() {
		
		return (List<Titulos>)data.findAll();
	}

	@Override
	public Optional<Titulos> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Titulos a) {
		int res=0;
		Titulos aula=data.save(a);
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
