package com.proyectoCondominio.proyectoCondominio.repository;

import com.proyectoCondominio.proyectoCondominio.entity.Invitaciones;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.file.LinkOption;

public interface InvitacionRepository extends JpaRepository<Invitaciones, Long> {
}
