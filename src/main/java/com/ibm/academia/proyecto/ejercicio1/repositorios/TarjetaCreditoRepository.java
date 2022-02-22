package com.ibm.academia.proyecto.ejercicio1.repositorios;

import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.TarjetaCredito;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorioTarjetasCredito")
public interface TarjetaCreditoRepository extends CrudRepository<TarjetaCredito, Long> {
    Iterable<TarjetaCredito> findTarjetaCreditosByNombreContains(String nombre);

    @Query("select t from TarjetaCredito t where (t.minimoSalario <= ?1 and t.maximoSalario is null) or (t.minimoSalario <= ?1 and t.maximoSalario >= ?1)")
    Iterable<TarjetaCredito> buscarTarjetasPorSalario(Double salario);

    @Query("select t from TarjetaCredito t where (t.edadMinima <= ?1 and t.edadMaxima is null ) or (t.edadMinima <= ?1 and t.edadMaxima >= ?1)")
    Iterable<TarjetaCredito> buscarTarjetasPorEdad(Integer edad);

    @Query("select t from TarjetaCredito t join t.pasiones p where p.nombre = ?1 ")
    Iterable<TarjetaCredito> buscarTarjetasPorPasion(String pasion);
}
