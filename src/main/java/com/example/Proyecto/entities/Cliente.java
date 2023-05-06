package com.example.Proyecto.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cliente")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "dni", length = 15)
    private String dni;

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

    @Column(name = "apellido", length = 255, nullable = false)
    private String apellido;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "telefono", length = 255)
    private String telefono;
}




