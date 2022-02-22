package com.ibm.academia.proyecto.ejercicio1;

import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.TarjetaCredito;
import com.ibm.academia.proyecto.ejercicio1.servicios.PasionDAO;
import com.ibm.academia.proyecto.ejercicio1.servicios.TarjetaCreditoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CreadorDatos implements CommandLineRunner {

    @Autowired
    private TarjetaCreditoDAO tarjetaCreditoDao;

    @Autowired
    private PasionDAO pasionDao;

    @Override
    public void run(String... args) throws RuntimeException {
        /*TarjetaCredito tarjetaCredito1 = new TarjetaCredito(null, "B+smart", 7000.00,
                null, 18, 75, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito1);

        TarjetaCredito tarjetaCredito2 = new TarjetaCredito(null, "Afinity Card", 7000.00,
                null, 18, 32, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito2);

        TarjetaCredito tarjetaCredito3 = new TarjetaCredito(null, "Clasica", 7000.00,
                15000.00, 24, 75, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito3);*/
    }
}
