package com.example.Proyecto.services;

import com.example.Proyecto.entities.VentaDetalle;
import com.example.Proyecto.repositories.IVentaDetalle;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaDetalleServiceImplement implements VentaDetalleService {

    @Autowired
    private IVentaDetalle iVentaDetalle;

    @Override
    public List<VentaDetalle> findAll() {
        return iVentaDetalle.findAll();
    }

    @Override
    public List<VentaDetalle> findAllCustom() {
        return iVentaDetalle.findAllCustom();
    }

    @Override
    public Optional<VentaDetalle> findById(Integer id) {
        return iVentaDetalle.findById(id);
    }

    @Override
    public VentaDetalle add(VentaDetalle vd) {
        return iVentaDetalle.save(vd);
    }

    @Override
    public VentaDetalle update(VentaDetalle vd) {
        VentaDetalle objVentaDetalle = iVentaDetalle.getById(vd.getId());
        BeanUtils.copyProperties(vd, objVentaDetalle);
        return iVentaDetalle.save(objVentaDetalle);
    }

    @Override
    public VentaDetalle delete(VentaDetalle vd) {
        VentaDetalle objVentaDetalle = iVentaDetalle.getById(vd.getId());
        objVentaDetalle.setCantidad(0);
        objVentaDetalle.setMonto_total(0);
        return iVentaDetalle.save(objVentaDetalle);
    }
}
