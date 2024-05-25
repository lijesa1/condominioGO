package com.proyectoCondominio.proyectoCondominio.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "Persona")

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombres", nullable = false)
    private String nombre;

    @Column(name = "apellido_paterno")
    private String apellidoPaterno;

    @Column(name = "apellido_materno", nullable = false)
    private String apellidoMaterno;

    @Column(name = "celular", nullable = false)
    private String celular;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "num_documento", nullable = false)
    private String numDocumento;

    @Column(name = "fecha_nac", nullable = false)
    private Date fechaNac;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "usuario_creacion", nullable = false)
    private String usuarioCreacion;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "usuario_actualizacion", nullable = false)
    private String usuarioActualizacion;

    @Column(name = "fecha_actualizacion", nullable = false)
    private Date fechaActualizacion;

    @Column(name = "usuario_eliminacion", nullable = false)
    private String usuarioEliminacion;

    @Column(name = "fecha_eliminacion", nullable = false)
    private Date fechaEliminacion;

    @Column(name = "tipo_documento_id", nullable = false)
    private Integer tipoDocumentoId;

    @Column(name = "tipo_persona_id", nullable = false)
    private int tipoPersonaId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_documento_id", nullable = false)
    private TipoDocumento tipoDocumento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_persona_id", nullable = false)
    private TipoPersona tipoPersona;

    @OneToMany(mappedBy = "persona", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private Set<PersonaBienInmueble> personaBienInmuebles;

    @OneToMany(mappedBy = "persona", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private Set<LibroVisita> libroVisitas;

    @OneToMany(mappedBy = "persona", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private Set<DetalleLibroVisita> detalleLibroVisitas;




}
