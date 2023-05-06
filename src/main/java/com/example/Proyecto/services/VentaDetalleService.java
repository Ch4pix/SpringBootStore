package com.example.Proyecto.services;

import com.example.Proyecto.entities.VentaDetalle;

import java.util.List;
import java.util.Optional;

public interface VentaDetalleService {
    List<VentaDetalle> findAll();
    List<VentaDetalle> findAllCustom();
    Optional<VentaDetalle> findById(Integer id);
    VentaDetalle add(VentaDetalle vd);
    VentaDetalle update(VentaDetalle vd);
    VentaDetalle delete(VentaDetalle vd);
}

