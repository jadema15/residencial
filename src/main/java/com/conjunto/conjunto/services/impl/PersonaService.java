package com.conjunto.conjunto.services.impl;

import com.conjunto.conjunto.mappers.PersonaMapper;
import com.conjunto.conjunto.models.DTO.PersonaDTO;
import com.conjunto.conjunto.models.PersonaEntity;
import com.conjunto.conjunto.repository.PersonaRepository;
import com.conjunto.conjunto.services.IPersonaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonaService implements IPersonaService {

    private PersonaRepository personaRepository;
    @Override
    public List<PersonaDTO> getPersonaAll() {
        List<PersonaEntity> listaPersonas = personaRepository.findAll();
        if(!listaPersonas.isEmpty()){
         return PersonaMapper.INSTANCE.listToDTO(listaPersonas);
        }
        return new ArrayList<>();
    }

    @Override
    public PersonaDTO getPersonaById(Long id) {
        Optional<PersonaEntity> personaEntity = personaRepository.findById(id);
        return personaEntity.map(PersonaMapper.INSTANCE::toDTO).orElse(null);
    }
}
