-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: hackproject
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `corp`
--

DROP TABLE IF EXISTS `corp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `corp` (
  `email` char(100) DEFAULT NULL,
  `name` char(40) DEFAULT NULL,
  `mobile` char(20) DEFAULT NULL,
  `pwd` char(20) DEFAULT NULL,
  `address` char(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `corp`
--

LOCK TABLES `corp` WRITE;
/*!40000 ALTER TABLE `corp` DISABLE KEYS */;
INSERT INTO `corp` VALUES ('corp1@gmail.com','Corp 1','1234567890','password','Chandigarh');
/*!40000 ALTER TABLE `corp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inno`
--

DROP TABLE IF EXISTS `inno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `inno` (
  `email` char(100) DEFAULT NULL,
  `name` char(40) DEFAULT NULL,
  `mobile` char(20) DEFAULT NULL,
  `pwd` char(20) DEFAULT NULL,
  `address` char(40) DEFAULT NULL,
  `mymentor` char(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inno`
--

LOCK TABLES `inno` WRITE;
/*!40000 ALTER TABLE `inno` DISABLE KEYS */;
INSERT INTO `inno` VALUES ('inno1@gmail.com','inno 1','1234567890','password','Pinjore','none');
/*!40000 ALTER TABLE `inno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mentor`
--

DROP TABLE IF EXISTS `mentor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mentor` (
  `fname` char(20) DEFAULT NULL,
  `lname` char(20) DEFAULT NULL,
  `email` char(40) DEFAULT NULL,
  `linkdin` char(40) DEFAULT NULL,
  `phno` char(20) DEFAULT NULL,
  `corp` char(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mentor`
--

LOCK TABLES `mentor` WRITE;
/*!40000 ALTER TABLE `mentor` DISABLE KEYS */;
INSERT INTO `mentor` VALUES ('Rahul','def','nikhil@app.com','vjbibnkl','789',NULL);
/*!40000 ALTER TABLE `mentor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prob`
--

DROP TABLE IF EXISTS `prob`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `prob` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `problem` varchar(1000) DEFAULT NULL,
  `corp` varchar(50) DEFAULT NULL,
  `inno` varchar(50) DEFAULT NULL,
  `mentor` varchar(50) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prob`
--

LOCK TABLES `prob` WRITE;
/*!40000 ALTER TABLE `prob` DISABLE KEYS */;
/*!40000 ALTER TABLE `prob` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-09 10:41:06
