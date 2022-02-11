package com.ibm.academia.proyecto.ejercicio1.servicios;

import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.TarjetaCredito;

public interface TarjetaCreditoDAO extends GenericoDAO<TarjetaCredito>{
    public Iterable<TarjetaCredito> findTarjetaCreditosByNombreContains(String nombre);
}
