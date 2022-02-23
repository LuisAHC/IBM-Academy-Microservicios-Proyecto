package com.ibm.academia.proyecto.ejercicio1.servicios;

import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.TarjetaCredito;

import java.util.Optional;

public interface TarjetaCreditoDAO{
    Optional<TarjetaCredito> buscarPorId(Long id);
    TarjetaCredito guardar(TarjetaCredito tarjetaCredito);
    Iterable<TarjetaCredito> buscarTodos();
    void eliminarPorId(Long id);

    Iterable<TarjetaCredito> findTarjetaCreditosByNombreContains(String nombre);
    Iterable<TarjetaCredito> buscarTarjetasPorSalario(
            Double salario
    );
    Iterable<TarjetaCredito> buscarTarjetasPorEdad(Integer edad);
    Iterable<TarjetaCredito> buscarTarjetasPorPasion(String pasion);
    public TarjetaCredito asociarTarjetaPasion(Long tarjetaId, Long[] pasionesId);
}
