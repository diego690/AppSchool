package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IchatprofesorService;
import com.proyect.demo.interfaces.IChatprofesor;
import com.proyect.demo.modelo.Chatprofesor;



@Service
public class ChatprofesorService implements IchatprofesorService{

	@Autowired
	private IChatprofesor data;
	
	@Override
	public List<Chatprofesor> listar() {
		
		return (List<Chatprofesor>)data.findAll();
	}

	@Override
	public Optional<Chatprofesor> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Chatprofesor a) {
		int res=0;
		Chatprofesor aula=data.save(a);
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
