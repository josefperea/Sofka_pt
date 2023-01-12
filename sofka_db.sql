-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sofka_db
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `naves`
--

DROP TABLE IF EXISTS `naves`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `naves` (
  `id_nave` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) COLLATE utf8mb3_spanish2_ci NOT NULL,
  `peso` int NOT NULL,
  `combustible` varchar(45) COLLATE utf8mb3_spanish2_ci NOT NULL,
  `empuje` int NOT NULL,
  `capacidad_pasajeros` int DEFAULT NULL,
  `id_tipo_nave` int NOT NULL,
  PRIMARY KEY (`id_nave`),
  KEY `id_tipo_nave_idx` (`id_tipo_nave`),
  CONSTRAINT `id_tipo_nave` FOREIGN KEY (`id_tipo_nave`) REFERENCES `tipo_nave` (`id_tipo_nave`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `naves`
--

LOCK TABLES `naves` WRITE;
/*!40000 ALTER TABLE `naves` DISABLE KEYS */;
INSERT INTO `naves` VALUES (1,'RoadToQA',3000,'Trioxido de nitrogeno',45,1,4),(2,'Saturno V',2900,'Combustible solido',3500,5,1),(3,'Going to the Moon',4355,'Nitrogeno',2350,10,3),(4,'Sateline',800,'Liquido',300,0,2),(5,'Apolo',1837,'Queroseno',2740,8,3),(6,'Orion',1700,'Combustible solido',1900,12,3),(7,'Falcon Heavy',5000,'Queroseno RP-1',7607,0,2),(8,'Crew Dragon C205',9525,'Queroseno',4743,0,2),(9,'Road to Jave Developer',1246,'Nitrogeno',2023,50,4),(10,'Road to SCRUM Master',800,'Queroseno',2560,20,4),(11,'Destructor estelar clase Venator',8430,'Trioxido de nitrogeno',12304,300,1),(12,'La Estrella de la Muerte',6932,'Nitrogeno',8000,240,1),(13,'Nave 1',3000,'Queroseno',3000,10,4);
/*!40000 ALTER TABLE `naves` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_nave`
--

DROP TABLE IF EXISTS `tipo_nave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_nave` (
  `id_tipo_nave` int NOT NULL AUTO_INCREMENT,
  `nombre_tipo` varchar(45) COLLATE utf8mb3_spanish2_ci NOT NULL,
  PRIMARY KEY (`id_tipo_nave`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_nave`
--

LOCK TABLES `tipo_nave` WRITE;
/*!40000 ALTER TABLE `tipo_nave` DISABLE KEYS */;
INSERT INTO `tipo_nave` VALUES (1,'Lanzadera'),(2,'No tripuladas'),(3,'Tripuladas'),(4,'Sofkiana');
/*!40000 ALTER TABLE `tipo_nave` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-12 18:41:04
