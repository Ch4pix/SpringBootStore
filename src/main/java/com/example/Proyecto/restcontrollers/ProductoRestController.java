package com.example.Proyecto.restcontrollers;

import com.example.Proyecto.entities.Producto;
import com.example.Proyecto.services.ProductoService;
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
@RequestMapping("/Producto")
public class ProductoRestController {

    @Autowired
    private ProductoService service;

    @GetMapping
    public List<Producto> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAllCustom")
    public List<Producto> findAllCustom() {
        return service.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<Producto> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Producto add(@RequestBody Producto p) {
        return service.add(p);
    }

    @PutMapping("/{id}")
    public Producto update(@PathVariable Long id, @RequestBody Producto p) {
        p.setId(id);
        return service.update(p);
    }

    @DeleteMapping("/{id}")
    public Producto delete(@PathVariable Long id) {
        Producto objProducto = new Producto();
        objProducto.setId(id);
        objProducto.setNombre(null);
        return service.delete(objProducto);
    }
}

