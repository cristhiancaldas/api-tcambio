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
  (1, 'USDPEN', 'USD', 'PEN', 3.8091),
  (2, 'USDEUR', 'USD', 'EUR', 3.7459),
  (3, 'USDJPY', 'USD', 'JPY', 2.3679);

 /* (4, 'PENUSD', 'PEN', 'USD', 3.2569),
  (5, 'PENEUR', 'PEN', 'EUR', 3.9819),
  (6, 'PENJPY', 'PEN', 'JPY', 3.7599),

  (7, 'EURPEN', 'EUR', 'PEN', 2.6549),
  (8, 'EURUSD', 'EUR', 'USD', 4.2549),
  (9, 'EURJPY', 'EUR', 'JPY', 5.2459),

  (10, 'JPYPEN', 'JPY', 'PEN', 2.6579),
  (11, 'JPYUSD', 'JPY', 'USD', 4.2559),
  (12, 'JPYEUR', 'JPY', 'EUR', 5.2479);*/

SELECT * FROM tarifario;