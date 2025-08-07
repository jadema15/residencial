package com.conjunto.conjunto.mappers;

import com.conjunto.conjunto.models.DTO.PersonaDTO;
import com.conjunto.conjunto.models.PersonaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PersonaMapper {

    PersonaMapper INSTANCE = Mappers.getMapper(PersonaMapper.class);

    PersonaDTO toDTO(PersonaEntity personaEntity);
    PersonaEntity toEntity(PersonaDTO personaDTO);
    List<PersonaDTO> listToDTO(List<PersonaEntity> list);
}
