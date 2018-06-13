CREATE DATABASE  IF NOT EXISTS `fep` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `fep`;
-- MySQL dump 10.13  Distrib 5.7.22, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: fep
-- ------------------------------------------------------
-- Server version	5.7.22-0ubuntu18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categoria_memoria`
--

DROP TABLE IF EXISTS `categoria_memoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categoria_memoria` (
  `id_categoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria_memoria`
--

LOCK TABLES `categoria_memoria` WRITE;
/*!40000 ALTER TABLE `categoria_memoria` DISABLE KEYS */;
/*!40000 ALTER TABLE `categoria_memoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categoria_prod`
--

DROP TABLE IF EXISTS `categoria_prod`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categoria_prod` (
  `id_categoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria_prod`
--

LOCK TABLES `categoria_prod` WRITE;
/*!40000 ALTER TABLE `categoria_prod` DISABLE KEYS */;
/*!40000 ALTER TABLE `categoria_prod` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `memoria_costos`
--

DROP TABLE IF EXISTS `memoria_costos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `memoria_costos` (
  `id_memoria` int(11) NOT NULL AUTO_INCREMENT,
  `categoria_id` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `u_m` varchar(45) DEFAULT NULL,
  `volumen` double DEFAULT NULL,
  `costo_unitario` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  `proyecto_id` int(11) NOT NULL,
  PRIMARY KEY (`id_memoria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `memoria_costos`
--

LOCK TABLES `memoria_costos` WRITE;
/*!40000 ALTER TABLE `memoria_costos` DISABLE KEYS */;
/*!40000 ALTER TABLE `memoria_costos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mes_produccion`
--

DROP TABLE IF EXISTS `mes_produccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mes_produccion` (
  `id_mes` int(11) NOT NULL AUTO_INCREMENT,
  `concepto_id` int(11) NOT NULL,
  `proyecto_id` int(11) NOT NULL,
  `monto` double DEFAULT NULL,
  PRIMARY KEY (`id_mes`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mes_produccion`
--

LOCK TABLES `mes_produccion` WRITE;
/*!40000 ALTER TABLE `mes_produccion` DISABLE KEYS */;
/*!40000 ALTER TABLE `mes_produccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `presup_inversion`
--

DROP TABLE IF EXISTS `presup_inversion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `presup_inversion` (
  `id_concepto` int(11) NOT NULL AUTO_INCREMENT,
  `activo_id` int(11) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `unidad` varchar(45) DEFAULT NULL,
  `cantidad` double DEFAULT NULL,
  `costo_unitario` double DEFAULT NULL,
  `montos` double DEFAULT NULL,
  `programas` double DEFAULT NULL,
  `socios` double DEFAULT NULL,
  `proyecto_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_concepto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `presup_inversion`
--

LOCK TABLES `presup_inversion` WRITE;
/*!40000 ALTER TABLE `presup_inversion` DISABLE KEYS */;
/*!40000 ALTER TABLE `presup_inversion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produccion_mensual`
--

DROP TABLE IF EXISTS `produccion_mensual`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produccion_mensual` (
  `id_concepto` int(11) NOT NULL AUTO_INCREMENT,
  `categoria_id` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `proyecto_id` int(11) NOT NULL,
  PRIMARY KEY (`id_concepto`),
  KEY `proyecto_id` (`proyecto_id`),
  KEY `fk_proyecto_id_idx` (`proyecto_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produccion_mensual`
--

LOCK TABLES `produccion_mensual` WRITE;
/*!40000 ALTER TABLE `produccion_mensual` DISABLE KEYS */;
/*!40000 ALTER TABLE `produccion_mensual` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proyectos`
--

DROP TABLE IF EXISTS `proyectos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proyectos` (
  `id_proyectos` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `usuario_id` int(11) NOT NULL,
  PRIMARY KEY (`id_proyectos`),
  KEY `usuario_id_idx` (`usuario_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proyectos`
--

LOCK TABLES `proyectos` WRITE;
/*!40000 ALTER TABLE `proyectos` DISABLE KEYS */;
/*!40000 ALTER TABLE `proyectos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_activo`
--

DROP TABLE IF EXISTS `tipo_activo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_activo` (
  `id_activo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_activo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_activo`
--

LOCK TABLES `tipo_activo` WRITE;
/*!40000 ALTER TABLE `tipo_activo` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_activo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'miguel','miguel'),(2,'juan','juan'),(3,'juan','juan'),(4,'juan','juan');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-12 19:56:57
