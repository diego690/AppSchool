package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario, Integer>{

}
