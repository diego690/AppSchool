package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Chat;

@Repository
public interface IChat extends CrudRepository<Chat, Integer>{

}
