package com.proyectoCondominio.proyectoCondominio.repository;

import com.proyectoCondominio.proyectoCondominio.entity.DetalleLibroVisita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TorreRepository extends JpaRepository<DetalleLibroVisita, Long> {
}
