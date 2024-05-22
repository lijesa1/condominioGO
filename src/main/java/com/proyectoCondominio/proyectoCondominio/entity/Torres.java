package com.proyectoCondominio.proyectoCondominio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "torre")
public class Torres {
    private Long id;

    @Column(name = "num_departamento", nullable = false)
    private int num_departamento;

    @Column(name = "num_torre", nullable = false)
    private int num_torre;

}
