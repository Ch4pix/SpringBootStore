package com.example.Proyecto.services;

import com.example.Proyecto.entities.Proveedor;
import java.util.List;
import java.util.Optional;

public interface ProveedorService {
    List<Proveedor> findAll();
    List<Proveedor> findAllCustom();
    Optional<Proveedor> findByCuil(String cuil);
    Proveedor add(Proveedor p);
    Proveedor update(Proveedor p);
    Proveedor delete(Proveedor p);
}

