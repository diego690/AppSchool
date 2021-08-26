package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Asistencia;

@Repository
public interface IAsistencia extends CrudRepository<Asistencia, Integer>{

}
