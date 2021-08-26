package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.IchatService;
import com.proyect.demo.interfaces.IChat;
import com.proyect.demo.modelo.Chat;



@Service
public class ChatService implements IchatService{

	@Autowired
	private IChat data;
	
	@Override
	public List<Chat> listar() {
		
		return (List<Chat>)data.findAll();
	}

	@Override
	public Optional<Chat> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Chat a) {
		int res=0;
		Chat aula=data.save(a);
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
