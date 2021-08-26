package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Parcial;

@Repository
public interface IParcial extends CrudRepository<Parcial, Integer>{

}
