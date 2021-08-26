package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.ImateriaService;
import com.proyect.demo.interfaces.IMateria;
import com.proyect.demo.modelo.Materia;



@Service
public class MateriaService implements ImateriaService{

	@Autowired
	private IMateria data;
	
	@Override
	public List<Materia> listar() {
		
		return (List<Materia>)data.findAll();
	}

	@Override
	public Optional<Materia> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Materia a) {
		int res=0;
		Materia aula=data.save(a);
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
