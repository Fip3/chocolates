CREATE DATABASE IF NOT EXISTS `chocolateLosLagos` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `chocolateLosLagos`;

CREATE TABLE IF NOT EXISTS `chocolate` (
  `codigo` TINYINT(3) NOT NULL,
  `nombre` VARCHAR(20) NOT NULL,
  `descripcion` VARCHAR(300) NOT NULL,
  `precioVenta` INT(10) NOT NULL,
  `cantidad` INT(10) NOT NULL,
  `tipoChocolate` CHAR(1) NOT NULL,
  `saborChocolate` VARCHAR(20) NOT NULL,
  `marca` VARCHAR(20) NOT NULL,
  `azucar` BOOLEAN NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;