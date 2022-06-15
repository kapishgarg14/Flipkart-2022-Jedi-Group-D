-- MySQL dump 10.13  Distrib 5.7.26, for macos10.14 (x86_64)
--
-- Host: localhost    Database: crs
-- ------------------------------------------------------
-- Server version	5.7.26

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
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `course_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `Credit` int(11) NOT NULL DEFAULT '4',
  PRIMARY KEY (`course_id`),
  UNIQUE KEY `course_course_id_uindex` (`course_id`)
) ENGINE=InnoDB AUTO_INCREMENT=301 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (100,'ITC',3),(200,'ML',4),(300,'AI',4);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `courseCatalog`
--

DROP TABLE IF EXISTS `courseCatalog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `courseCatalog` (
  `courseID` int(11) DEFAULT NULL,
  `UserID` int(11) DEFAULT NULL,
  KEY `courseCatalog_course_course_id_fk` (`courseID`),
  KEY `courseCatalog_user_userID_fk` (`UserID`),
  CONSTRAINT `courseCatalog_course_course_id_fk` FOREIGN KEY (`courseID`) REFERENCES `course` (`course_id`),
  CONSTRAINT `courseCatalog_user_userID_fk` FOREIGN KEY (`UserID`) REFERENCES `user` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courseCatalog`
--

LOCK TABLES `courseCatalog` WRITE;
/*!40000 ALTER TABLE `courseCatalog` DISABLE KEYS */;
INSERT INTO `courseCatalog` VALUES (200,2),(100,3),(200,2),(200,4),(200,4),(200,6),(300,2);
/*!40000 ALTER TABLE `courseCatalog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gradeCard`
--

DROP TABLE IF EXISTS `gradeCard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gradeCard` (
  `userID` int(11) DEFAULT NULL,
  `courseID` int(11) DEFAULT NULL,
  `grade` varchar(1) DEFAULT NULL,
  KEY `gradeCard_course_course_id_fk` (`courseID`),
  KEY `gradeCard_student_userID_fk` (`userID`),
  CONSTRAINT `gradeCard_course_course_id_fk` FOREIGN KEY (`courseID`) REFERENCES `course` (`course_id`),
  CONSTRAINT `gradeCard_student_userID_fk` FOREIGN KEY (`userID`) REFERENCES `student` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gradeCard`
--

LOCK TABLES `gradeCard` WRITE;
/*!40000 ALTER TABLE `gradeCard` DISABLE KEYS */;
INSERT INTO `gradeCard` VALUES (5,100,'8');
/*!40000 ALTER TABLE `gradeCard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `professor`
--

DROP TABLE IF EXISTS `professor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `professor` (
  `userID` int(11) NOT NULL,
  `dept` varchar(50) NOT NULL,
  UNIQUE KEY `professor_userID_uindex` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `professor`
--

LOCK TABLES `professor` WRITE;
/*!40000 ALTER TABLE `professor` DISABLE KEYS */;
INSERT INTO `professor` VALUES (2,'ECE'),(3,'CSE');
/*!40000 ALTER TABLE `professor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `Branch` varchar(20) NOT NULL,
  `DOB` date NOT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Phone` varchar(10) NOT NULL,
  `userID` int(11) NOT NULL,
  PRIMARY KEY (`userID`),
  UNIQUE KEY `student_userid_uindex` (`userID`),
  CONSTRAINT `userID` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('CSE','2022-06-13','Bangalore, India','9822222222',4),('ECE','2022-06-14','Delhi, India','9833333333',5),('ECE','2022-06-15','Goa, India','9844444444',6);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `userID` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `role` int(11) NOT NULL,
  `isVerified` tinyint(1) NOT NULL DEFAULT '0',
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`userID`),
  UNIQUE KEY `user_email_uindex` (`email`),
  UNIQUE KEY `user_userID_uindex` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'goelm08@gmail.com','20082001',1,1,'Mayank'),(2,'saumya07@gmail.com','10028002',2,1,'Saumya'),(3,'nandan06@gmail.com','82001200',2,1,'Nandan'),(4,'kapish05@gmail.com','20082001',3,1,'Kapish'),(5,'mudit04@gmail.com','00120082',3,1,'Mudit'),(6,'hritika03@gmail.com','00200182',3,1,'Hritika');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-15 18:34:43
