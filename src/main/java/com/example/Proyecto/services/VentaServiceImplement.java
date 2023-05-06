package com.example.Proyecto.services;

import com.example.Proyecto.entities.Venta;
import com.example.Proyecto.repositories.IVenta;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaServiceImplement implements VentaService {

    @Autowired
    private IVenta iVenta;

    @Override
    public List<Venta> findAll() {
        return iVenta.findAll();
    }

    @Override
    public List<Venta> findAllCustom() {
        return iVenta.findAllCustom();
    }

    @Override
    public Optional<Venta> findById(Integer id) {
        return iVenta.findById(id);
    }

    @Override
    public Venta add(Venta v) {
        return iVenta.save(v);
    }

    @Override
    public Venta update(Venta v) {
        Venta objVenta = iVenta.getById(v.getId());
        BeanUtils.copyProperties(v, objVenta);
        return iVenta.save(objVenta);
    }

    @Override
    public Venta delete(Venta v) {
        Venta objVenta = iVenta.getById(v.getId());
        objVenta.setDescuento(0);
        objVenta.setMonto_final(0);
        return iVenta.save(objVenta);
    }
}


