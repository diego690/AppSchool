package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IforoService;
import com.proyect.demo.interfaces.IForo;
import com.proyect.demo.modelo.Foro;



@Service
public class ForoService implements IforoService{

	@Autowired
	private IForo data;
	
	@Override
	public List<Foro> listar() {
		
		return (List<Foro>)data.findAll();
	}

	@Override
	public Optional<Foro> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Foro a) {
		int res=0;
		Foro aula=data.save(a);
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
