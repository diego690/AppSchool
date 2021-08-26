package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Tiponota;

@Repository
public interface ITiponotas extends CrudRepository<Tiponota, Integer>{

}
