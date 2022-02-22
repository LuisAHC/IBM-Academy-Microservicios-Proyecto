package com.ibm.academia.proyecto.ejercicio1.servicios;

import com.ibm.academia.proyecto.ejercicio1.repositorios.TarjetaCreditoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

@SpringBootTest
class TarjetaCreditoDAOImplTest {
    @MockBean
    private TarjetaCreditoRepository tarjetaCreditoRepository;

    @Autowired
    private TarjetaCreditoDAO tarjetaCreditoDao;

    @Test
    void findTarjetaCreditosByNombreContains() {
        // When
        tarjetaCreditoDao.findTarjetaCreditosByNombreContains(anyString());
        // Then
        verify(tarjetaCreditoRepository).findTarjetaCreditosByNombreContains(anyString());
    }
}