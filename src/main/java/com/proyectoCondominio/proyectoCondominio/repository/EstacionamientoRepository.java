package com.proyectoCondominio.proyectoCondominio.repository;

import com.proyectoCondominio.proyectoCondominio.entity.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstacionamientoRepository extends JpaRepository<TipoDocumento, Long> {
}
