-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: nucleusteq
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `course1`
--

DROP TABLE IF EXISTS `course1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course1` (
  `id` int NOT NULL AUTO_INCREMENT,
  `course_name` varchar(50) DEFAULT NULL,
  `teacher_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `teacher_id` (`teacher_id`),
  CONSTRAINT `course1_ibfk_1` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course1`
--

LOCK TABLES `course1` WRITE;
/*!40000 ALTER TABLE `course1` DISABLE KEYS */;
INSERT INTO `course1` VALUES (1,'History',1),(2,'Geopolitics',2),(3,'World Geography',3);
/*!40000 ALTER TABLE `course1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course2`
--

DROP TABLE IF EXISTS `course2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course2` (
  `id` int NOT NULL AUTO_INCREMENT,
  `course_name` varchar(50) DEFAULT NULL,
  `teacher_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `teacher_id` (`teacher_id`),
  CONSTRAINT `course2_ibfk_1` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course2`
--

LOCK TABLES `course2` WRITE;
/*!40000 ALTER TABLE `course2` DISABLE KEYS */;
INSERT INTO `course2` VALUES (1,'JAVA',3),(2,'Python',2),(3,'MySQL',3),(4,'History',1);
/*!40000 ALTER TABLE `course2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `emp_id` int NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `salary` decimal(10,2) DEFAULT NULL,
  `age` int DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Madhur Jatiya',50000.00,30),(2,'Lokesh Nargesh',65000.00,35),(3,'Vikram Singh',45000.00,28),(4,'Anjali Sharma',55000.00,32),(5,'Nitin Patel',60000.00,37),(6,'Shalini Desai',70000.00,40),(7,'Sanjay Singh',48000.00,29),(8,'Manisha Choudhary',52000.00,31),(9,'Amit Kumar',58000.00,36),(10,'Swati Mehta',62000.00,34);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `Id` int NOT NULL,
  `Items` varchar(255) NOT NULL,
  `Price` decimal(10,2) NOT NULL,
  `Sold` int NOT NULL,
  `Month` varchar(10) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'Tea',10.00,50,'Jan'),(2,'Coffee',20.00,30,'Jan'),(3,'Pizza',100.00,25,'Feb'),(4,'Burger',50.00,20,'Mar'),(5,'Ice Cream',100.00,15,'Mar'),(6,'Biscuit',15.00,10,'Apr'),(7,'Cold Drink',20.00,8,'Apr'),(8,'Tea',10.00,12,'May'),(9,'Coffee',20.00,18,'May'),(10,'Pizza',100.00,22,'Jun'),(11,'Burger',50.00,40,'Jun'),(12,'Ice Cream',100.00,12,'Jul'),(13,'Biscuit',15.00,3,'Jul'),(14,'Cold Drink',20.00,8,'Aug'),(15,'Tea',10.00,5,'Aug'),(16,'Coffee',20.00,2,'Sep'),(17,'Burger',50.00,10,'Sep'),(18,'Ice Cream',100.00,18,'Oct'),(19,'Biscuit',15.00,35,'Oct'),(20,'Cold Drink',20.00,15,'Nov');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_name` varchar(50) DEFAULT NULL,
  `course_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `course_id` (`course_id`),
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course1` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Madhur Jatiya',1),(2,'Anurag Jain',1),(3,'Lokesh Nargesh',2),(4,'Rani Ahire',3),(5,'Komal Jain',1),(6,'Rahul Gupta',2),(7,'Amit Singh',3),(8,'Neha Verma',3),(9,'Sanjay Kumar',2),(10,'Soniya Singh',1),(11,'Ajay Verma',1),(12,'Pooja Sharma',3),(13,'Rohit Gupta',2),(14,'Ritu Yadav',1);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher` (
  `id` int NOT NULL AUTO_INCREMENT,
  `teacher_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES (1,'Khan Sir'),(2,'Prashant Dhawan'),(3,'Ankit Awasthi');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-03 21:39:33
