package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IactividadService;
import com.proyect.demo.interfaces.IActividad;
import com.proyect.demo.modelo.Actividad;

@Service
public class ActividadService implements IactividadService{

	@Autowired
	private IActividad data;
	
	@Override
	public List<Actividad> listar() {
		return (List<Actividad>)data.findAll();
	}

	@Override
	public Optional<Actividad> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Actividad a) {
		int res=0;
		Actividad activ=data.save(a);
		if(!activ.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}


}
