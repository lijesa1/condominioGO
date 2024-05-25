package com.proyectoCondominio.proyectoCondominio.controller;

import com.proyectoCondominio.proyectoCondominio.entity.TipoDocumento;
import com.proyectoCondominio.proyectoCondominio.service.Impl.TipoDocumentoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/condominio/")
@AllArgsConstructor
public class TipoDocumentoController {


    private final TipoDocumentoServiceImpl tipoDocumentoService;



@PostMapping("/crearTipoDocumento")
   public ResponseEntity<TipoDocumento>crearTipoDocumento(@RequestBody TipoDocumento tipoDocumento){
        TipoDocumento registrarTipoDocumento=tipoDocumentoService.registrarTipoDocumento(tipoDocumento);
        return ResponseEntity.ok(registrarTipoDocumento);
}


}
