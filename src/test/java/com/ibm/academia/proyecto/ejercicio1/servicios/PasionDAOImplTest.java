package com.ibm.academia.proyecto.ejercicio1.servicios;

import com.ibm.academia.proyecto.ejercicio1.repositorios.PasionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

@SpringBootTest
class PasionDAOImplTest {
    @MockBean
    private PasionRepository pasionRepository;

    @Autowired
    private PasionDAO pasionDao;

    @Test
    void findPasionsByNombreContains() {
        // When
        pasionDao.findPasionsByNombreContains(anyString());
        // Then
        verify(pasionRepository).findPasionsByNombreContains(anyString());
    }
}