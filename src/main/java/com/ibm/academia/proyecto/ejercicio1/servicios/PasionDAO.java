package com.ibm.academia.proyecto.ejercicio1.servicios;

import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.Pasion;

public interface PasionDAO extends GenericoDAO<Pasion>{
    Iterable<Pasion> findPasionsByNombreContains(String nombre);
}
