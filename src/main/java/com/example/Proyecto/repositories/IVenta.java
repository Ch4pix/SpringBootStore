package com.example.Proyecto.repositories;

import com.example.Proyecto.entities.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IVenta extends JpaRepository<Venta, Integer> {
    @Query("SELECT v FROM Venta v WHERE v.fecha IS NOT NULL")
    List<Venta> findAllCustom();
}

