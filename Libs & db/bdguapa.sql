-- --------------------------------------------------------
-- Host:                         localhost
-- Versión del servidor:         8.0.13 - MySQL Community Server - GPL
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.5.0.5332
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para bdguapa
DROP DATABASE IF EXISTS `bdguapa`;
CREATE DATABASE IF NOT EXISTS `bdguapa` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `bdguapa`;

-- Volcando estructura para tabla bdguapa.clientes
DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `idcliente` varchar(5) NOT NULL,
  `clinombre` text NOT NULL,
  `clirfc` varchar(13) NOT NULL,
  `clitelefono` varchar(10) NOT NULL,
  `clicorreoelectronico` varchar(60) NOT NULL,
  `clidireccion` varchar(60) NOT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla bdguapa.clientes: ~9 rows (aproximadamente)
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` (`idcliente`, `clinombre`, `clirfc`, `clitelefono`, `clicorreoelectronico`, `clidireccion`) VALUES
	('35165', 'FSEFEG', 'XAXX010101000', '7331548956', 'kjhgsivkgsdiv@hvjdsns.com', 'osbvijobfjivbs'),
	('55555', 'YO XD XD', 'ADASFAF324324', '2346456546', 'afffwfe@gm', 'adf'),
	('C00', 'Cliente general', 'XAXX010101000', '0', '0', '0'),
	('C01', 'Cliente Numero Uno', 'VECJ880326UNO', '7331234569', 'cliente1@gmail.com', 'calle uno colonia uno #1'),
	('C02', 'Cliente Numero Dos', 'OPTJ880326DOS', '7334512689', 'cliente2@gmai.com', 'calle dos colonia dos #2'),
	('C03', 'Cliente Numero Tres', 'VECJ880326TRE', '7331524896', 'Cliente3@gmail.com', 'calle tres colonia tres #3'),
	('C04', 'Cliente Numero Cuatro', 'VECJ880326CUA', '7338524697', 'Cliente4@gmail.com', 'calle cuatro colonia cuatro #4'),
	('C05', 'Cliente Numero Cinco', 'ERFV880326PPP', '7335987855', 'Cliente5@gmail.com', 'calle cinco colonia cinco #5'),
	('C06', 'Yonathan Roman Salgado De sotelo', 'ROSY961211KLP', '7331089089', 'YONATHANROMAN@HOTMAIL.COM', 'PABLO GALEANA #30 COL. JUAN N ALVAREZ');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;

-- Volcando estructura para tabla bdguapa.productos
DROP TABLE IF EXISTS `productos`;
CREATE TABLE IF NOT EXISTS `productos` (
  `idproducto` varchar(13) NOT NULL,
  `prodnombre` text NOT NULL,
  `prodcantidad` int(4) NOT NULL,
  `prodprecio` double NOT NULL,
  `prodescuento` int(5) NOT NULL,
  `prodexistencia` int(4) NOT NULL,
  `idcategoria` varchar(5) NOT NULL,
  `catnombre` text NOT NULL,
  `catdescripcion` text NOT NULL,
  PRIMARY KEY (`idproducto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla bdguapa.productos: ~18 rows (aproximadamente)
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` (`idproducto`, `prodnombre`, `prodcantidad`, `prodprecio`, `prodescuento`, `prodexistencia`, `idcategoria`, `catnombre`, `catdescripcion`) VALUES
	('102', 'Camisa', 20, 100, 0, 9, '12345', 'Nombre Prueba', 'Descripcion de mi categoria'),
	('103', 'abc', 200, 100.5, 10, 196, '12345', 'abcd', 'abcdefg'),
	('104', 'Prueba', 200, 99.99, 10, 198, '12345', 'nombre caat', 'descrip cat'),
	('105', 'prueba', 49, 98.99, 10, 48, '125', 'Error', 'Error 404'),
	('120', 'Prueba decimales', 500, 100, 10, 470, '123', 'Prueba De', 'Decimales papa'),
	('1234567890123', 'este', 50, 100, 0, 44, '12345', 'Nombre Prueba', 'Descripcion de mi categoria'),
	('1234567891234', 'Nombre De Mi Procucto', 200, 1500, 0, 163, '12345', 'Nombre Prueba', 'Descripcion de mi categoria'),
	('1234567899632', 'Nombre de mi Producto', 200, 2000, 25, 163, '54216', 'Mi Categoria', 'La descripcion de mis productos'),
	('124', 'Producto #4', 60, 130, 0, 40, '123', 'Ropa', 'Ropa xd'),
	('202', 'Pantalon', 20, 200, 0, 56, '123', 'Pantalones', 'Pantalones de marca'),
	('404', 'Not Found', 60, 404, 0, 251, '125', 'Error', 'Error 404'),
	('456', 'Producto #3', 45, 9000, 30, 8, '123', 'Ropa', 'Descripcion xd'),
	('505', 'Zapatos', 15, 166, 0, 32, '126', 'Zapatos', 'zapatos de marca'),
	('5964812357894', 'playera', 120, 100, 0, 75, '12365', 'playeras marca', 'mis playeras xd'),
	('606', 'Bolsa ', 60, 100, 0, 50, '123', 'Ropa', 'Ropa xd'),
	('759', 'Decimales xd', 100, 99.99, 20, 117, '123', 'Decimales xD', 'Decimales papu :v'),
	('789', 'Producto #1', 3, 300, 10, 14, '123', 'Ropa', 'Ropa Guapa'),
	('963', 'Producto #5', 60, 506, 20, 2972, '123', 'Ropa', 'Ropa xd');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;

-- Volcando estructura para tabla bdguapa.proveedores
DROP TABLE IF EXISTS `proveedores`;
CREATE TABLE IF NOT EXISTS `proveedores` (
  `idproveedor` varchar(5) NOT NULL,
  `pronombre` text NOT NULL,
  `protelefono` varchar(10) NOT NULL,
  `prodireccion` varchar(60) NOT NULL,
  `propaginaweb` varchar(60) NOT NULL,
  `procorreoelectronico` varchar(60) NOT NULL,
  PRIMARY KEY (`idproveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla bdguapa.proveedores: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
