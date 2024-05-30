INSERT INTO categoria_model (id, nome, status) VALUES (1, 'Categoria 1', true);
INSERT INTO categoria_model (id, nome, status) VALUES (2, 'Categoria 2', true);
INSERT INTO categoria_model (id, nome, status) VALUES (3, 'Categoria 2', true);

INSERT INTO marca_model (id, nome, status, id_categoria) VALUES (1, 'Marca 1', true, 1);
INSERT INTO marca_model (id, nome, status, id_categoria) VALUES (2, 'Marca 2', true, 2);
INSERT INTO marca_model (id, nome, status, id_categoria) VALUES (3, 'Marca 3', true, 3);

INSERT INTO modelo_model (id, nome, status, id_marca) VALUES (1, 'Modelo 1', true, 1);
INSERT INTO modelo_model (id, nome, status, id_marca) VALUES (2, 'Modelo 2', true, 2);
INSERT INTO modelo_model (id, nome, status, id_marca) VALUES (6, 'Modelo 6', true, 2);
INSERT INTO modelo_model (id, nome, status, id_marca) VALUES (3, 'Modelo 3', true, 3);
INSERT INTO modelo_model (id, nome, status, id_marca) VALUES (4, 'Modelo 4', true, 3);
INSERT INTO modelo_model (id, nome, status, id_marca) VALUES (5, 'Modelo 5', true, 3);