package com.conjunto.conjunto.services;

import com.conjunto.conjunto.models.DTO.TipoDocumentoDTO;
import com.conjunto.conjunto.models.TipoDocumentoEntity;

import java.util.List;

public interface ITipoDocumentoService {
    List<TipoDocumentoEntity> getTipoDocumentos();
}
