package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IperiodoService;
import com.proyect.demo.interfaces.IPeriodo;
import com.proyect.demo.modelo.Periodo;



@Service
public class PeriodoService implements IperiodoService{

	@Autowired
	private IPeriodo data;
	
	@Override
	public List<Periodo> listar() {
		
		return (List<Periodo>)data.findAll();
	}

	@Override
	public Optional<Periodo> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Periodo a) {
		int res=0;
		Periodo aula=data.save(a);
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
