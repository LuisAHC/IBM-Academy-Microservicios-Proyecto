package com.ibm.academia.proyecto.ejercicio1.servicios;

import com.ibm.academia.proyecto.ejercicio1.excepciones.NotFoundException;
import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.Pasion;
import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.TarjetaCredito;
import com.ibm.academia.proyecto.ejercicio1.repositorios.TarjetaCreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class TarjetaCreditoDAOImpl implements TarjetaCreditoDAO{
    protected final TarjetaCreditoRepository repository;
    @Autowired
    private PasionDAO pasionDao;

    @Autowired
    public TarjetaCreditoDAOImpl(TarjetaCreditoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<TarjetaCredito> buscarPorId(Long id) {
        return repository.findById(id);
    }

    @Override
    public TarjetaCredito guardar(TarjetaCredito tarjetaCredito) {
        return repository.save(tarjetaCredito);
    }

    @Override
    public Iterable<TarjetaCredito> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public void eliminarPorId(Long id) {
        repository.deleteById(id);
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

    @Override
    @Transactional
    public TarjetaCredito asociarTarjetaPasion(Long tarjetaId, Long[] pasionesId) {
        Optional<TarjetaCredito> oTarjeta = repository.findById(tarjetaId);
        if(!oTarjeta.isPresent())
            throw new NotFoundException(String.format("La tarjeta con ID %d no existe", tarjetaId));

        Set<Pasion> setPasiones = new HashSet<>();
        for (Long id: pasionesId) {
            Optional<Pasion> oPasion = pasionDao.buscarPorId(id);
            if(!oPasion.isPresent())
                throw new NotFoundException(String.format("La pasión con ID %d no existe", id));

            setPasiones.add(oPasion.get());
        }


        oTarjeta.get().setPasiones(setPasiones);
        return repository.save(oTarjeta.get());
    }
}
