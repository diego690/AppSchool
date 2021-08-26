package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.ItiporecursoService;
import com.proyect.demo.interfaces.ITiporecurso;
import com.proyect.demo.modelo.Tiporecurso;



@Service
public class TiporecursoService implements ItiporecursoService{

	@Autowired
	private ITiporecurso data;
	
	@Override
	public List<Tiporecurso> listar() {
		
		return (List<Tiporecurso>)data.findAll();
	}

	@Override
	public Optional<Tiporecurso> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Tiporecurso a) {
		int res=0;
		Tiporecurso aula=data.save(a);
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
