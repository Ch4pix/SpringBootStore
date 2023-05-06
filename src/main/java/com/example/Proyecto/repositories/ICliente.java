package com.example.Proyecto.repositories;

import com.example.Proyecto.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICliente extends JpaRepository<Cliente, String> {
    @Query("SELECT c FROM Cliente c WHERE c.direccion_calle IS NOT NULL")
    List<Cliente> findAllCustom();
}


