package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Horasclase;

@Repository
public interface IHorasclase extends CrudRepository<Horasclase, Integer>{

}
