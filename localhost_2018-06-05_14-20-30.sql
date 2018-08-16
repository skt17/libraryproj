-- Auto Backup for MySQL Professional Edition 4.1
--
-- Host: localhost
--
-- MySQL Server Version: 5.5.5-10.1.21-MariaDB
--
-- 2018-06-05 14:20:30
--
-- ------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES latin1 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/ `bb` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bb`;
-- Backing up events for database 'bb'
CREATE DATABASE /*!32312 IF NOT EXISTS*/ `book` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `book`;
DROP TABLE IF EXISTS `civ`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `civ` (
  `Book_name` varchar(80) NOT NULL,
  `Author` varchar(80) NOT NULL,
  `Pub_name` varchar(80) NOT NULL,
  `Total_book` int(100) NOT NULL DEFAULT '0',
  `Avail_book` int(100) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
LOCK TABLES `civ` WRITE;
/*!40000 ALTER TABLE `civ` DISABLE KEYS */;
/*!40000 ALTER TABLE `civ` ENABLE KEYS */;
UNLOCK TABLES;
DROP TABLE IF EXISTS `common`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `common` (
  `Book_name` varchar(80) NOT NULL,
  `Author` varchar(80) NOT NULL,
  `Pub_name` varchar(80) NOT NULL,
  `Total_book` int(100) NOT NULL DEFAULT '0',
  `Avail_book` int(100) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
LOCK TABLES `common` WRITE;
/*!40000 ALTER TABLE `common` DISABLE KEYS */;
INSERT INTO `common` VALUES ('DIGI','AA','BB',110,9);
/*!40000 ALTER TABLE `common` ENABLE KEYS */;
UNLOCK TABLES;
DROP TABLE IF EXISTS `cse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cse` (
  `Book_name` varchar(80) NOT NULL,
  `Author` varchar(80) NOT NULL,
  `Pub_name` varchar(80) NOT NULL,
  `Total_book` int(100) NOT NULL DEFAULT '0',
  `Avail_book` int(100) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
LOCK TABLES `cse` WRITE;
/*!40000 ALTER TABLE `cse` DISABLE KEYS */;
INSERT INTO `cse` VALUES ('TOC','RAM','PERSON',20,17),('DAA','SS','OXFORD',29,17);
/*!40000 ALTER TABLE `cse` ENABLE KEYS */;
UNLOCK TABLES;
DROP TABLE IF EXISTS `ele`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ele` (
  `Book_name` varchar(80) NOT NULL,
  `Author` varchar(80) NOT NULL,
  `Pub_name` varchar(80) NOT NULL,
  `Total_book` int(100) NOT NULL DEFAULT '0',
  `Avail_book` int(100) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
LOCK TABLES `ele` WRITE;
/*!40000 ALTER TABLE `ele` DISABLE KEYS */;
INSERT INTO `ele` VALUES ('BEE','mr s','sk',10,10),('MM','CC','ZZ',19,19);
/*!40000 ALTER TABLE `ele` ENABLE KEYS */;
UNLOCK TABLES;
DROP TABLE IF EXISTS `mec`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mec` (
  `Book_name` varchar(80) NOT NULL,
  `Author` varchar(80) NOT NULL,
  `Pub_name` varchar(80) NOT NULL,
  `Total_book` int(100) NOT NULL DEFAULT '0',
  `Avail_book` int(100) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
LOCK TABLES `mec` WRITE;
/*!40000 ALTER TABLE `mec` DISABLE KEYS */;
/*!40000 ALTER TABLE `mec` ENABLE KEYS */;
UNLOCK TABLES;
-- Backing up events for database 'book'
CREATE DATABASE /*!32312 IF NOT EXISTS*/ `clg` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `clg`;
DROP TABLE IF EXISTS `civ`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `civ` (
  `REGD_NO` varchar(10) NOT NULL,
  `NAME` varchar(70) NOT NULL,
  `BOOK_1NO` varchar(20) NOT NULL DEFAULT '0',
  `BOOK_1NAME` varchar(150) NOT NULL DEFAULT '',
  `AUTHOR_1` varchar(70) NOT NULL DEFAULT '',
  `Book_1Idate` varchar(15) NOT NULL DEFAULT '',
  `BOOK_2NO` varchar(20) NOT NULL DEFAULT '0',
  `BOOK_2NAME` varchar(150) NOT NULL DEFAULT '',
  `AUTHOR_2` varchar(70) NOT NULL DEFAULT '',
  `Book_2Idate` varchar(15) NOT NULL DEFAULT '',
  `BOOK_3NO` varchar(20) NOT NULL DEFAULT '0',
  `BOOK_3NAME` varchar(150) NOT NULL DEFAULT '',
  `AUTHOR_3` varchar(70) NOT NULL DEFAULT '',
  `Book_3Idate` varchar(15) NOT NULL DEFAULT '',
  `No` int(2) NOT NULL DEFAULT '0',
  `y_join` varchar(4) NOT NULL,
  `fine` int(100) NOT NULL DEFAULT '0',
  PRIMARY KEY (`REGD_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
LOCK TABLES `civ` WRITE;
/*!40000 ALTER TABLE `civ` DISABLE KEYS */;
INSERT INTO `civ` VALUES ('1501110002','Sanjay Choubey','0','','','','0','','','','0','','','',0,'2015',0),('1501110027','Sashank Dash','0','','','','0','','','','0','','','',0,'2014',0);
/*!40000 ALTER TABLE `civ` ENABLE KEYS */;
UNLOCK TABLES;
DROP TABLE IF EXISTS `cse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cse` (
  `REGD_NO` varchar(10) NOT NULL,
  `NAME` varchar(70) NOT NULL,
  `BOOK_1NO` varchar(20) NOT NULL DEFAULT '0',
  `BOOK_1NAME` varchar(150) NOT NULL DEFAULT '',
  `AUTHOR_1` varchar(70) NOT NULL DEFAULT '',
  `Book_1Idate` varchar(15) NOT NULL DEFAULT '',
  `BOOK_2NO` varchar(20) NOT NULL DEFAULT '0',
  `BOOK_2NAME` varchar(150) NOT NULL DEFAULT '',
  `AUTHOR_2` varchar(70) NOT NULL DEFAULT '',
  `Book_2Idate` varchar(15) NOT NULL DEFAULT '',
  `BOOK_3NO` varchar(20) NOT NULL DEFAULT '0',
  `BOOK_3NAME` varchar(150) NOT NULL DEFAULT '',
  `AUTHOR_3` varchar(70) NOT NULL DEFAULT '',
  `Book_3Idate` varchar(15) NOT NULL DEFAULT '',
  `No` int(2) NOT NULL DEFAULT '0',
  `y_join` varchar(4) NOT NULL,
  `fine` int(100) NOT NULL DEFAULT '0',
  PRIMARY KEY (`REGD_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
LOCK TABLES `cse` WRITE;
/*!40000 ALTER TABLE `cse` DISABLE KEYS */;
INSERT INTO `cse` VALUES ('1501110060','Biplab Rout','50','','','','0','','','','0','','','',0,'2015',50),('1501110088','Samim Aktar','0','','','','0','','','','0','','','',0,'2020',70),('1501110094','Srinath Kumar Tripathy','66','DIGI,BB','','01-03-2018','0','','','01-03-2018','999','DAA,OXFORD','SS','20-01-2018',0,'2015',0),('1501110095','Subhakant sahu','0','','','','0','','','','0','','','',0,'2013',0);
/*!40000 ALTER TABLE `cse` ENABLE KEYS */;
UNLOCK TABLES;
DROP TABLE IF EXISTS `ele`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ele` (
  `REGD_NO` varchar(10) NOT NULL,
  `NAME` varchar(70) NOT NULL,
  `BOOK_1NO` varchar(20) NOT NULL DEFAULT '0',
  `BOOK_1NAME` varchar(150) NOT NULL DEFAULT '',
  `AUTHOR_1` varchar(70) NOT NULL DEFAULT '',
  `Book_1Idate` varchar(15) NOT NULL DEFAULT '',
  `BOOK_2NO` varchar(20) NOT NULL DEFAULT '0',
  `BOOK_2NAME` varchar(150) NOT NULL DEFAULT '',
  `AUTHOR_2` varchar(70) NOT NULL DEFAULT '',
  `Book_2Idate` varchar(15) NOT NULL DEFAULT '',
  `BOOK_3NO` varchar(20) NOT NULL DEFAULT '0',
  `BOOK_3NAME` varchar(150) NOT NULL DEFAULT '',
  `AUTHOR_3` varchar(70) NOT NULL DEFAULT '',
  `Book_3Idate` varchar(15) NOT NULL DEFAULT '',
  `No` int(2) NOT NULL DEFAULT '0',
  `y_join` varchar(4) NOT NULL,
  `fine` int(100) NOT NULL DEFAULT '0',
  PRIMARY KEY (`REGD_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
LOCK TABLES `ele` WRITE;
/*!40000 ALTER TABLE `ele` DISABLE KEYS */;
INSERT INTO `ele` VALUES ('1501110124','Sunil Kumbhar','0','','','','0','','','','0','','','',0,'2015',0),('1501110142','Amit Pallauri','0','','','','0','','','','0','','','',0,'2013',0);
/*!40000 ALTER TABLE `ele` ENABLE KEYS */;
UNLOCK TABLES;
DROP TABLE IF EXISTS `mec`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mec` (
  `REGD_NO` varchar(10) NOT NULL,
  `NAME` varchar(70) NOT NULL,
  `BOOK_1NO` varchar(20) NOT NULL DEFAULT '0',
  `BOOK_1NAME` varchar(150) NOT NULL DEFAULT '',
  `AUTHOR_1` varchar(70) NOT NULL DEFAULT '',
  `Book_1Idate` varchar(15) NOT NULL DEFAULT '',
  `BOOK_2NO` varchar(20) NOT NULL DEFAULT '0',
  `BOOK_2NAME` varchar(150) NOT NULL DEFAULT '',
  `AUTHOR_2` varchar(70) NOT NULL DEFAULT '',
  `Book_2Idate` varchar(15) NOT NULL DEFAULT '',
  `BOOK_3NO` varchar(20) NOT NULL DEFAULT '0',
  `BOOK_3NAME` varchar(150) NOT NULL DEFAULT '',
  `AUTHOR_3` varchar(70) NOT NULL DEFAULT '',
  `Book_3Idate` varchar(15) NOT NULL DEFAULT '',
  `No` int(2) NOT NULL DEFAULT '0',
  `y_join` varchar(4) NOT NULL,
  `fine` int(100) NOT NULL DEFAULT '0',
  PRIMARY KEY (`REGD_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
LOCK TABLES `mec` WRITE;
/*!40000 ALTER TABLE `mec` DISABLE KEYS */;
INSERT INTO `mec` VALUES ('1501110182','Devi rath','0','','','','0','','','','0','','','',0,'2014',0),('1501110192','Sidhant Tripathy','0','','','','0','','','','0','','','',0,'2015',0);
/*!40000 ALTER TABLE `mec` ENABLE KEYS */;
UNLOCK TABLES;
-- Backing up events for database 'clg'
CREATE DATABASE /*!32312 IF NOT EXISTS*/ `client` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `client`;
DROP TABLE IF EXISTS `civ`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `civ` (
  `Regd_no` varchar(10) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Hint` varchar(50) NOT NULL,
  PRIMARY KEY (`Regd_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
LOCK TABLES `civ` WRITE;
/*!40000 ALTER TABLE `civ` DISABLE KEYS */;
INSERT INTO `civ` VALUES ('1501110099','zzss','zzss');
/*!40000 ALTER TABLE `civ` ENABLE KEYS */;
UNLOCK TABLES;
DROP TABLE IF EXISTS `cse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cse` (
  `Regd_no` varchar(10) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Hint` varchar(50) NOT NULL,
  PRIMARY KEY (`Regd_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
LOCK TABLES `cse` WRITE;
/*!40000 ALTER TABLE `cse` DISABLE KEYS */;
INSERT INTO `cse` VALUES ('1501110088','samim2580','kendrapara'),('1501110094','siku','my'),('1501110098','zzss','zzss');
/*!40000 ALTER TABLE `cse` ENABLE KEYS */;
UNLOCK TABLES;
DROP TABLE IF EXISTS `ele`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ele` (
  `Regd_no` varchar(10) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Hint` varchar(50) NOT NULL,
  PRIMARY KEY (`Regd_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
LOCK TABLES `ele` WRITE;
/*!40000 ALTER TABLE `ele` DISABLE KEYS */;
/*!40000 ALTER TABLE `ele` ENABLE KEYS */;
UNLOCK TABLES;
DROP TABLE IF EXISTS `mec`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mec` (
  `Regd_no` varchar(10) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Hint` varchar(50) NOT NULL,
  PRIMARY KEY (`Regd_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
LOCK TABLES `mec` WRITE;
/*!40000 ALTER TABLE `mec` DISABLE KEYS */;
/*!40000 ALTER TABLE `mec` ENABLE KEYS */;
UNLOCK TABLES;
-- Backing up events for database 'client'
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
