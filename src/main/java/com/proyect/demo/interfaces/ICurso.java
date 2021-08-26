package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Curso;

@Repository
public interface ICurso extends CrudRepository<Curso, Integer>{

}
