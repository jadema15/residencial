package com.conjunto.conjunto.mappers;

import com.conjunto.conjunto.models.DTO.TipoDocumentoDTO;
import com.conjunto.conjunto.models.TipoDocumentoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TipoDocumentoMapper {
    TipoDocumentoMapper INSTANCE = Mappers.getMapper(TipoDocumentoMapper.class);
    TipoDocumentoDTO toDTO(TipoDocumentoEntity tipoDocumentoEntity);
    TipoDocumentoEntity toEntity(TipoDocumentoDTO tipoDocumentoDTO);
    List<TipoDocumentoDTO> listToDTO(List<TipoDocumentoEntity> list);
}
