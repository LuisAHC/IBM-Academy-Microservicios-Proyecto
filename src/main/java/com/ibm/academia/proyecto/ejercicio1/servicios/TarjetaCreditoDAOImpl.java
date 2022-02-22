package com.ibm.academia.proyecto.ejercicio1.servicios;

import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.TarjetaCredito;
import com.ibm.academia.proyecto.ejercicio1.repositorios.TarjetaCreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TarjetaCreditoDAOImpl extends GenericoDAOImpl<TarjetaCredito, TarjetaCreditoRepository> implements TarjetaCreditoDAO{
    @Autowired
    public TarjetaCreditoDAOImpl(TarjetaCreditoRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<TarjetaCredito> findTarjetaCreditosByNombreContains(String nombre) {
        return repository.findTarjetaCreditosByNombreContains(nombre);
    }

    @Override
    public Iterable<TarjetaCredito> buscarTarjetasPorSalario(Double salario) {
        return repository.buscarTarjetasPorSalario(salario);
    }

    @Override
    public Iterable<TarjetaCredito> buscarTarjetasPorEdad(Integer edad) {
        return repository.buscarTarjetasPorEdad(edad);
    }

    @Override
    public Iterable<TarjetaCredito> buscarTarjetasPorPasion(String pasion) {
        return repository.buscarTarjetasPorPasion(pasion);
    }
}
