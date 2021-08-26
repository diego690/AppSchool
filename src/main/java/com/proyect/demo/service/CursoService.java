package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IcursoService;
import com.proyect.demo.interfaces.ICurso;
import com.proyect.demo.modelo.Curso;



@Service
public class CursoService implements IcursoService{

	@Autowired
	private ICurso data;
	
	@Override
	public List<Curso> listar() {
		
		return (List<Curso>)data.findAll();
	}

	@Override
	public Optional<Curso> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Curso a) {
		int res=0;
		Curso aula=data.save(a);
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
