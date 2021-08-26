package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IpagoService;
import com.proyect.demo.interfaces.IPago;
import com.proyect.demo.modelo.Pago;



@Service
public class PagoService implements IpagoService{

	@Autowired
	private IPago data;
	
	@Override
	public List<Pago> listar() {
		
		return (List<Pago>)data.findAll();
	}

	@Override
	public Optional<Pago> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Pago a) {
		int res=0;
		Pago aula=data.save(a);
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
