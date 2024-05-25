package com.proyectoCondominio.proyectoCondominio.service.Impl;

import com.proyectoCondominio.proyectoCondominio.entity.Persona;
import com.proyectoCondominio.proyectoCondominio.entity.TipoDocumento;
import com.proyectoCondominio.proyectoCondominio.repository.TipoDocumentoRepository;

public class TipoDocumentoServiceImpl {


    private final TipoDocumentoRepository tipoDocumentoRepository;
    private final Persona persona;






    @Transactional
    public Venta registrarVenta(Venta venta, Set<DetalleVenta> detalles) {
        Cliente cliente = clienteRepository.findById(venta.getCliente().getId()).orElse(null);

        venta.setCliente(cliente);
        venta = ventaRepository.save(venta);

        for (DetalleVenta detalle : detalles) {
            detalle.setVenta(venta);
            detalleVentaRepository.save(detalle);
        }
        venta.setDetalles(detalles);
        return venta;
    }


}
