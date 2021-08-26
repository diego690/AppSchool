package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Asistenciaestudiante;

@Repository
public interface IAsistenciaestudiante extends CrudRepository<Asistenciaestudiante, Integer>{

}
