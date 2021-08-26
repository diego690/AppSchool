package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.ItiponotasService;
import com.proyect.demo.interfaces.ITiponotas;
import com.proyect.demo.modelo.Tiponota;



@Service
public class TiponotasService implements ItiponotasService{

	@Autowired
	private ITiponotas data;
	
	@Override
	public List<Tiponota> listar() {
		
		return (List<Tiponota>)data.findAll();
	}

	@Override
	public Optional<Tiponota> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Tiponota a) {
		int res=0;
		Tiponota aula=data.save(a);
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
