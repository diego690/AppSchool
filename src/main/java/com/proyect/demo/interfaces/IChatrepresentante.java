package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Chatrepresentante;

@Repository
public interface IChatrepresentante extends CrudRepository<Chatrepresentante, Integer>{

}
