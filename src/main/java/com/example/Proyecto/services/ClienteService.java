package com.example.Proyecto.services;

import com.example.Proyecto.entities.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {
    List<Cliente> findAll();
    List<Cliente> findAllCustom();
    Optional<Cliente> findByDni(String dni);
    Cliente add(Cliente c);
    Cliente update(Cliente c);
    Cliente delete(Cliente c);
}


