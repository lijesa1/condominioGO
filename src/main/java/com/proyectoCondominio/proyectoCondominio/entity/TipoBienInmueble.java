package com.proyectoCondominio.proyectoCondominio.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tipo_bien_inmueble")
public class TipoBienInmueble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @OneToMany(targetEntity = BienInmueble.class, fetch = FetchType.LAZY, mappedBy = "tipoBienInmueble")
    private List<BienInmueble> bienInmuebleList;
}
