package com.proyectoCondominio.proyectoCondominio.repository;

import com.proyectoCondominio.proyectoCondominio.entity.LibroVisita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropietarioRepository extends JpaRepository<LibroVisita, Long> {
}

