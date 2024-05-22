package com.proyectoCondominio.proyectoCondominio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "invitacion")
public class Invitaciones {
    private Long id;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    @Column(name = "fecha_ingreso", nullable = false)
    private Date fecha_ingreso;

    @Column(name = "fecha_salida", nullable = false)
    private Date fecha_salida;


    @ManyToOne
    @JoinColumn(name = "propietario_id", nullable = false)
    private Long propietario_id;

    @ManyToOne
    @JoinColumn(name = "visitante_id", nullable = false)
    private Long visitante_id;

    @Column(name = "movilidad", nullable = false, length = 255)
    private String movilidad;

    @Column(name = "detalle", nullable = false, length = 255)
    private String detalle;
}
