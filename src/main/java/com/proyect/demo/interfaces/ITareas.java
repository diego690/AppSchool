package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Tareas;

@Repository
public interface ITareas extends CrudRepository<Tareas, Integer>{

}
