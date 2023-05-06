package com.example.Proyecto.services;

import com.example.Proyecto.entities.Venta;

import java.util.List;
import java.util.Optional;

public interface VentaService {
    List<Venta> findAll();
    List<Venta> findAllCustom();
    Optional<Venta> findById(Integer id);
    Venta add(Venta v);
    Venta update(Venta v);
    Venta delete(Venta v);
}
