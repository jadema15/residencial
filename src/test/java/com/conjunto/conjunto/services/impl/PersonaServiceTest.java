package com.conjunto.conjunto.services.impl;

import com.conjunto.conjunto.models.DTO.PersonaDTO;
import com.conjunto.conjunto.models.PersonaEntity;
import com.conjunto.conjunto.repository.PersonaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class PersonaServiceTest {

    private static Long NUMBER_ID = 1L;
    private static String NUMERO_DOCUMENTO = "13072001";

    private PersonaRepository personaRepository;
    private PersonaService personaService;

    @BeforeEach
    void setUp() {
        personaRepository = Mockito.mock(PersonaRepository.class);
        personaService = new PersonaService(personaRepository);
    }


    @Test
    void testGetPersonaAll_withResults() {
        // Arrange

        List<PersonaEntity> listMock = List.of(
                PersonaEntity.builder().id(1L).primerNombre("jairo").primerApellido("delgado").build(),
                PersonaEntity.builder().id(2L).primerNombre("weimar").primerApellido("martinez").build());

        when(personaRepository.findAll()).thenReturn(listMock);

        // Act
        List<PersonaDTO> result = personaService.getPersonaAll();

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("jairo", result.get(0).getPrimerNombre());
    }

    @Test
    void testGetPersonaAll_withOutResults() {
        // Arrange
        List<PersonaEntity> emptyList = List.of();
        when(personaRepository.findAll()).thenReturn(emptyList);

        // Act
        List<PersonaDTO> result = personaService.getPersonaAll();

        // Assert
        assertEquals(0, result.size());
    }

    @Test
    void testGetPersonaById_withResults() {
        // Arrange
        PersonaEntity persona =  PersonaEntity.builder().id(1L).primerNombre("jairo").primerApellido("delgado").build();
        when(personaRepository.findById(NUMBER_ID)).thenReturn(Optional.ofNullable(persona));

        // Act
        PersonaDTO result = personaService.getPersonaById(NUMBER_ID);

        // Assert
        assertNotNull(result);
        assertEquals("jairo", result.getPrimerNombre());
    }

    @Test
    void testGetPersonaById_withOutResult() {
        // Arrange
        when(personaRepository.findById(NUMBER_ID)).thenReturn(Optional.empty());

        // Act
        PersonaDTO result = personaService.getPersonaById(NUMBER_ID);

        // Assert
        assertNull(result);
    }

    @Test
    void testGetPersonaByDocumento_withResults(){
        //Arrange
        PersonaEntity persona = PersonaEntity.builder().primerApellido("delgado").primerNombre("jairo").documento("13072001").build();
        when(personaRepository.findByDocumento(NUMERO_DOCUMENTO)).thenReturn(Optional.ofNullable(persona));

        //Act
        PersonaDTO result = personaService.getPersonaByDocumento(NUMERO_DOCUMENTO);

        //Asserts
        assertNotNull(result);
        assertEquals(NUMERO_DOCUMENTO, result.getDocumento());
    }

    @Test
    void testGetPersonaByDocumento_withOutResult(){
        //Arrange
        when(personaRepository.findByDocumento(NUMERO_DOCUMENTO)).thenReturn(Optional.empty());

        //Act
        PersonaDTO result = personaService.getPersonaByDocumento(NUMERO_DOCUMENTO);

        //Asserts
        assertNull(result);
    }
}