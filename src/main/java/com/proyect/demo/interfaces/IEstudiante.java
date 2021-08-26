package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Estudiante;

@Repository
public interface IEstudiante extends CrudRepository<Estudiante, Integer>{

}
