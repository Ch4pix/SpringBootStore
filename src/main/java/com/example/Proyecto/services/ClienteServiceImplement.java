package com.example.Proyecto.services;

import com.example.Proyecto.entities.Cliente;
import com.example.Proyecto.repositories.ICliente;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImplement implements ClienteService {

    @Autowired
    private ICliente iCliente;

    @Override
    public List<Cliente> findAll() {
        return iCliente.findAll();
    }

    @Override
    public List<Cliente> findAllCustom() {
        return iCliente.findAllCustom();
    }

    @Override
    public Optional<Cliente> findByDni(String dni) {
        return iCliente.findById(dni);
    }

    @Override
    public Cliente add(Cliente c) {
        return iCliente.save(c);
    }

    @Override
    public Cliente update(Cliente c) {
        Cliente objCliente = iCliente.getById(c.getDni());
        BeanUtils.copyProperties(c, objCliente);
        return iCliente.save(objCliente);
    }

    @Override
    public Cliente delete(Cliente c) {
        Cliente objCliente = iCliente.getById(c.getDni());
        objCliente.setDireccion_calle(null);
        return iCliente.save(objCliente);
    }
}


