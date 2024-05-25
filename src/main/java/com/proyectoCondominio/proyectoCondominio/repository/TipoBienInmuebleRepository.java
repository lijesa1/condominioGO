package com.proyectoCondominio.proyectoCondominio.repository;

import com.proyectoCondominio.proyectoCondominio.entity.DetalleLibroVisita;
import com.proyectoCondominio.proyectoCondominio.entity.TipoBienInmueble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoBienInmuebleRepository extends JpaRepository<TipoBienInmueble, Long> {
}
