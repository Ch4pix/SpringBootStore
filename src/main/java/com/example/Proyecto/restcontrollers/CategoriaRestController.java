package com.example.Proyecto.restcontrollers;

import com.example.Proyecto.entities.Categoria;
import com.example.Proyecto.services.CategoriaService;
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
@RequestMapping("/Categoria")
public class CategoriaRestController {

    @Autowired
    private CategoriaService service;

    @GetMapping
    public List<Categoria> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAllCustom")
    public List<Categoria> findAllCustom() {
        return service.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<Categoria> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Categoria add(@RequestBody Categoria c) {
        return service.add(c);
    }

    @PutMapping("/{id}")
    public Categoria update(@PathVariable Long id, @RequestBody Categoria c) {
        c.setId(id);
        return service.update(c);
    }

    @DeleteMapping("/{id}")
    public Categoria delete(@PathVariable Long id) {
        Categoria objCategoria = new Categoria();
        objCategoria.setId(id);
        objCategoria.setDescripcion(null);
        return service.delete(objCategoria);
    }
}

