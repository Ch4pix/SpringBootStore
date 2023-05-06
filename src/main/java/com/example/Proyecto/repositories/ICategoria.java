package com.example.Proyecto.repositories;

import com.example.Proyecto.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICategoria extends JpaRepository<Categoria, Long> {
    @Query("SELECT c FROM Categoria c WHERE c.descripcion IS NOT NULL")
    List<Categoria> findAllCustom();
}

