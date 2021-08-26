package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Periodomatriculacurso;

@Repository
public interface IPeriodomatricula extends CrudRepository<Periodomatriculacurso, Integer>{

}
