package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.ItipousuarioService;
import com.proyect.demo.interfaces.ITipousuario;
import com.proyect.demo.modelo.Tipousuario;



@Service
public class TipousuarioService implements ItipousuarioService{

	@Autowired
	private ITipousuario data;
	
	@Override
	public List<Tipousuario> listar() {
		
		return (List<Tipousuario>)data.findAll();
	}

	@Override
	public Optional<Tipousuario> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Tipousuario a) {
		int res=0;
		Tipousuario aula=data.save(a);
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
