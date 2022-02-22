package com.ibm.academia.proyecto.ejercicio1.servicios;

import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.Pasion;
import com.ibm.academia.proyecto.ejercicio1.repositorios.PasionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PasionDAOImpl extends GenericoDAOImpl<Pasion, PasionRepository> implements PasionDAO{
    @Autowired
    public PasionDAOImpl(PasionRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Pasion> findPasionsByNombreContains(String nombre) {
        return repository.findPasionsByNombreContains(nombre);
    }
}
