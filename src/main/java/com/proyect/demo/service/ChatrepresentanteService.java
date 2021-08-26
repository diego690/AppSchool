package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IchatrepresentanteService;
import com.proyect.demo.interfaces.IChatrepresentante;
import com.proyect.demo.modelo.Chatrepresentante;



@Service
public class ChatrepresentanteService implements IchatrepresentanteService{

	@Autowired
	private IChatrepresentante data;
	
	@Override
	public List<Chatrepresentante> listar() {
		
		return (List<Chatrepresentante>)data.findAll();
	}

	@Override
	public Optional<Chatrepresentante> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Chatrepresentante a) {
		int res=0;
		Chatrepresentante aula=data.save(a);
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
