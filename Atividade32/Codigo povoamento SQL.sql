CREATE TABLE podcast (
    id INT PRIMARY KEY AUTO_INCREMENT,
    produtor VARCHAR(100),
    nome_episodio VARCHAR(150),
    numero_episodio INT,
    duracao varchar(7),
    url_repo VARCHAR(255)
);
INSERT INTO podcast (produtor, nome_episodio, numero_episodio, duracao, url_repo) VALUES
('Ana Costa', 'Tecnologia e Futuro', 2, '00:35:20', 'https://github.com/anacosta/techfuture'),
('Carlos Nunes', 'Histórias de Programadores', 3, '00:50:00', 'https://github.com/cnunes/devstories'),
('Fernanda Lopes', 'Inteligência Artificial na Vida Real', 4, '00:42:10', 'https://github.com/fernandalopes/ai-real'),
('João Silva', 'A Jornada do Conhecimento', 5, '00:38:55', 'https://github.com/joaosilva/conhecimento'),
('Beatriz Ramos', 'Mundo dos Dados', 6, '01:05:00', 'https://github.com/beatrizramos/dataverse'); /* o chat gpt gerou pra mim, é muito util nessas horas */
CREATE TABLE usuarios (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    tipo VARCHAR(20) NOT NULL
);
INSERT INTO usuarios (nome, senha, tipo)
VALUES 
('Admin Master', 'admin123', 'ADMIN'),
('Carlos Operador', 'operador123', 'OPERADOR'),
('João Usuário', 'usuario123', 'USUARIO');