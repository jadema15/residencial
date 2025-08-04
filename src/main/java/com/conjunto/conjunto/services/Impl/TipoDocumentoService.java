package com.conjunto.conjunto.services.Impl;

import com.conjunto.conjunto.models.DTO.TipoDocumentoDTO;
import com.conjunto.conjunto.models.TipoDocumentoEntity;
import com.conjunto.conjunto.repository.TipoDocumentoRepository;
import com.conjunto.conjunto.services.ITipoDocumentoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TipoDocumentoService implements ITipoDocumentoService {

    private TipoDocumentoRepository tipoDocumentoRepository;

    @Override
    public List<TipoDocumentoEntity> getTipoDocumentos() {
        return tipoDocumentoRepository.findAll();
    }
}
