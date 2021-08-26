package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IhorasclaseService;
import com.proyect.demo.interfaces.IHorasclase;
import com.proyect.demo.modelo.Horasclase;



@Service
public class HoraclaseService implements IhorasclaseService{

	@Autowired
	private IHorasclase data;
	
	@Override
	public List<Horasclase> listar() {
		
		return (List<Horasclase>)data.findAll();
	}

	@Override
	public Optional<Horasclase> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Horasclase a) {
		int res=0;
		Horasclase aula=data.save(a);
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
