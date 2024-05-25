package com.proyectoCondominio.proyectoCondominio.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "Tipo_Bien_Inmueble")
public class TipoBienInmueble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_departamento", nullable = false)
    private int numero_departamento;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "propietario_id", nullable = false)
    private BienInmueble bienInmueble;

    @ManyToOne
    @JoinColumn(name = "torre_id", nullable = false)
    private int torre_id;


    @Column(name = "estado", nullable = false)
    private Boolean estado;

    @Column(name = "nombre", nullable = false, length = 255)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 255)
    private String apellido;

    @Column(name = "dni", nullable = false, length = 255)
    private String dni;
}
