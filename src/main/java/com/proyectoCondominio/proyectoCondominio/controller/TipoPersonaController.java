package com.proyectoCondominio.proyectoCondominio.controller;

import com.proyectoCondominio.proyectoCondominio.entity.TipoPersona;
import com.proyectoCondominio.proyectoCondominio.service.Impl.TipoPersonaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/condominio/")
@AllArgsConstructor
public class TipoPersonaController {

    private final TipoPersonaServiceImpl tipoDocumentoService;

/*
    @PostMapping("/crearProducto")
    public ResponseEntity<Producto> crearProducto(@RequestBody ProductoRequest request) {
        Producto nuevoProducto = new Producto();
        nuevoProducto.setNombre(request.getNombre());
        nuevoProducto.setPrecio(request.getPrecio());
        Producto productoGuardado = productoService.agregarProductoConCategorias(nuevoProducto, request.getCategoriaIds());
        return ResponseEntity.ok(productoGuardado);
    }
*/





    @PostMapping("/crearTipoPersona")
    public ResponseEntity<TipoPersona> crearTipoPersona(@RequestBody TipoPersona tipoPersona){
        TipoPersona registrarTipoPersona=tipoPersonaService.registrarTipoPersona(TipoPersona);
        return ResponseEntity.ok(registrarTipoPersona);
    }



}
