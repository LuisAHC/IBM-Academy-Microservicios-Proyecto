package com.ibm.academia.proyecto.ejercicio1.servicios;

import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.Pasion;
import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.TarjetaCredito;
import com.ibm.academia.proyecto.ejercicio1.repositorios.PasionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PasionDAOImpl implements PasionDAO{
    protected final PasionRepository repository;
    @Autowired
    public PasionDAOImpl(PasionRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Pasion> buscarPorId(Long id) {
        return repository.findById(id);
    }

    @Override
    public Pasion guardar(Pasion pasion) {
        return repository.save(pasion);
    }

    @Override
    public Iterable<Pasion> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public void eliminarPorId(Long id) {
        repository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Pasion> findPasionsByNombreContains(String nombre) {
        return repository.findPasionsByNombreContains(nombre);
    }
}
