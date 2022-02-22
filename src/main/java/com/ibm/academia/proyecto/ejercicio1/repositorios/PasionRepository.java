package com.ibm.academia.proyecto.ejercicio1.repositorios;

import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.Pasion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorioPasiones")
public interface PasionRepository extends CrudRepository<Pasion, Long> {
    Iterable<Pasion> findPasionsByNombreContains(String nombre);
}
