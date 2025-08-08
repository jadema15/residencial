package com.conjunto.conjunto.services.impl;

import com.conjunto.conjunto.models.DTO.TipoDocumentoDTO;
import com.conjunto.conjunto.models.TipoDocumentoEntity;
import com.conjunto.conjunto.repository.TipoDocumentoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class TipoDocumentoServiceTest {

    private TipoDocumentoService tipoDocumentoService;
    private TipoDocumentoRepository tipoDocumentoRepository;

    private static Long TIPO_DOCUMENTO_ID = 1L;

    @BeforeEach
        void setup(){
        tipoDocumentoRepository = Mockito.mock(TipoDocumentoRepository.class);
        tipoDocumentoService = new TipoDocumentoService(tipoDocumentoRepository);
        }

        @Test
        void testGetTipoDocumentoAll_withResults() {

            //Arrange
            List<TipoDocumentoEntity> listTipoDocumento = List.of(
                    new TipoDocumentoEntity(1L, "rc"),
                    new TipoDocumentoEntity(2L, "ti"));
            when(tipoDocumentoRepository.findAll()).thenReturn(listTipoDocumento);

            //Act
            List<TipoDocumentoDTO> results = tipoDocumentoService.getTipoDocumentos();

            //Assert
            assertNotNull(results);
            assertEquals(2, results.size());
            assertEquals("rc", results.get(0).getNombre());
    }

    @Test
    void testGetTipoDocumentoById_withResult() {
        // Arrange
        TipoDocumentoEntity mockEntity = new TipoDocumentoEntity(TIPO_DOCUMENTO_ID, "RC");
        when(tipoDocumentoRepository.findById(TIPO_DOCUMENTO_ID)).thenReturn(Optional.of(mockEntity));

        // Act
        TipoDocumentoDTO result = tipoDocumentoService.getTipoDocumentoById(TIPO_DOCUMENTO_ID);

        // Assert
        assertNotNull(result, "El resultado no debe ser null");
        assertEquals("RC", result.getNombre(), "El nombre del tipo de documento no coincide");
    }

    @Test
    void testGetTipoDocumentoById_witOutResult(){
        //Arrange
        when(tipoDocumentoRepository.findById(TIPO_DOCUMENTO_ID)).thenReturn(Optional.empty());

        //Act
        TipoDocumentoDTO result = tipoDocumentoService.getTipoDocumentoById(TIPO_DOCUMENTO_ID);

        //Asserts
        assertNull(result);
    }
}