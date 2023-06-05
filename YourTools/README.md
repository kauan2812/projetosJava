# Tabelas necessárias:
CREATE TABLE IF NOT EXISTS `db_yourtools`.`tb_ferramentas` (
  `id` INT NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `marca` VARCHAR(45) NOT NULL,
  `custoAquisicao` DOUBLE NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB

CREATE TABLE IF NOT EXISTS `db_yourtools`.`tb_amigos` (
  `id` INT NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `telefone` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB

# Mudar o acesso do banco de dados em: YourTools > src > DAO > YourToolsDAO.java
