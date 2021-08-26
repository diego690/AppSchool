package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Profesor;

@Repository
public interface IProfesor extends CrudRepository<Profesor, Integer>{

}
