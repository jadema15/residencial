package com.conjunto.conjunto.controller;

import com.conjunto.conjunto.services.ITipoDocumentoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/tipo-documento")
public class TipoDocumentoController {

    private ITipoDocumentoService tipoDocumentoService;

    @GetMapping("/status")
    public String getStatus(){
        return "Conexion es correcta";
    }

    @GetMapping("/valida-numero")
    public Long getValidaNumero(){
        return 10L;
    }

    @GetMapping("/valida-boolean")
    public Boolean getValidaBoolean(){
        return true;
    }
}
