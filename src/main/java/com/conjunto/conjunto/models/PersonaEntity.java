package com.conjunto.conjunto.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Blob;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "persona")
public class PersonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String primerNombre;
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
    @ManyToOne
    private TipoDocumentoEntity tipoDocumento;
    private String documento;
}
