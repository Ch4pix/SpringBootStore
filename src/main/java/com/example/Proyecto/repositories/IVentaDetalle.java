package com.example.Proyecto.repositories;

import com.example.Proyecto.entities.VentaDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IVentaDetalle extends JpaRepository<VentaDetalle, Integer> {
    @Query("SELECT vd FROM VentaDetalle vd WHERE vd.cantidad > 0")
    List<VentaDetalle> findAllCustom();
}

