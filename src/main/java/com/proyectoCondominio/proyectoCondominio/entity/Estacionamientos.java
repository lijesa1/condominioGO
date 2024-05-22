package com.proyectoCondominio.proyectoCondominio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "estacionamiento")
public class Estacionamientos {
    private Long id;

    @Column(name = "numero_estacionamiento", nullable = false)
    private int numero;

    @ManyToOne
    @JoinColumn(name = "propietario_id", nullable = false)
    private Long propietario_id;
}
