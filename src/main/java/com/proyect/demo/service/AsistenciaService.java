package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IasistenciaService;
import com.proyect.demo.interfaces.IAsistencia;
import com.proyect.demo.modelo.Asistencia;


@Service
public class AsistenciaService implements IasistenciaService{

	@Autowired
	private IAsistencia data;
	
	@Override
	public List<Asistencia> listar() {
		
		return (List<Asistencia>)data.findAll();
	}

	@Override
	public Optional<Asistencia> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Asistencia a) {
		int res=0;
		Asistencia aula=data.save(a);
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
