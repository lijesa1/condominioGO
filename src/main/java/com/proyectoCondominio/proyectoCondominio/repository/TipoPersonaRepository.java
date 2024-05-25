package com.proyectoCondominio.proyectoCondominio.repository;

import com.proyectoCondominio.proyectoCondominio.entity.BienInmueble;
import com.proyectoCondominio.proyectoCondominio.entity.TipoPersona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoPersonaRepository extends JpaRepository<TipoPersona, Long> {
}
