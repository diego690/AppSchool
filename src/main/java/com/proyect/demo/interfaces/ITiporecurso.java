package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Tiporecurso;

@Repository
public interface ITiporecurso extends CrudRepository<Tiporecurso, Integer>{

}
