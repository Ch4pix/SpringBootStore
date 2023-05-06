package com.example.Proyecto.services;

import com.example.Proyecto.entities.Categoria;
import com.example.Proyecto.repositories.ICategoria;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImplement implements CategoriaService {

    @Autowired
    private ICategoria iCategoria;

    @Override
    public List<Categoria> findAll() {
        return iCategoria.findAll();
    }

    @Override
    public List<Categoria> findAllCustom() {
        return iCategoria.findAllCustom();
    }

    @Override
    public Optional<Categoria> findById(long id) {
        return iCategoria.findById(id);
    }

    @Override
    public Categoria add(Categoria c) {
        return iCategoria.save(c);
    }

    @Override
    public Categoria update(Categoria c) {
        Categoria objCategoria = iCategoria.getById(c.getId());
        BeanUtils.copyProperties(c, objCategoria);
        return iCategoria.save(objCategoria);
    }

    @Override
    public Categoria delete(Categoria c) {
        Categoria objCategoria = iCategoria.getById(c.getId());
        objCategoria.setDescripcion(null);
        return iCategoria.save(objCategoria);
    }
}


