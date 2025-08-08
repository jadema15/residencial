package com.conjunto.conjunto.models.DTO;

import lombok.Data;

import java.sql.Blob;
import java.util.Date;

@Data
public class PersonaDTO {

    private Long id;
    private String primerNombre;
    private TipoDocumentoDTO tipoDocumento;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private Byte sexo;
    private String celular;
    private String direccion;
    private Blob foto;
    private Date fechaRegistro;
    private Boolean status;
    private String documento;
}