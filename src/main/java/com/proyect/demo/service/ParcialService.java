package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IparcialService;
import com.proyect.demo.interfaces.IParcial;
import com.proyect.demo.modelo.Parcial;


@Service
public class ParcialService implements IparcialService{

	@Autowired
	private IParcial data;
	
	@Override
	public List<Parcial> listar() {
		
		return (List<Parcial>)data.findAll();
	}

	@Override
	public Optional<Parcial> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Parcial a) {
		int res=0;
		Parcial aula=data.save(a);
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
