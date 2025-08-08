--liquibase formatted sql

--changeset jadelgado:1
ALTER TABLE persona ADD COLUMN documento VARCHAR(12);

--changeset jadelgado:2
ALTER TABLE persona MODIFY COLUMN primer_nombre VARCHAR(50) NOT NULL;
ALTER TABLE persona MODIFY COLUMN primer_apellido VARCHAR(50) NOT NULL;
ALTER TABLE persona MODIFY COLUMN celular VARCHAR(10) NOT NULL;
ALTER TABLE persona MODIFY COLUMN fecha_registro DATETIME NOT NULL;
ALTER TABLE persona MODIFY COLUMN status VARCHAR(1) NOT NULL;
ALTER TABLE persona MODIFY COLUMN tipo_documento_id BIGINT NOT NULL;
ALTER TABLE persona MODIFY COLUMN documento VARCHAR(15) NOT NULL;
