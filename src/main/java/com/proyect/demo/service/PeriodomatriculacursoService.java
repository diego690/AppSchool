package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IperiodomatriculacursoService;
import com.proyect.demo.interfaces.IPeriodomatricula;
import com.proyect.demo.modelo.Periodomatriculacurso;



@Service
public class PeriodomatriculacursoService implements IperiodomatriculacursoService{

	@Autowired
	private IPeriodomatricula data;
	
	@Override
	public List<Periodomatriculacurso> listar() {
		
		return (List<Periodomatriculacurso>)data.findAll();
	}

	@Override
	public Optional<Periodomatriculacurso> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Periodomatriculacurso a) {
		int res=0;
		Periodomatriculacurso aula=data.save(a);
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
