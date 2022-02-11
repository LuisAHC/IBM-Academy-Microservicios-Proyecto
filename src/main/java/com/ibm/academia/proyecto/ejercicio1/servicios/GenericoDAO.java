package com.ibm.academia.proyecto.ejercicio1.servicios;

import java.util.Optional;

public interface GenericoDAO<E> {
    public Optional<E> buscarPorId(Long id);
    public E guardar(E entidad);
    public Iterable<E> buscarTodos();
    public void eliminarPorId(Long id);
}
