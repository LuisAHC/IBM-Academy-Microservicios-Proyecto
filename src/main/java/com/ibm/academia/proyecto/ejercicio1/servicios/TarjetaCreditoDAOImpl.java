package com.ibm.academia.proyecto.ejercicio1.servicios;

import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.TarjetaCredito;
import com.ibm.academia.proyecto.ejercicio1.repositorios.TarjetaCreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TarjetaCreditoDAOImpl extends GenericoDAOImpl<TarjetaCredito, TarjetaCreditoRepository> implements TarjetaCreditoDAO{
    @Autowired
    public TarjetaCreditoDAOImpl(TarjetaCreditoRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<TarjetaCredito> findTarjetaCreditosByNombreContains(String nombre) {
        return repository.findTarjetaCreditosByNombreContains(nombre);
    }
}
