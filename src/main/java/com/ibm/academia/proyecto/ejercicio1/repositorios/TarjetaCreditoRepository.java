package com.ibm.academia.proyecto.ejercicio1.repositorios;

import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.TarjetaCredito;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorioTarjetasCredito")
public interface TarjetaCreditoRepository extends CrudRepository<TarjetaCredito, Long> {
    public Iterable<TarjetaCredito> findTarjetaCreditosByNombreContains(String nombre);
}
