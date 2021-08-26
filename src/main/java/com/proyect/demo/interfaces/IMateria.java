package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Materia;

@Repository
public interface IMateria extends CrudRepository<Materia, Integer>{

}
