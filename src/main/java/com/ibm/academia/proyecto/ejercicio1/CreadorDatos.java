package com.ibm.academia.proyecto.ejercicio1;

import com.ibm.academia.proyecto.ejercicio1.modelos.entidades.Pasion;
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
        tarjetaCreditoDao.guardar(tarjetaCredito3);

        TarjetaCredito tarjetaCredito4 = new TarjetaCredito(null, "Office Depot", 7000.00,
                null, 18, 75, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito4);

        TarjetaCredito tarjetaCredito5 = new TarjetaCredito(null, "Costco", 7000.00,
                null, 18, 75, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito5);

        TarjetaCredito tarjetaCredito6 = new TarjetaCredito(null, "Best Buy Banamex", 7000.00,
                null, 18, 75, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito6);

        TarjetaCredito tarjetaCredito7 = new TarjetaCredito(null, "The Home Depot", 7000.00,
                null, 18, 75, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito7);

        TarjetaCredito tarjetaCredito8 = new TarjetaCredito(null, "Platinum", 30000.00,
                null, 23, 75, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito8);

        TarjetaCredito tarjetaCredito9 = new TarjetaCredito(null, "Citi / AAdvantage", 12000.00,
                null, 18, 75, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito9);

        TarjetaCredito tarjetaCredito10 = new TarjetaCredito(null, "Banamex Teleton", 12000.00,
                null, 18, 75, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito10);

        TarjetaCredito tarjetaCredito11 = new TarjetaCredito(null, "APAC", 12000.00,
                null, 18, 75, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito11);

        TarjetaCredito tarjetaCredito12 = new TarjetaCredito(null, "Martí Clasica Citibanamex", 7000.00,
                34999.00, 18, 75, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito12);

        TarjetaCredito tarjetaCredito13 = new TarjetaCredito(null, "América Deporteísmo", 7000.00,
                34999.00, 18, 75, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito13);

        TarjetaCredito tarjetaCredito14 = new TarjetaCredito(null, "Pumas Deporteísmo", 7000.00,
                34999.00, 18, 75, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito14);

        TarjetaCredito tarjetaCredito15 = new TarjetaCredito(null, "Toluca Deporteísmo", 7000.00,
                34999.00, 18, 75, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito15);

        TarjetaCredito tarjetaCredito16 = new TarjetaCredito(null, "La Verde Deporteísmo", 7000.00,
                34999.00, 18, 75, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito16);

        TarjetaCredito tarjetaCredito17 = new TarjetaCredito(null, "Martí Premium Citibanamex", 35000.00,
                null, 18, 75, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito17);

        TarjetaCredito tarjetaCredito18 = new TarjetaCredito(null, "Oro", 15000.00,
                29999.00, 24, 75, "luisceciliano");
        tarjetaCreditoDao.guardar(tarjetaCredito18);*/

        /*
        Pasion pasion1 = new Pasion(null, "Shopping", "luisceciliano");
        pasionDao.guardar(pasion1);
        Pasion pasion2 = new Pasion(null, "Travels", "luisceciliano");
        pasionDao.guardar(pasion2);
        Pasion pasion3 = new Pasion(null, "Help", "luisceciliano");
        pasionDao.guardar(pasion3);
        Pasion pasion4 = new Pasion(null, "My business", "luisceciliano");
        pasionDao.guardar(pasion4);
        Pasion pasion5 = new Pasion(null, "Sports", "luisceciliano");
        pasionDao.guardar(pasion5);
        Pasion pasion6 = new Pasion(null, "My style", "luisceciliano");
        pasionDao.guardar(pasion6);*/

        /*
        Long[] pasionesId = {1L, 6L};
        tarjetaCreditoDao.asociarTarjetaPasion(1L, pasionesId);
        tarjetaCreditoDao.asociarTarjetaPasion(2L, pasionesId);
        Long[] pasionesId2 = {1L};
        tarjetaCreditoDao.asociarTarjetaPasion(3L, pasionesId2);
        Long[] pasionesId3 = {1L, 4L};
        tarjetaCreditoDao.asociarTarjetaPasion(4L, pasionesId3);
        tarjetaCreditoDao.asociarTarjetaPasion(5L, pasionesId3);
        tarjetaCreditoDao.asociarTarjetaPasion(6L, pasionesId3);
        tarjetaCreditoDao.asociarTarjetaPasion(7L, pasionesId3);
        Long[] pasionesId4 = {1L, 2L, 6L};
        tarjetaCreditoDao.asociarTarjetaPasion(8L, pasionesId4);
        Long[] pasionesId5 = {2L};
        tarjetaCreditoDao.asociarTarjetaPasion(9L, pasionesId5);
        Long[] pasionesId6 = {3L};
        tarjetaCreditoDao.asociarTarjetaPasion(10L, pasionesId6);
        tarjetaCreditoDao.asociarTarjetaPasion(11L, pasionesId6);
        Long[] pasionesId7 = {5L};
        tarjetaCreditoDao.asociarTarjetaPasion(12L, pasionesId7);
        tarjetaCreditoDao.asociarTarjetaPasion(13L, pasionesId7);
        tarjetaCreditoDao.asociarTarjetaPasion(14L, pasionesId7);
        tarjetaCreditoDao.asociarTarjetaPasion(15L, pasionesId7);
        tarjetaCreditoDao.asociarTarjetaPasion(16L, pasionesId7);
        tarjetaCreditoDao.asociarTarjetaPasion(17L, pasionesId7);
        Long[] pasionesId8 = {4L};
        tarjetaCreditoDao.asociarTarjetaPasion(18L, pasionesId8);*/
    }
}
