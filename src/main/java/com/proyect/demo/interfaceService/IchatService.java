package com.proyect.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyect.demo.modelo.Chat;


public interface IchatService {
	public List<Chat>listar();
	public Optional<Chat>listarId(int id);
	public int save(Chat a);
	public void delete(int id);
}
