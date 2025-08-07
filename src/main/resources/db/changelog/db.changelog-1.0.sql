--liquibase formatted sql

--changeset jadelgado:1
DROP TABLE IF EXISTS tipo_documento;
CREATE TABLE tipo_documento (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

--changeset jadelgado:2
DROP TABLE IF EXISTS persona;
CREATE TABLE persona (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    primer_nombre VARCHAR(100),
    segundo_nombre VARCHAR(100),
    primer_apellido VARCHAR(100),
    segundo_apellido VARCHAR(100),
    fecha_nacimiento DATE,
    sexo TINYINT,
    celular VARCHAR(20),
    direccion VARCHAR(255),
    foto BLOB,
    fecha_registro DATETIME,
    status BOOLEAN,
    tipo_documento_id BIGINT NOT NULL,
    CONSTRAINT fk_persona_tipo_documento FOREIGN KEY (tipo_documento_id) REFERENCES tipo_documento(id)
);
