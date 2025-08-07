package com.conjunto.conjunto.services;

import com.conjunto.conjunto.models.DTO.PersonaDTO;

import java.util.List;

public interface IPersonaService {
    List<PersonaDTO> getPersonaAll();
    PersonaDTO getPersonaById(Long id);
}
