package com.ibm.academia.proyecto.ejercicio1.controladores;

import com.ibm.academia.proyecto.ejercicio1.excepciones.NotFoundException;
import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.TarjetaCredito;
import com.ibm.academia.proyecto.ejercicio1.servicios.TarjetaCreditoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class APIController {
    @Autowired
    @Qualifier("tarjetaCreditoDAOImpl")
    private TarjetaCreditoDAO tarjetaCreditoDao;

    /**
     * Endpoint para consultar tarjetas de crédito adecuadas para un cliente basado en su perfil
     * @param pasion Nombre de la pasión del usuario
     * @param salario Salario del usuario
     * @param edad Edad del usuario
     * @return Retorna una lista de tarjetas
     * @author LAHC - 22-02-2022
     */
    @GetMapping("/tarjetasDisponibles/{pasion}/{salario}/{edad}")
    public ResponseEntity<?> obtenerTarjetasDisponibles(@PathVariable(value = "pasion") String pasion,
                                                        @PathVariable(value = "salario") Double salario,
                                                        @PathVariable(value = "edad") Integer edad){
        List<TarjetaCredito> lTarjetasSalario = (List<TarjetaCredito>) tarjetaCreditoDao.buscarTarjetasPorSalario(salario);
        List<TarjetaCredito> lTarjetasEdad = (List<TarjetaCredito>) tarjetaCreditoDao.buscarTarjetasPorEdad(edad);
        List<TarjetaCredito> lTarjetasPasion = (List<TarjetaCredito>) tarjetaCreditoDao.buscarTarjetasPorPasion(pasion);

        List<TarjetaCredito> tarjetasAuxiliar = new ArrayList<>();

        for (TarjetaCredito tarjeta : lTarjetasSalario) {
            if(lTarjetasEdad.contains(tarjeta)) {
                    tarjetasAuxiliar.add(tarjeta);
            }
        }

        List<TarjetaCredito> tarjetasDisponibles = new ArrayList<>();
        for (TarjetaCredito tarjeta : lTarjetasPasion) {
            if (tarjetasAuxiliar.contains(tarjeta))
                tarjetasDisponibles.add(tarjeta);
        }
        if (tarjetasDisponibles.isEmpty())
            throw new NotFoundException("No existen tarjetas disponibles para este perfil");
        return new ResponseEntity<>(tarjetasDisponibles, HttpStatus.OK);
    }
}
