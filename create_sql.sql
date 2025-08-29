CREATE TABLE IF NOT EXISTS produto (
    id        INTEGER         PRIMARY KEY AUTOINCREMENT
                              NOT NULL,
    descricao TEXT (100)      NOT NULL,
    saldo     NUMERIC (15, 2) NOT NULL,
    preco     NUMERIC (15, 2) NOT NULL
);
