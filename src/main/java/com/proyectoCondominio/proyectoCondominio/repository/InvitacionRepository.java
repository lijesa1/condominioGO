package com.proyectoCondominio.proyectoCondominio.repository;

import com.proyectoCondominio.proyectoCondominio.entity.TipoPersona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvitacionRepository extends JpaRepository<TipoPersona, Long> {
}
