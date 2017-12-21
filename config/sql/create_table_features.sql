CREATE TABLE feature
(
  id          INT AUTO_INCREMENT
    PRIMARY KEY,
  status      TINYINT(1)                          NULL,
  description VARCHAR(255)                        NULL,
  ready       TINYINT(1)                          NOT NULL,
  created     TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
  modified    TIMESTAMP                           NULL,
  CONSTRAINT feature_id_uindex
  UNIQUE (id)
);
