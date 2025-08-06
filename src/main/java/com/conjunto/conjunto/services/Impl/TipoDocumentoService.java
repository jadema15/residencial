package com.conjunto.conjunto.services.Impl;

import com.conjunto.conjunto.models.TipoDocumentoEntity;
import com.conjunto.conjunto.services.ITipoDocumentoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TipoDocumentoService implements ITipoDocumentoService {

    @Override
    public List<TipoDocumentoEntity> getTipoDocumentos() {
        return null;
    }
}
