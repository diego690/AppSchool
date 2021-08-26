package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IquimestreService;
import com.proyect.demo.interfaces.IQuimestre;
import com.proyect.demo.modelo.Quimestre;



@Service
public class QuimestreService implements IquimestreService{

	@Autowired
	private IQuimestre data;
	
	@Override
	public List<Quimestre> listar() {
		
		return (List<Quimestre>)data.findAll();
	}

	@Override
	public Optional<Quimestre> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Quimestre a) {
		int res=0;
		Quimestre aula=data.save(a);
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
