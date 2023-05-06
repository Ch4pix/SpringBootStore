package com.example.Proyecto.repositories;

import com.example.Proyecto.entities.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProveedor extends JpaRepository<Proveedor, String> {
    @Query("SELECT p FROM Proveedor p WHERE p.nombre IS NOT NULL")
    List<Proveedor> findAllCustom();
}
