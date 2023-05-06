package com.example.Proyecto.restcontrollers;

import com.example.Proyecto.entities.Venta;
import com.example.Proyecto.services.VentaService;
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
@RequestMapping("/Venta")
public class VentaRestController {

    @Autowired
    private VentaService service;

    @GetMapping
    public List<Venta> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAllCustom")
    public List<Venta> findAllCustom() {
        return service.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<Venta> findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Venta add(@RequestBody Venta v) {
        return service.add(v);
    }

    @PutMapping("/{id}")
    public Venta update(@PathVariable Integer id, @RequestBody Venta v) {
        v.setId(id);
        return service.update(v);
    }

    @DeleteMapping("/{id}")
    public Venta delete(@PathVariable Integer id) {
        Venta objVenta = new Venta();
        objVenta.setId(id);
        return service.delete(objVenta);
    }
}