INSERT INTO `proveedores` (`idproveedor`, `pronombre`, `protelefono`, `prodireccion`, `propaginaweb`, `procorreoelectronico`) VALUES
	('P01', 'YONATHAN ROMAN', '7331089089', 'calle calle colonia chapultepec #18', 'www.google.com.mx', 'yonathanr11.12@gmail.com.mx'),
	('P02', 'Proveedor #1', '7331231212', 'colonia calle #1', 'www.faebook.com', 'proveedor1@gmail.com'),
	('P03', 'Proveedor #2', '7331548765', 'colonia calle #2', 'www.yahoo.com', 'proveedor2@gmail.com'),
	('P04', 'Proveedor #3', '7331576495', 'colonia calle #3', 'www.bing.com', 'proveedor3@gmail.com');
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;

-- Volcando estructura para tabla bdguapa.usuarios
DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `idusuario` varchar(5) NOT NULL,
  `usuuser` varchar(20) NOT NULL,
  `usunombre` text NOT NULL,
  `usucontra` varchar(15) NOT NULL,
  `usutelefono` varchar(10) NOT NULL,
  `usupermisos` varchar(14) NOT NULL,
  `usudireccion` varchar(60) NOT NULL,
  `usuestadocuenta` varchar(11) NOT NULL,
  `intentos` int(1) NOT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla bdguapa.usuarios: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`idusuario`, `usuuser`, `usunombre`, `usucontra`, `usutelefono`, `usupermisos`, `usudireccion`, `usuestadocuenta`, `intentos`) VALUES
	('001', 'Yonathan', 'Yonathan Román Salgado', 'roman', '7335553366', 'ADMINISTRADOR', 'Col. Colonia, calle Avenida #100', 'ACTIVADA', 3),
	('002', 'Alfredo', 'Alfredo Peralta Garcia', '123', '7331234567', 'NORMAL', 'Col. Colonia, calle Avenida #101', 'ACTIVADA', 3),
	('003', 'Jose', 'Jose Velazquez Jimenez', 'velazquez', '7331234568', 'NORMAL', 'Col. Colonia, calle Avenida #102', 'ACTIVADA', 3),
	('004', 'Carlos', 'Carlos Diaz Sandoval', 'diaz', '7331023948', 'NORMAL', 'Col. Colonia, calle Avenida #103', 'ACTIVADA', 3),
	('005', 'Ignacio', 'Ignacio Tetitlan Palatzin', 'tetitlan', '7331233212', 'NORMAL', 'Col. Colonia, calle Avenida #104', 'ACTIVADA', 3),
	('20', 'Ejemplo', 'Ejemplo apellido apellido', '123', '7332141526', 'NORMAL', 'calle #13', 'BLOQUEADA', 0);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

