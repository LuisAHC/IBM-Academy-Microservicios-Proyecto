package com.ibm.academia.proyecto.ejercicio1.servicios;

import com.ibm.academia.proyecto.ejercicio1.repositorios.TarjetaCreditoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.*;
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

    @Test
    void buscarTarjetasPorSalario() {
        // When
        tarjetaCreditoDao.buscarTarjetasPorSalario(anyDouble());
        // Then
        verify(tarjetaCreditoRepository).buscarTarjetasPorSalario(anyDouble());
    }

    @Test
    void buscarTarjetasPorEdad() {
        // When
        tarjetaCreditoDao.buscarTarjetasPorEdad(anyInt());
        // Then
        verify(tarjetaCreditoRepository).buscarTarjetasPorEdad(anyInt());
    }

    @Test
    void buscarTarjetasPorPasion() {
        // When
        tarjetaCreditoDao.buscarTarjetasPorPasion(anyString());
        // Then
        verify(tarjetaCreditoRepository).buscarTarjetasPorPasion(anyString());
    }
}