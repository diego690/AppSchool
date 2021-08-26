package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Titulos;

@Repository
public interface ITitulos extends CrudRepository<Titulos, Integer>{

}
