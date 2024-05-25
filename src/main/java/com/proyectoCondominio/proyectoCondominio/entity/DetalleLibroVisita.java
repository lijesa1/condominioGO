
package com.proyectoCondominio.proyectoCondominio.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "detalle_libro_visita")
public class DetalleLibroVisita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "observaciones_persona_visitante", nullable = false)
    private String observacionesPersonaVisitante;

    @Column(name = "estado_visitante", nullable = false)
    private Boolean estadoVisitante;

    @JsonIgnore
    @ManyToOne(targetEntity = LibroVisita.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "libro_visita_id", nullable = false)
    private LibroVisita libroVisita;

    @ManyToOne(targetEntity = Persona.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "persona_visitante_id", nullable = false)
    private Persona persona;
}
