package com.ibm.academia.proyecto.ejercicio1.controladores;

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

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class APIController {
    @Autowired
    @Qualifier("tarjetaCreditoDAOImpl")
    private TarjetaCreditoDAO tarjetaCreditoDao;

    @GetMapping("/tarjetasDisponibles/{pasion}/{salario}/{edad}")
    public ResponseEntity<?> obtenerTarjetasDisponibles(@PathVariable(value = "pasion") String pasion,
                                                        @PathVariable(value = "salario") Double salario,
                                                        @PathVariable(value = "edad") Integer edad){

        List<TarjetaCredito> lTarjetasSalario = (List<TarjetaCredito>) tarjetaCreditoDao.buscarTarjetasPorSalario(salario);
        List<TarjetaCredito> lTarjetasEdad = (List<TarjetaCredito>) tarjetaCreditoDao.buscarTarjetasPorEdad(edad);
        //List<TarjetaCredito> lTarjetasPasion = (List<TarjetaCredito>) tarjetaCreditoDao.buscarTarjetasPorPasion(pasion);

        List<TarjetaCredito> tarjetasDisponibles = new ArrayList<>();
        System.out.println(lTarjetasSalario);
        for (TarjetaCredito tarjeta : lTarjetasSalario) {
            if(lTarjetasEdad.contains(tarjeta)) {
                tarjetasDisponibles.add(tarjeta);
            }
        }

        /*for (TarjetaCredito tarjeta : lTarjetasPasion) {
            if(tarjetasDisponibles.contains(tarjeta)) {
                tarjetasDisponibles.add(tarjeta);
            }
        }*/

        return new ResponseEntity<>(tarjetasDisponibles, HttpStatus.OK);
    }
}
