package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IadministradorService;
import com.proyect.demo.interfaces.IAdministrador;
import com.proyect.demo.modelo.Administrador;



@Service
public class AdministradorService implements IadministradorService{

	@Autowired
	private IAdministrador data;
	
	@Override
	public List<Administrador> listar() {
		
		return (List<Administrador>)data.findAll();
	}

	@Override
	public Optional<Administrador> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Administrador a) {
		int res=0;
		Administrador admin=data.save(a);
		if(!admin.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);	
	}

}
