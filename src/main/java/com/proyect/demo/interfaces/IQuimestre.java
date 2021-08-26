package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Quimestre;

@Repository
public interface IQuimestre extends CrudRepository<Quimestre, Integer>{

}
