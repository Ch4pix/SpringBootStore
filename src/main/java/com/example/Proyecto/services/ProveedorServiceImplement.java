package com.example.Proyecto.services;

import com.example.Proyecto.entities.Proveedor;
import com.example.Proyecto.repositories.IProveedor;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorServiceImplement implements ProveedorService {

    @Autowired
    private IProveedor iProveedor;

    @Override
    public List<Proveedor> findAll() {
        return iProveedor.findAll();
    }

    @Override
    public List<Proveedor> findAllCustom() {
        return iProveedor.findAllCustom();
    }

    @Override
    public Optional<Proveedor> findByCuil(String cuil) {
        return iProveedor.findById(cuil);
    }

    @Override
    public Proveedor add(Proveedor p) {
        return iProveedor.save(p);
    }

    @Override
    public Proveedor update(Proveedor p) {
        Proveedor objProveedor = iProveedor.getById(p.getCuil());
        BeanUtils.copyProperties(p, objProveedor);
        return iProveedor.save(objProveedor);
    }

    @Override
    public Proveedor delete(Proveedor p) {
        Proveedor objProveedor = iProveedor.getById(p.getCuil());
        objProveedor.setDireccion_calle(null);
        return iProveedor.save(objProveedor);
    }
}
