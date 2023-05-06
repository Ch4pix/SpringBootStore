package com.example.Proyecto.restcontrollers;

import com.example.Proyecto.entities.VentaDetalle;
import com.example.Proyecto.services.VentaDetalleService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/VentaDetalle")
public class VentaDetalleRestController {

    @Autowired
    private VentaDetalleService service;

    @GetMapping
    public List<VentaDetalle> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAllCustom")
    public List<VentaDetalle> findAllCustom() {
        return service.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<VentaDetalle> findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public VentaDetalle add(@RequestBody VentaDetalle vd) {
        return service.add(vd);
    }

    @PutMapping("/{id}")
    public VentaDetalle update(@PathVariable Integer id, @RequestBody VentaDetalle vd) {
        vd.setId(id);
        return service.update(vd);
    }

    @DeleteMapping("/{id}")
    public VentaDetalle delete(@PathVariable Integer id) {
        VentaDetalle objVentaDetalle = new VentaDetalle();
        objVentaDetalle.setId(id);
        return service.delete(objVentaDetalle);
    }
}
