package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.InivelService;
import com.proyect.demo.interfaces.INivel;
import com.proyect.demo.modelo.Nivel;



@Service
public class NivelService implements InivelService{
 
	@Autowired
	public INivel data;
	
	@Override
	public List<Nivel> listar() {
		// TODO Auto-generated method stub
		return (List<Nivel>)data.findAll();
	}

	@Override
	public Optional<Nivel> listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public int save(Nivel n) {
		int res=0;
		Nivel aula=data.save(n);
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
