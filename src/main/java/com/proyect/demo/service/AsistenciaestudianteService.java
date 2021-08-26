package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IasistenciaestudianteService;
import com.proyect.demo.interfaces.IAsistenciaestudiante;
import com.proyect.demo.modelo.Asistenciaestudiante;



@Service
public class AsistenciaestudianteService implements IasistenciaestudianteService{

	@Autowired
	private IAsistenciaestudiante data;
	
	@Override
	public List<Asistenciaestudiante> listar() {
		
		return (List<Asistenciaestudiante>)data.findAll();
	}

	@Override
	public Optional<Asistenciaestudiante> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Asistenciaestudiante a) {
		int res=0;
		Asistenciaestudiante aula=data.save(a);
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
