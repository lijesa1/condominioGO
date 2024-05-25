package com.proyectoCondominio.proyectoCondominio.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Setter
@Getter
@Table(name = "Detalle_Libro_Visita")
public class DetalleLibroVisita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "observaciones_persona_visitante", nullable = false)
    private String observacionesPersonaVisitante;

    @Column(name = "estado_visitante", nullable = false)
    private Boolean estadoVisitante;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "libro_visita_id", nullable = false)
    private LibroVisita libroVisita;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "persona_visitante_id", nullable = false)
    private Persona persona;

}
