package com.proyectoCondominio.proyectoCondominio.repository;

import com.proyectoCondominio.proyectoCondominio.entity.LibroVisita;
import com.proyectoCondominio.proyectoCondominio.entity.TipoPersona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroVisitaRepository extends JpaRepository<LibroVisita, Long> {
    }