package com.conjunto.conjunto.controller;

import com.conjunto.conjunto.models.TipoDocumentoEntity;
import com.conjunto.conjunto.services.ITipoDocumentoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/tipo-documento")
public class TipoDocumentoController implements ITipoDocumentoService {

    private ITipoDocumentoService tipoDocumentoService;
    @Override
    @GetMapping()
    public List<TipoDocumentoEntity> getTipoDocumentos() {
        return tipoDocumentoService.getTipoDocumentos();
    }
}
