package com.proyectoCondominio.proyectoCondominio.repository;

import com.proyectoCondominio.proyectoCondominio.entity.LibroVisita;
import com.proyectoCondominio.proyectoCondominio.entity.PersonaBienInmueble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaBienInmuebleRepository extends JpaRepository<PersonaBienInmueble, Long> {
}

