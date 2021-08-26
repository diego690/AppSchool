package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Nivel;

@Repository
public interface INivel extends CrudRepository<Nivel, Integer>{

}
