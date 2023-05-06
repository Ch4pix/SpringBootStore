package com.example.Proyecto.services;

import com.example.Proyecto.entities.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> findAll();
    List<Producto> findAllCustom();
    Optional<Producto> findById(Long id); // Cambiar aquí
    Producto add(Producto p);
    Producto update(Producto p);
    Producto delete(Producto p);
}


