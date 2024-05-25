package com.proyectoCondominio.proyectoCondominio.controller;

import com.proyectoCondominio.proyectoCondominio.service.Impl.TipoDocumentoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/condominio/")
@AllArgsConstructor
public class BienInmuebleController {
    private final TipoDocumentoServiceImpl tipoDocumentoService;

    @PostMapping("/crearTipoDocumento")
    public ResponseEntity<crearTipoDocumento> agregarEmpleadoAProyecto(@RequestBody crearTipoDocumento crearTipoDocumento) {
        crearTipoDocumento nuevoTipoDocumento = TipoDocumentoServiceImpl.guardar(empleadoProyecto);
        return ResponseEntity.ok(nuevoTipoDocumento);
    }

}
