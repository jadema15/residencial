package com.conjunto.conjunto.services.impl;

import com.conjunto.conjunto.mappers.TipoDocumentoMapper;
import com.conjunto.conjunto.models.DTO.TipoDocumentoDTO;
import com.conjunto.conjunto.models.TipoDocumentoEntity;
import com.conjunto.conjunto.repository.TipoDocumentoRepository;
import com.conjunto.conjunto.services.ITipoDocumentoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TipoDocumentoService implements ITipoDocumentoService {

    private TipoDocumentoRepository tipoDocumentoRepository;

    @Override
    public List<TipoDocumentoDTO> getTipoDocumentos() {
        return TipoDocumentoMapper.INSTANCE.listToDTO(tipoDocumentoRepository.findAll());
    }

    public TipoDocumentoDTO getTipoDocumentoById(Long id) {
        Optional<TipoDocumentoEntity> tipoDocumento = tipoDocumentoRepository.findById(id);
        return tipoDocumento.map(TipoDocumentoMapper.INSTANCE::toDTO).orElse(null);
    }
}
