package com.proyectoCondominio.proyectoCondominio.repository;


import com.proyectoCondominio.proyectoCondominio.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Persona, Long> {
}
