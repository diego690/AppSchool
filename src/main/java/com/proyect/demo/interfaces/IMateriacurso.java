package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Materiacurso;

@Repository
public interface IMateriacurso extends CrudRepository<Materiacurso, Integer>{

}
