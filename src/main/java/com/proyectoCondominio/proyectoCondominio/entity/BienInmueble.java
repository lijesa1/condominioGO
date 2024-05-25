package com.proyectoCondominio.proyectoCondominio.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "Bien_Inmueble")
public class BienInmueble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "torre", nullable = false)
    private String torre;

    @Column(name = "piso_torre", nullable = false)
    private String pisoTorre;

    @Column(name = "num_dpto", nullable = false)
    private String numDpto;

    @Column(name = "num_estacionamiento", nullable = false)
    private String numEstacionamiento;

    @Column(name = "num_comercio", nullable = false)
    private String numComercio;

    @Column(name = "en_uso", nullable = false)
    private Boolean enUso;

    @Column(name = "en_alquiler", nullable = false)
    private Boolean enAlquiler;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_bien_inmueble_id", nullable = false)
    private TipoBienInmueble tipoBienInmueble;
}
