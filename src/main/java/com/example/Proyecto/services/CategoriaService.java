package com.example.Proyecto.services;

import com.example.Proyecto.entities.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    List<Categoria> findAll();
    List<Categoria> findAllCustom();
    Optional<Categoria> findById(long id);
    Categoria add(Categoria c);
    Categoria update(Categoria c);
    Categoria delete(Categoria c);
}

