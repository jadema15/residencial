package com.conjunto.conjunto.services;

import com.conjunto.conjunto.models.DTO.TipoDocumentoDTO;

import java.util.List;

public interface ITipoDocumentoService {
    List<TipoDocumentoDTO> getTipoDocumentos();
    TipoDocumentoDTO getTipoDocumentoById(Long id);
}
