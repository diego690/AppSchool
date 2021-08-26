package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Calificacion;

@Repository
public interface ICalificacion extends CrudRepository<Calificacion, Integer>{

}
