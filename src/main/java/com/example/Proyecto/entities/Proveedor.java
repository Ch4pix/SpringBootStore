package com.example.Proyecto.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "proveedor")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cuil", length = 15)
    private String cuil;

    @Column(name = "nombre", nullable = false, length = 255)
    private String nombre;

    @Column(name = "direccion_calle", nullable = false, length = 255)
    private String direccion_calle;

    @Column(name = "direccion_numero", nullable = false)
    private int direccion_numero;

    @Column(name = "direccion_comuna", nullable = false, length = 255)
    private String direccion_comuna;

    @Column(name = "direccion_ciudad", nullable = false, length = 255)
    private String direccion_ciudad;

    @Column(name = "telefono", nullable = false, length = 20)
    private String telefono;

    @Column(name = "pagina_web", length = 255)
    private String pagina_web;
}

