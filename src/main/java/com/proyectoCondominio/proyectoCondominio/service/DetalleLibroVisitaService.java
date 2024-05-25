package com.proyectoCondominio.proyectoCondominio.service;

import com.proyectoCondominio.proyectoCondominio.entity.DetalleLibroVisita;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DetalleLibroVisitaService {

    DetalleLibroVisita crearPersonaIn(DetalleLibroVisita detalleLibroVisita);
    //Tarea
    Optional<DetalleLibroVisita> obtenerPersonaIn(Long id);
    List<DetalleLibroVisita> obtenerTodosIn();
    DetalleLibroVisita actualizarPersonaIn(Long id, DetalleLibroVisita detalleLibroVisita);
    DetalleLibroVisita deleteIn(Long id);
}