-- Volcando estructura para tabla bdguapa.ventas
DROP TABLE IF EXISTS `ventas`;
CREATE TABLE IF NOT EXISTS `ventas` (
  `idventa` int(11) NOT NULL,
  `comnombrearticulo` text NOT NULL,
  `precioarticulo` int(10) NOT NULL,
  `comnombrevendedor` text NOT NULL,
  `comnombrecliente` text NOT NULL,
  `comdescuento` varchar(5) NOT NULL,
  `comfecha` varchar(20) NOT NULL,
  `commontototal` int(7) NOT NULL,
  `nomcantidadarticulosvendidos` int(4) NOT NULL,
  `importe` varchar(10) NOT NULL,
  `cambio` varchar(20) NOT NULL,
  `total` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla bdguapa.ventas: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` (`idventa`, `comnombrearticulo`, `precioarticulo`, `comnombrevendedor`, `comnombrecliente`, `comdescuento`, `comfecha`, `commontototal`, `nomcantidadarticulosvendidos`, `importe`, `cambio`, `total`) VALUES
	(1, 'Decimales xd', 80, 'Administrador', 'Cliente General', '20%', '17/05/2018', 80, 1, '20000.0', '790.4080000000031', '$19,209.59'),
	(1, 'Nombre De Mi Procucto', 1500, 'Administrador', 'Cliente General', '0%', '17/05/2018', 1500, 1, '20000.0', '790.4080000000031', '$19,209.59'),
	(1, 'Nombre de mi Producto', 1500, 'Administrador', 'Cliente General', '25%', '17/05/2018', 1500, 1, '20000.0', '790.4080000000031', '$19,209.59'),
	(1, 'Not Found', 404, 'Administrador', 'Cliente General', '0%', '17/05/2018', 808, 2, '20000.0', '790.4080000000031', '$19,209.59'),
	(1, 'Pantalon', 200, 'Administrador', 'Cliente General', '0%', '17/05/2018', 400, 2, '20000.0', '790.4080000000031', '$19,209.59'),
	(1, 'playera', 100, 'Administrador', 'Cliente General', '0%', '17/05/2018', 200, 2, '20000.0', '790.4080000000031', '$19,209.59'),
	(1, 'Producto #1', 270, 'Administrador', 'Cliente General', '10%', '17/05/2018', 540, 2, '20000.0', '790.4080000000031', '$19,209.59'),
	(1, 'Producto #3', 6300, 'Administrador', 'Cliente General', '30%', '17/05/2018', 12600, 2, '20000.0', '790.4080000000031', '$19,209.59'),
	(1, 'Producto #4', 130, 'Administrador', 'Cliente General', '0%', '17/05/2018', 260, 2, '20000.0', '790.4080000000031', '$19,209.59'),
	(1, 'Producto #5', 405, 'Administrador', 'Cliente General', '20%', '17/05/2018', 810, 2, '20000.0', '790.4080000000031', '$19,209.59'),
	(1, 'Prueba decimales', 90, 'Administrador', 'Cliente General', '10%', '17/05/2018', 180, 2, '20000.0', '790.4080000000031', '$19,209.59'),
	(1, 'Zapatos', 166, 'Administrador', 'Cliente General', '0%', '17/05/2018', 332, 2, '20000.0', '790.4080000000031', '$19,209.59'),
	(2, 'Zapatos', 166, 'Administrador', 'Cliente General', '0%', '17/05/2018', 332, 2, '63500.0', '792.4160000000047', '$62,707.58'),
	(2, 'Not Found', 404, 'Administrador', 'Cliente General', '0%', '17/05/2018', 1212, 3, '63500.0', '792.4160000000047', '$62,707.58'),
	(2, 'Prueba decimales', 90, 'Administrador', 'Cliente General', '10%', '17/05/2018', 270, 3, '63500.0', '792.4160000000047', '$62,707.58'),
	(2, 'Pantalon', 200, 'Administrador', 'Cliente General', '0%', '17/05/2018', 800, 4, '63500.0', '792.4160000000047', '$62,707.58'),
	(2, 'playera', 100, 'Administrador', 'Cliente General', '0%', '17/05/2018', 800, 8, '63500.0', '792.4160000000047', '$62,707.58'),
	(2, 'Producto #1', 270, 'Administrador', 'Cliente General', '10%', '17/05/2018', 2160, 8, '63500.0', '792.4160000000047', '$62,707.58'),
	(2, 'Producto #3', 6300, 'Administrador', 'Cliente General', '30%', '17/05/2018', 44100, 7, '63500.0', '792.4160000000047', '$62,707.58'),
	(2, 'Producto #4', 130, 'Administrador', 'Cliente General', '0%', '17/05/2018', 1040, 8, '63500.0', '792.4160000000047', '$62,707.58'),
	(2, 'Producto #5', 405, 'Administrador', 'Cliente General', '20%', '17/05/2018', 2834, 7, '63500.0', '792.4160000000047', '$62,707.58'),
	(2, 'Decimales xd', 80, 'Administrador', 'Cliente General', '20%', '17/05/2018', 160, 2, '63500.0', '792.4160000000047', '$62,707.58'),
	(2, 'Nombre De Mi Procucto', 1500, 'Administrador', 'Cliente General', '0%', '17/05/2018', 4500, 3, '63500.0', '792.4160000000047', '$62,707.58'),
	(2, 'Nombre de mi Producto', 1500, 'Administrador', 'Cliente General', '25%', '17/05/2018', 4500, 3, '63500.0', '792.4160000000047', '$62,707.58'),
	(3, 'Bolsa ', 100, 'Yonathan Román Salgado', 'Cliente General', '0%', '17/05/2018', 100, 1, '12000.0', '821.2080000000005', '$11,178.79'),
	(3, 'Camisa ', 100, 'Yonathan Román Salgado', 'Cliente General', '0%', '17/05/2018', 100, 1, '12000.0', '821.2080000000005', '$11,178.79'),
	(3, 'Decimales xd', 80, 'Yonathan Román Salgado', 'Cliente General', '20%', '17/05/2018', 80, 1, '12000.0', '821.2080000000005', '$11,178.79'),
	(3, 'Nombre De Mi Procucto', 1500, 'Yonathan Román Salgado', 'Cliente General', '0%', '17/05/2018', 1500, 1, '12000.0', '821.2080000000005', '$11,178.79'),
	(3, 'Nombre de mi Producto', 1500, 'Yonathan Román Salgado', 'Cliente General', '25%', '17/05/2018', 1500, 1, '12000.0', '821.2080000000005', '$11,178.79'),
	(3, 'Not Found', 404, 'Yonathan Román Salgado', 'Cliente General', '0%', '17/05/2018', 404, 1, '12000.0', '821.2080000000005', '$11,178.79'),
	(3, 'Pantalon', 200, 'Yonathan Román Salgado', 'Cliente General', '0%', '17/05/2018', 200, 1, '12000.0', '821.2080000000005', '$11,178.79'),
	(3, 'playera', 100, 'Yonathan Román Salgado', 'Cliente General', '0%', '17/05/2018', 100, 1, '12000.0', '821.2080000000005', '$11,178.79'),
	(3, 'Producto #1', 270, 'Yonathan Román Salgado', 'Cliente General', '10%', '17/05/2018', 270, 1, '12000.0', '821.2080000000005', '$11,178.79'),
	(3, 'Producto #3', 6300, 'Yonathan Román Salgado', 'Cliente General', '30%', '17/05/2018', 6300, 1, '12000.0', '821.2080000000005', '$11,178.79'),
	(3, 'Producto #4', 130, 'Yonathan Román Salgado', 'Cliente General', '0%', '17/05/2018', 130, 1, '12000.0', '821.2080000000005', '$11,178.79'),
	(3, 'Producto #5', 405, 'Yonathan Román Salgado', 'Cliente General', '20%', '17/05/2018', 405, 1, '12000.0', '821.2080000000005', '$11,178.79'),
	(3, 'Prueba decimales', 90, 'Yonathan Román Salgado', 'Cliente General', '10%', '17/05/2018', 90, 1, '12000.0', '821.2080000000005', '$11,178.79'),
	(4, 'Producto #1', 270, 'Yonathan Román Salgado', 'Cliente Numero Cuatro', '10%', '17/05/2018', 270, 1, '14000.0', '465.2000000000007', '$13,534.80'),
	(4, 'Producto #5', 405, 'Yonathan Román Salgado', 'Cliente Numero Cuatro', '20%', '17/05/2018', 405, 1, '14000.0', '465.2000000000007', '$13,534.80'),
	(4, 'Producto #3', 6300, 'Yonathan Román Salgado', 'Cliente Numero Cuatro', '30%', '17/05/2018', 12600, 2, '14000.0', '465.2000000000007', '$13,534.80'),
	(4, 'Producto #4', 130, 'Yonathan Román Salgado', 'Cliente Numero Cuatro', '0%', '17/05/2018', 260, 2, '14000.0', '465.2000000000007', '$13,534.80'),
	(5, 'Nombre De Mi Procucto', 1500, 'Administrador', 'Cliente General', '0%', '17/05/2018', 1500, 1, '2000.0', '500.0', '$1,500.00'),
	(6, 'Producto #4', 130, 'Administrador', 'Cliente General', '0%', '17/05/2018', 260, 2, '300.0', '40.0', '$260.00'),
	(7, 'este', 100, 'Administrador', 'Cliente General', '0%', '17/05/2018', 200, 2, '200.0', '0.0', '$200.00'),
	(8, 'este', 100, 'Administrador', 'Cliente General', '0%', '17/05/2018', 200, 2, '200.0', '0.0', '$200.00'),
	(9, 'este', 100, 'Administrador', 'Cliente General', '0%', '17/05/2018', 200, 2, '200.0', '0.0', '$200.00'),
	(10, 'este', 100, 'Administrador', 'Cliente General', '0%', '17/05/2018', 200, 2, '200.0', '0.0', '$200.00'),
	(11, 'este', 100, 'Administrador', 'Cliente General', '0%', '17/05/2018', 200, 2, '200.0', '0.0', '$200.00'),
	(12, 'este', 100, 'Administrador', 'Cliente General', '0%', '17/05/2018', 200, 2, '200.0', '0.0', '$200.00'),
	(13, 'este', 100, 'Administrador', 'Cliente General', '0%', '17/05/2018', 200, 2, '200.0', '0.0', '$200.00'),
	(14, 'este', 100, 'Administrador', 'Cliente General', '0%', '17/05/2018', 200, 2, '200.0', '0.0', '$200.00'),
	(15, 'Producto #4', 130, 'Administrador', 'Cliente General', '0%', '18/05/2018', 130, 1, '200.0', '70.0', '$130.00'),
	(16, 'Decimales xd', 80, 'Administrador', 'Cliente General', '20%', '18/05/2018', 80, 1, '12000.0', '581.2080000000005', '$11,418.79'),
	(16, 'Nombre De Mi Procucto', 1500, 'Administrador', 'Cliente General', '0%', '18/05/2018', 1500, 1, '12000.0', '581.2080000000005', '$11,418.79'),
	(16, 'Nombre de mi Producto', 1500, 'Administrador', 'Cliente General', '25%', '18/05/2018', 1500, 1, '12000.0', '581.2080000000005', '$11,418.79'),
	(16, 'Not Found', 404, 'Administrador', 'Cliente General', '0%', '18/05/2018', 808, 2, '12000.0', '581.2080000000005', '$11,418.79'),
	(16, 'Pantalon', 200, 'Administrador', 'Cliente General', '0%', '18/05/2018', 200, 1, '12000.0', '581.2080000000005', '$11,418.79'),
	(16, 'playera', 100, 'Administrador', 'Cliente General', '0%', '18/05/2018', 100, 1, '12000.0', '581.2080000000005', '$11,418.79'),
	(16, 'Producto #1', 270, 'Administrador', 'Cliente General', '10%', '18/05/2018', 270, 1, '12000.0', '581.2080000000005', '$11,418.79'),
	(16, 'Producto #3', 6300, 'Administrador', 'Cliente General', '30%', '18/05/2018', 6300, 1, '12000.0', '581.2080000000005', '$11,418.79'),
	(16, 'Producto #5', 405, 'Administrador', 'Cliente General', '20%', '18/05/2018', 405, 1, '12000.0', '581.2080000000005', '$11,418.79'),
	(16, 'Prueba decimales', 90, 'Administrador', 'Cliente General', '10%', '18/05/2018', 90, 1, '12000.0', '581.2080000000005', '$11,418.79'),
	(16, 'Zapatos', 166, 'Administrador', 'Cliente General', '0%', '18/05/2018', 166, 1, '12000.0', '581.2080000000005', '$11,418.79'),
	(17, 'Nombre De Mi Procucto', 1500, 'Administrador', 'Cliente General', '0%', '18/05/2018', 1500, 1, '11000.0', '231.20000000000073', '$10,768.80'),
	(17, 'Nombre de mi Producto', 1500, 'Administrador', 'Cliente General', '25%', '18/05/2018', 1500, 1, '11000.0', '231.20000000000073', '$10,768.80'),
	(17, 'Not Found', 404, 'Administrador', 'Cliente General', '0%', '18/05/2018', 404, 1, '11000.0', '231.20000000000073', '$10,768.80'),
	(17, 'Pantalon', 200, 'Administrador', 'Cliente General', '0%', '18/05/2018', 200, 1, '11000.0', '231.20000000000073', '$10,768.80'),
	(17, 'playera', 100, 'Administrador', 'Cliente General', '0%', '18/05/2018', 100, 1, '11000.0', '231.20000000000073', '$10,768.80'),
	(17, 'Producto #1', 270, 'Administrador', 'Cliente General', '10%', '18/05/2018', 270, 1, '11000.0', '231.20000000000073', '$10,768.80'),
	(17, 'Producto #3', 6300, 'Administrador', 'Cliente General', '30%', '18/05/2018', 6300, 1, '11000.0', '231.20000000000073', '$10,768.80'),
	(17, 'Producto #5', 405, 'Administrador', 'Cliente General', '20%', '18/05/2018', 405, 1, '11000.0', '231.20000000000073', '$10,768.80'),
	(17, 'Prueba decimales', 90, 'Administrador', 'Cliente General', '10%', '18/05/2018', 90, 1, '11000.0', '231.20000000000073', '$10,768.80'),
	(18, 'Nombre de mi Producto', 1500, 'Administrador', 'Cliente General', '25%', '21/05/2018', 1500, 1, '10000.0', '731.2000000000007', '$9,268.80'),
	(18, 'Not Found', 404, 'Administrador', 'Cliente General', '0%', '21/05/2018', 404, 1, '10000.0', '731.2000000000007', '$9,268.80'),
	(18, 'Pantalon', 200, 'Administrador', 'Cliente General', '0%', '21/05/2018', 200, 1, '10000.0', '731.2000000000007', '$9,268.80'),
	(18, 'playera', 100, 'Administrador', 'Cliente General', '0%', '21/05/2018', 100, 1, '10000.0', '731.2000000000007', '$9,268.80'),
	(18, 'Producto #1', 270, 'Administrador', 'Cliente General', '10%', '21/05/2018', 270, 1, '10000.0', '731.2000000000007', '$9,268.80'),
	(18, 'Producto #3', 6300, 'Administrador', 'Cliente General', '30%', '21/05/2018', 6300, 1, '10000.0', '731.2000000000007', '$9,268.80'),
	(18, 'Producto #5', 405, 'Administrador', 'Cliente General', '20%', '21/05/2018', 405, 1, '10000.0', '731.2000000000007', '$9,268.80'),
	(18, 'Prueba decimales', 90, 'Administrador', 'Cliente General', '10%', '21/05/2018', 90, 1, '10000.0', '731.2000000000007', '$9,268.80'),
	(19, 'Camisa', 100, 'Administrador', 'Cliente General', '0%', '21/05/2018', 100, 1, '11000.0', '626.0', '$10,374.00'),
	(19, 'Nombre De Mi Procucto', 1500, 'Administrador', 'Cliente General', '0%', '21/05/2018', 1500, 1, '11000.0', '626.0', '$10,374.00'),
	(19, 'Nombre de mi Producto', 1500, 'Administrador', 'Cliente General', '25%', '21/05/2018', 1500, 1, '11000.0', '626.0', '$10,374.00'),
	(19, 'Not Found', 404, 'Administrador', 'Cliente General', '0%', '21/05/2018', 404, 1, '11000.0', '626.0', '$10,374.00'),
	(19, 'Pantalon', 200, 'Administrador', 'Cliente General', '0%', '21/05/2018', 200, 1, '11000.0', '626.0', '$10,374.00'),
	(19, 'playera', 100, 'Administrador', 'Cliente General', '0%', '21/05/2018', 100, 1, '11000.0', '626.0', '$10,374.00'),
	(19, 'Producto #1', 270, 'Administrador', 'Cliente General', '10%', '21/05/2018', 270, 1, '11000.0', '626.0', '$10,374.00'),
	(19, 'Producto #3', 6300, 'Administrador', 'Cliente General', '30%', '21/05/2018', 6300, 1, '11000.0', '626.0', '$10,374.00'),
	(20, 'Camisa', 100, 'Administrador', 'Cliente General', '0%', '21/05/2018', 100, 1, '200.0', '100.0', '$100.00'),
	(21, 'Camisa', 100, 'Administrador', 'Cliente General', '0%', '21/05/2018', 100, 1, '200.0', '100.0', '$100.00'),
	(22, 'Nombre De Mi Procucto', 1500, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 1500, 1, '11000.0', '726.0', '$10,274.00'),
	(22, 'Nombre de mi Producto', 1500, 'Yonathan Román Salgado', 'Cliente General', '25%', '21/05/2018', 1500, 1, '11000.0', '726.0', '$10,274.00'),
	(22, 'Not Found', 404, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 404, 1, '11000.0', '726.0', '$10,274.00'),
	(22, 'Pantalon', 200, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 200, 1, '11000.0', '726.0', '$10,274.00'),
	(22, 'playera', 100, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 100, 1, '11000.0', '726.0', '$10,274.00'),
	(22, 'Producto #1', 270, 'Yonathan Román Salgado', 'Cliente General', '10%', '21/05/2018', 270, 1, '11000.0', '726.0', '$10,274.00'),
	(22, 'Producto #3', 6300, 'Yonathan Román Salgado', 'Cliente General', '30%', '21/05/2018', 6300, 1, '11000.0', '726.0', '$10,274.00'),
	(23, 'Zapatos', 166, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 166, 1, '23000.0', '188.40000000000146', '$22,811.60'),
	(23, 'Producto #5', 405, 'Yonathan Román Salgado', 'Cliente General', '20%', '21/05/2018', 810, 2, '23000.0', '188.40000000000146', '$22,811.60'),
	(23, 'Prueba decimales', 90, 'Yonathan Román Salgado', 'Cliente General', '10%', '21/05/2018', 180, 2, '23000.0', '188.40000000000146', '$22,811.60'),
	(23, 'Nombre De Mi Procucto', 1500, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 3000, 2, '23000.0', '188.40000000000146', '$22,811.60'),
	(23, 'Nombre de mi Producto', 1500, 'Yonathan Román Salgado', 'Cliente General', '25%', '21/05/2018', 3000, 2, '23000.0', '188.40000000000146', '$22,811.60'),
	(23, 'Not Found', 404, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 1616, 4, '23000.0', '188.40000000000146', '$22,811.60'),
	(23, 'Pantalon', 200, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 600, 3, '23000.0', '188.40000000000146', '$22,811.60'),
	(23, 'playera', 100, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 300, 3, '23000.0', '188.40000000000146', '$22,811.60'),
	(23, 'Producto #1', 270, 'Yonathan Román Salgado', 'Cliente General', '10%', '21/05/2018', 540, 2, '23000.0', '188.40000000000146', '$22,811.60'),
	(23, 'Producto #3', 6300, 'Yonathan Román Salgado', 'Cliente General', '30%', '21/05/2018', 12600, 2, '23000.0', '188.40000000000146', '$22,811.60'),
	(24, 'Producto #5', 405, 'Yonathan Román Salgado', 'Cliente General', '20%', '21/05/2018', 810, 2, '32000.0', '22.400000000001455', '$31,977.60'),
	(24, 'Prueba decimales', 90, 'Yonathan Román Salgado', 'Cliente General', '10%', '21/05/2018', 180, 2, '32000.0', '22.400000000001455', '$31,977.60'),
	(24, 'Zapatos', 166, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 166, 1, '32000.0', '22.400000000001455', '$31,977.60'),
	(24, 'Nombre De Mi Procucto', 1500, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 4500, 3, '32000.0', '22.400000000001455', '$31,977.60'),
	(24, 'Nombre de mi Producto', 1500, 'Yonathan Román Salgado', 'Cliente General', '25%', '21/05/2018', 4500, 3, '32000.0', '22.400000000001455', '$31,977.60'),
	(24, 'Not Found', 404, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 1212, 3, '32000.0', '22.400000000001455', '$31,977.60'),
	(24, 'Pantalon', 200, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 600, 3, '32000.0', '22.400000000001455', '$31,977.60'),
	(24, 'playera', 100, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 300, 3, '32000.0', '22.400000000001455', '$31,977.60'),
	(24, 'Producto #1', 270, 'Yonathan Román Salgado', 'Cliente General', '10%', '21/05/2018', 810, 3, '32000.0', '22.400000000001455', '$31,977.60'),
	(24, 'Producto #3', 6300, 'Yonathan Román Salgado', 'Cliente General', '30%', '21/05/2018', 18900, 3, '32000.0', '22.400000000001455', '$31,977.60'),
	(25, 'Not Found', 404, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 404, 1, '1000.0', '516.008', '$483.99'),
	(25, 'Decimales xd', 80, 'Yonathan Román Salgado', 'Cliente General', '20%', '21/05/2018', 80, 1, '1000.0', '516.008', '$483.99'),
	(26, 'Zapatos', 166, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 166, 1, '40000.0', '1029.6319999999978', '$38,970.37'),
	(26, 'Producto #3', 6300, 'Yonathan Román Salgado', 'Cliente General', '30%', '21/05/2018', 18900, 3, '40000.0', '1029.6319999999978', '$38,970.37'),
	(26, 'Producto #5', 405, 'Yonathan Román Salgado', 'Cliente General', '20%', '21/05/2018', 1214, 3, '40000.0', '1029.6319999999978', '$38,970.37'),
	(26, 'Prueba decimales', 90, 'Yonathan Román Salgado', 'Cliente General', '10%', '21/05/2018', 270, 3, '40000.0', '1029.6319999999978', '$38,970.37'),
	(26, 'Nombre De Mi Procucto', 1500, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 6000, 4, '40000.0', '1029.6319999999978', '$38,970.37'),
	(26, 'Nombre de mi Producto', 1500, 'Yonathan Román Salgado', 'Cliente General', '25%', '21/05/2018', 7500, 5, '40000.0', '1029.6319999999978', '$38,970.37'),
	(26, 'Not Found', 404, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 2020, 5, '40000.0', '1029.6319999999978', '$38,970.37'),
	(26, 'Pantalon', 200, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 1000, 5, '40000.0', '1029.6319999999978', '$38,970.37'),
	(26, 'playera', 100, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 500, 5, '40000.0', '1029.6319999999978', '$38,970.37'),
	(26, 'Producto #1', 270, 'Yonathan Román Salgado', 'Cliente General', '10%', '21/05/2018', 1080, 4, '40000.0', '1029.6319999999978', '$38,970.37'),
	(26, 'Decimales xd', 80, 'Yonathan Román Salgado', 'Cliente General', '20%', '21/05/2018', 320, 4, '40000.0', '1029.6319999999978', '$38,970.37'),
	(27, 'Nombre De Mi Procucto', 1500, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 3000, 2, '30000.0', '7635.5999999999985', '$22,364.40'),
	(27, 'Nombre de mi Producto', 1500, 'Yonathan Román Salgado', 'Cliente General', '25%', '21/05/2018', 3000, 2, '30000.0', '7635.5999999999985', '$22,364.40'),
	(27, 'Not Found', 404, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 808, 2, '30000.0', '7635.5999999999985', '$22,364.40'),
	(27, 'Pantalon', 200, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 400, 2, '30000.0', '7635.5999999999985', '$22,364.40'),
	(27, 'playera', 100, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 200, 2, '30000.0', '7635.5999999999985', '$22,364.40'),
	(27, 'Producto #1', 270, 'Yonathan Román Salgado', 'Cliente General', '10%', '21/05/2018', 540, 2, '30000.0', '7635.5999999999985', '$22,364.40'),
	(27, 'Producto #3', 6300, 'Yonathan Román Salgado', 'Cliente General', '30%', '21/05/2018', 12600, 2, '30000.0', '7635.5999999999985', '$22,364.40'),
	(27, 'Producto #5', 405, 'Yonathan Román Salgado', 'Cliente General', '20%', '21/05/2018', 1214, 3, '30000.0', '7635.5999999999985', '$22,364.40'),
	(27, 'Prueba decimales', 90, 'Yonathan Román Salgado', 'Cliente General', '10%', '21/05/2018', 270, 3, '30000.0', '7635.5999999999985', '$22,364.40'),
	(27, 'Zapatos', 166, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 332, 2, '30000.0', '7635.5999999999985', '$22,364.40'),
	(28, 'Nombre De Mi Procucto', 1500, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 1500, 1, '12800.0', '52.0', '$12,748.00'),
	(28, 'Producto #3', 6300, 'Yonathan Román Salgado', 'Cliente General', '30%', '21/05/2018', 6300, 1, '12800.0', '52.0', '$12,748.00'),
	(28, 'Nombre de mi Producto', 1500, 'Yonathan Román Salgado', 'Cliente General', '25%', '21/05/2018', 3000, 2, '12800.0', '52.0', '$12,748.00'),
	(28, 'Not Found', 404, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 808, 2, '12800.0', '52.0', '$12,748.00'),
	(28, 'Pantalon', 200, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 400, 2, '12800.0', '52.0', '$12,748.00'),
	(28, 'playera', 100, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 200, 2, '12800.0', '52.0', '$12,748.00'),
	(28, 'Producto #1', 270, 'Yonathan Román Salgado', 'Cliente General', '10%', '21/05/2018', 540, 2, '12800.0', '52.0', '$12,748.00'),
	(29, 'Nombre De Mi Procucto', 1500, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 1500, 1, '11500.0', '70.39999999999964', '$11,429.60'),
	(29, 'Nombre de mi Producto', 1500, 'Yonathan Román Salgado', 'Cliente General', '25%', '21/05/2018', 1500, 1, '11500.0', '70.39999999999964', '$11,429.60'),
	(29, 'Not Found', 404, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 404, 1, '11500.0', '70.39999999999964', '$11,429.60'),
	(29, 'Pantalon', 200, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 200, 1, '11500.0', '70.39999999999964', '$11,429.60'),
	(29, 'playera', 100, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 100, 1, '11500.0', '70.39999999999964', '$11,429.60'),
	(29, 'Producto #1', 270, 'Yonathan Román Salgado', 'Cliente General', '10%', '21/05/2018', 270, 1, '11500.0', '70.39999999999964', '$11,429.60'),
	(29, 'Producto #3', 6300, 'Yonathan Román Salgado', 'Cliente General', '30%', '21/05/2018', 6300, 1, '11500.0', '70.39999999999964', '$11,429.60'),
	(29, 'Zapatos', 166, 'Yonathan Román Salgado', 'Cliente General', '0%', '21/05/2018', 166, 1, '11500.0', '70.39999999999964', '$11,429.60'),
	(29, 'Producto #5', 405, 'Yonathan Román Salgado', 'Cliente General', '20%', '21/05/2018', 810, 2, '11500.0', '70.39999999999964', '$11,429.60'),
	(29, 'Prueba decimales', 90, 'Yonathan Román Salgado', 'Cliente General', '10%', '21/05/2018', 180, 2, '11500.0', '70.39999999999964', '$11,429.60'),
	(30, 'Bolsa ', 100, 'Administrador', 'Cliente General', '0%', '22/05/2018', 100, 1, '12000.0', '376.1260000000002', '$11,623.87'),
	(30, 'Camisa', 100, 'Administrador', 'Cliente General', '0%', '22/05/2018', 100, 1, '12000.0', '376.1260000000002', '$11,623.87'),
	(30, 'Decimales xd', 80, 'Administrador', 'Cliente General', '20%', '22/05/2018', 80, 1, '12000.0', '376.1260000000002', '$11,623.87'),
	(30, 'este', 100, 'Administrador', 'Cliente General', '0%', '22/05/2018', 100, 1, '12000.0', '376.1260000000002', '$11,623.87'),
	(30, 'Nombre De Mi Procucto', 1500, 'Administrador', 'Cliente General', '0%', '22/05/2018', 1500, 1, '12000.0', '376.1260000000002', '$11,623.87'),
	(30, 'Nombre de mi Producto', 1500, 'Administrador', 'Cliente General', '25%', '22/05/2018', 1500, 1, '12000.0', '376.1260000000002', '$11,623.87'),
	(30, 'Not Found', 404, 'Administrador', 'Cliente General', '0%', '22/05/2018', 404, 1, '12000.0', '376.1260000000002', '$11,623.87'),
	(30, 'Pantalon', 200, 'Administrador', 'Cliente General', '0%', '22/05/2018', 200, 1, '12000.0', '376.1260000000002', '$11,623.87'),
	(30, 'playera', 100, 'Administrador', 'Cliente General', '0%', '22/05/2018', 100, 1, '12000.0', '376.1260000000002', '$11,623.87'),
	(30, 'Producto #1', 270, 'Administrador', 'Cliente General', '10%', '22/05/2018', 270, 1, '12000.0', '376.1260000000002', '$11,623.87'),
	(30, 'Producto #3', 6300, 'Administrador', 'Cliente General', '30%', '22/05/2018', 6300, 1, '12000.0', '376.1260000000002', '$11,623.87'),
	(30, 'Producto #4', 130, 'Administrador', 'Cliente General', '0%', '22/05/2018', 130, 1, '12000.0', '376.1260000000002', '$11,623.87'),
	(30, 'Producto #5', 405, 'Administrador', 'Cliente General', '20%', '22/05/2018', 405, 1, '12000.0', '376.1260000000002', '$11,623.87'),
	(30, 'Prueba', 90, 'Administrador', 'Cliente General', '10%', '22/05/2018', 90, 1, '12000.0', '376.1260000000002', '$11,623.87'),
	(30, 'prueba', 89, 'Administrador', 'Cliente General', '10%', '22/05/2018', 89, 1, '12000.0', '376.1260000000002', '$11,623.87'),
	(30, 'Prueba decimales', 90, 'Administrador', 'Cliente General', '10%', '22/05/2018', 90, 1, '12000.0', '376.1260000000002', '$11,623.87'),
	(30, 'Zapatos', 166, 'Administrador', 'Cliente General', '0%', '22/05/2018', 166, 1, '12000.0', '376.1260000000002', '$11,623.87'),
	(31, 'abc', 90, 'Administrador', 'Cliente General', '10%', '22/05/2018', 90, 1, '2000.0', '29.557999999999993', '$1,970.44'),
	(31, 'Bolsa ', 100, 'Administrador', 'Cliente General', '0%', '22/05/2018', 100, 1, '2000.0', '29.557999999999993', '$1,970.44'),
	(31, 'Camisa', 100, 'Administrador', 'Cliente General', '0%', '22/05/2018', 100, 1, '2000.0', '29.557999999999993', '$1,970.44'),
	(31, 'Decimales xd', 80, 'Administrador', 'Cliente General', '20%', '22/05/2018', 80, 1, '2000.0', '29.557999999999993', '$1,970.44'),
	(31, 'este', 100, 'Administrador', 'Cliente General', '0%', '22/05/2018', 100, 1, '2000.0', '29.557999999999993', '$1,970.44'),
	(31, 'Nombre De Mi Procucto', 1500, 'Administrador', 'Cliente General', '0%', '22/05/2018', 1500, 1, '2000.0', '29.557999999999993', '$1,970.44'),
	(32, 'Nombre De Mi Procucto', 1500, 'Administrador', 'Cliente General', '0%', '24/05/2018', 1500, 1, '12000.0', '756.1180000000004', '$11,243.88'),
	(32, 'Nombre de mi Producto', 1500, 'Administrador', 'Cliente General', '25%', '24/05/2018', 1500, 1, '12000.0', '756.1180000000004', '$11,243.88'),
	(32, 'Not Found', 404, 'Administrador', 'Cliente General', '0%', '24/05/2018', 404, 1, '12000.0', '756.1180000000004', '$11,243.88'),
	(32, 'Pantalon', 200, 'Administrador', 'Cliente General', '0%', '24/05/2018', 200, 1, '12000.0', '756.1180000000004', '$11,243.88'),
	(32, 'playera', 100, 'Administrador', 'Cliente General', '0%', '24/05/2018', 100, 1, '12000.0', '756.1180000000004', '$11,243.88'),
	(32, 'Producto #1', 270, 'Administrador', 'Cliente General', '10%', '24/05/2018', 270, 1, '12000.0', '756.1180000000004', '$11,243.88'),
	(32, 'Producto #3', 6300, 'Administrador', 'Cliente General', '30%', '24/05/2018', 6300, 1, '12000.0', '756.1180000000004', '$11,243.88'),
	(32, 'Producto #4', 130, 'Administrador', 'Cliente General', '0%', '24/05/2018', 130, 1, '12000.0', '756.1180000000004', '$11,243.88'),
	(32, 'Producto #5', 405, 'Administrador', 'Cliente General', '20%', '24/05/2018', 405, 1, '12000.0', '756.1180000000004', '$11,243.88'),
	(32, 'Prueba', 90, 'Administrador', 'Cliente General', '10%', '24/05/2018', 90, 1, '12000.0', '756.1180000000004', '$11,243.88'),
	(32, 'prueba', 89, 'Administrador', 'Cliente General', '10%', '24/05/2018', 89, 1, '12000.0', '756.1180000000004', '$11,243.88'),
	(32, 'Prueba decimales', 90, 'Administrador', 'Cliente General', '10%', '24/05/2018', 90, 1, '12000.0', '756.1180000000004', '$11,243.88'),
	(32, 'Zapatos', 166, 'Administrador', 'Cliente General', '0%', '24/05/2018', 166, 1, '12000.0', '756.1180000000004', '$11,243.88'),
	(33, 'Camisa', 100, 'Administrador', 'Cliente General', '0%', '24/05/2018', 100, 1, '4000.0', '116.00799999999981', '$3,883.99'),
	(33, 'Decimales xd', 80, 'Administrador', 'Cliente General', '20%', '24/05/2018', 80, 1, '4000.0', '116.00799999999981', '$3,883.99'),
	(33, 'este', 100, 'Administrador', 'Cliente General', '0%', '24/05/2018', 100, 1, '4000.0', '116.00799999999981', '$3,883.99'),
	(33, 'Nombre De Mi Procucto', 1500, 'Administrador', 'Cliente General', '0%', '24/05/2018', 1500, 1, '4000.0', '116.00799999999981', '$3,883.99'),
	(33, 'Nombre de mi Producto', 1500, 'Administrador', 'Cliente General', '25%', '24/05/2018', 1500, 1, '4000.0', '116.00799999999981', '$3,883.99'),
	(33, 'Not Found', 404, 'Administrador', 'Cliente General', '0%', '24/05/2018', 404, 1, '4000.0', '116.00799999999981', '$3,883.99'),
	(33, 'Pantalon', 200, 'Administrador', 'Cliente General', '0%', '24/05/2018', 200, 1, '4000.0', '116.00799999999981', '$3,883.99'),
	(34, 'abc', 90, 'Administrador', 'Cliente General', '10%', '24/05/2018', 90, 1, '2000.0', '29.557999999999993', '$1,970.44'),
	(34, 'Bolsa ', 100, 'Administrador', 'Cliente General', '0%', '24/05/2018', 100, 1, '2000.0', '29.557999999999993', '$1,970.44'),
	(34, 'Camisa', 100, 'Administrador', 'Cliente General', '0%', '24/05/2018', 100, 1, '2000.0', '29.557999999999993', '$1,970.44'),
	(34, 'Decimales xd', 80, 'Administrador', 'Cliente General', '20%', '24/05/2018', 80, 1, '2000.0', '29.557999999999993', '$1,970.44'),
	(34, 'este', 100, 'Administrador', 'Cliente General', '0%', '24/05/2018', 100, 1, '2000.0', '29.557999999999993', '$1,970.44'),
	(34, 'Nombre De Mi Procucto', 1500, 'Administrador', 'Cliente General', '0%', '24/05/2018', 1500, 1, '2000.0', '29.557999999999993', '$1,970.44'),
	(35, 'abc', 90, 'Administrador', 'Cliente General', '10%', '24/05/2018', 90, 1, '5000.0', '555.558', '$4,444.44'),
	(35, 'Bolsa ', 100, 'Administrador', 'Cliente General', '0%', '24/05/2018', 100, 1, '5000.0', '555.558', '$4,444.44'),
	(35, 'Camisa', 100, 'Administrador', 'Cliente General', '0%', '24/05/2018', 100, 1, '5000.0', '555.558', '$4,444.44'),
	(35, 'Decimales xd', 80, 'Administrador', 'Cliente General', '20%', '24/05/2018', 80, 1, '5000.0', '555.558', '$4,444.44'),
	(35, 'este', 100, 'Administrador', 'Cliente General', '0%', '24/05/2018', 100, 1, '5000.0', '555.558', '$4,444.44'),
	(35, 'Nombre De Mi Procucto', 1500, 'Administrador', 'Cliente General', '0%', '24/05/2018', 1500, 1, '5000.0', '555.558', '$4,444.44'),
	(35, 'Nombre de mi Producto', 1500, 'Administrador', 'Cliente General', '25%', '24/05/2018', 1500, 1, '5000.0', '555.558', '$4,444.44'),
	(35, 'Not Found', 404, 'Administrador', 'Cliente General', '0%', '24/05/2018', 404, 1, '5000.0', '555.558', '$4,444.44'),
	(35, 'Pantalon', 200, 'Administrador', 'Cliente General', '0%', '24/05/2018', 200, 1, '5000.0', '555.558', '$4,444.44'),
	(35, 'playera', 100, 'Administrador', 'Cliente General', '0%', '24/05/2018', 100, 1, '5000.0', '555.558', '$4,444.44'),
	(35, 'Producto #1', 270, 'Administrador', 'Cliente General', '10%', '24/05/2018', 270, 1, '5000.0', '555.558', '$4,444.44'),
	(36, 'abc', 90, 'Administrador', 'Cliente General', '10%', '24/05/2018', 90, 1, '2000.0', '29.557999999999993', '$1,970.44'),
	(36, 'Bolsa ', 100, 'Administrador', 'Cliente General', '0%', '24/05/2018', 100, 1, '2000.0', '29.557999999999993', '$1,970.44'),
	(36, 'Camisa', 100, 'Administrador', 'Cliente General', '0%', '24/05/2018', 100, 1, '2000.0', '29.557999999999993', '$1,970.44'),
	(36, 'Decimales xd', 80, 'Administrador', 'Cliente General', '20%', '24/05/2018', 80, 1, '2000.0', '29.557999999999993', '$1,970.44'),
	(36, 'este', 100, 'Administrador', 'Cliente General', '0%', '24/05/2018', 100, 1, '2000.0', '29.557999999999993', '$1,970.44'),
	(36, 'Nombre De Mi Procucto', 1500, 'Administrador', 'Cliente General', '0%', '24/05/2018', 1500, 1, '2000.0', '29.557999999999993', '$1,970.44');
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
