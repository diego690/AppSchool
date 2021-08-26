package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Matricula;

@Repository
public interface IMatricula extends CrudRepository<Matricula, Integer>{

}
