package com.proyectoCondominio.proyectoCondominio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "permiso")
public class Permisos {
    private Long id;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    @Column(name = "placa", nullable = false)
    private int placa;

    @Column(name = "estacionamiento_id", nullable = false)
    private Long estacionamiento_id;

    @Column(name = "visitante_id", nullable = false)
    private Long visitante_id;


}
