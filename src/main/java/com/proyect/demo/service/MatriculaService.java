package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.ImatriculaService;
import com.proyect.demo.interfaces.IMatricula;
import com.proyect.demo.modelo.Matricula;



@Service
public class MatriculaService implements ImatriculaService{

	@Autowired
	private IMatricula data;
	
	@Override
	public List<Matricula> listar() {
		
		return (List<Matricula>)data.findAll();
	}

	@Override
	public Optional<Matricula> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Matricula a) {
		int res=0;
		Matricula aula=data.save(a);
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
