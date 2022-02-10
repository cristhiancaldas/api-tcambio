DROP TABLE IF EXISTS tarifario;
DROP SEQUENCE IF EXISTS tarifario_seq;

CREATE sequence tarifario_seq START WITH 3 INCREMENT BY 1;

CREATE TABLE tarifario (
  id bigint default tarifario_seq.nextval  PRIMARY KEY,
  codigo VARCHAR(6) NOT NULL,
  origen VARCHAR(3) NOT NULL,
  destino VARCHAR(3) NOT NULL,
  factor NUMERIC(16,4) DEFAULT NULL
);

INSERT INTO tarifario (id, codigo, origen, destino, factor) VALUES
  (1, 'USDPEN', 'USD', 'PEN', 3.8001),
  (2, 'PENUSD', 'PEN', 'USD', 3.9815);
  
SELECT * FROM tarifario;