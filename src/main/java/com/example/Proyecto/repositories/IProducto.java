package com.example.Proyecto.repositories;

import com.example.Proyecto.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProducto extends JpaRepository<Producto, Long> {

    @Query("SELECT p FROM Producto p WHERE p.nombre IS NOT NULL")
    List<Producto> findAllCustom();
}
