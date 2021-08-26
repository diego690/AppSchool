package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Chatprofesor;

@Repository
public interface IChatprofesor extends CrudRepository<Chatprofesor, Integer>{

}
