package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Representante;

@Repository
public interface IRepresentante extends CrudRepository<Representante, Integer>{

}
