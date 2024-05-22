package com.proyectoCondominio.proyectoCondominio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "vigilante")
public class Vigilantes {
    private Long id;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    @Column(name = "nombre", nullable = false, length = 255)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 255)
    private String apellido;

    @Column(name = "dni", nullable = false, length = 255)
    private String dni;
}
