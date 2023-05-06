package com.example.Proyecto.services;

import com.example.Proyecto.entities.Producto;
import com.example.Proyecto.repositories.IProducto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImplement implements ProductoService {

    @Autowired
    private IProducto iProducto;

    @Override
    public List<Producto> findAll() {
        return iProducto.findAll();
    }

    @Override
    public List<Producto> findAllCustom() {
        return iProducto.findAllCustom();
    }

    @Override
    public Optional<Producto> findById(Long id) { // Cambiar aquí
        return iProducto.findById(id);
    }

    @Override
    public Producto add(Producto p) {
        return iProducto.save(p);
    }

    @Override
    public Producto update(Producto p) {
        Producto objProducto = iProducto.getById(p.getId());
        BeanUtils.copyProperties(p, objProducto);
        return iProducto.save(objProducto);
    }

    @Override
    public Producto delete(Producto p) {
        Producto objProducto = iProducto.getById(p.getId());
        objProducto.setNombre(null);
        return iProducto.save(objProducto);
    }
}

