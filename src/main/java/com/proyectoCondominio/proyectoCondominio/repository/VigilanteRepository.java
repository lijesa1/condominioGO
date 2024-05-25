package com.proyectoCondominio.proyectoCondominio.repository;

import com.proyectoCondominio.proyectoCondominio.entity.TipoBienInmueble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VigilanteRepository extends JpaRepository<TipoBienInmueble, Long> {
}
