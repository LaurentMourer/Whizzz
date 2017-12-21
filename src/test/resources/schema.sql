CREATE TABLE feature
(
  id          BIGINT AUTO_INCREMENT PRIMARY KEY,
  status      TINYINT(1)                          NULL,
  description VARCHAR(255)                        NULL,
  ready       TINYINT(1)                          NOT NULL,
  created     TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
  modified    TIMESTAMP                           NULL
);
