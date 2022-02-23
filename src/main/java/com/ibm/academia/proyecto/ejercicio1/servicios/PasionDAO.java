package com.ibm.academia.proyecto.ejercicio1.servicios;

import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.Pasion;

import java.util.Optional;

public interface PasionDAO{
    Optional<Pasion> buscarPorId(Long id);
    Pasion guardar(Pasion pasion);
    Iterable<Pasion> buscarTodos();
    void eliminarPorId(Long id);

    Iterable<Pasion> findPasionsByNombreContains(String nombre);
}
