package com.ibm.academia.proyecto.ejercicio1.servicios;

import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.TarjetaCredito;

public interface TarjetaCreditoDAO extends GenericoDAO<TarjetaCredito>{
    Iterable<TarjetaCredito> findTarjetaCreditosByNombreContains(String nombre);
    Iterable<TarjetaCredito> buscarTarjetasPorSalario(
            Double salario
    );
    Iterable<TarjetaCredito> buscarTarjetasPorEdad(Integer edad);
    Iterable<TarjetaCredito> buscarTarjetasPorPasion(String pasion);
    public TarjetaCredito asociarTarjetaPasion(Long tarjetaId, Long[] pasionesId);
}
