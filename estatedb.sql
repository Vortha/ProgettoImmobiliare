-- MySQL dump 10.13  Distrib 5.5.50, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: estatedb
-- ------------------------------------------------------
-- Server version	5.5.50-0ubuntu0.14.04.1

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
-- Table structure for table `fruitore`
--

DROP TABLE IF EXISTS `fruitore`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fruitore` (
  `email` varchar(45) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `telefono` char(10) NOT NULL,
  `cognome` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `cliente` tinyint(1) DEFAULT NULL,
  `agente` tinyint(1) DEFAULT NULL,
  `amministratore` tinyint(1) DEFAULT NULL,
  `cliente_mobile` tinyint(1) DEFAULT NULL,
  `agente_assegnato` varchar(45) DEFAULT NULL,
  `eliminato` tinyint(1) DEFAULT NULL,
  `data_eliminazione` date DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fruitore`
--

LOCK TABLES `fruitore` WRITE;
/*!40000 ALTER TABLE `fruitore` DISABLE KEYS */;
INSERT INTO `fruitore` VALUES ('3agente@gmail.com','asdf','8675465','dgshni','epiac1',0,1,0,0,'0',NULL,NULL),('4agente@gmail.com','fhfgk','8543465','fhdvbi','p0mp1l1',0,0,1,0,'0',NULL,NULL),('5agente@gmail.com','hfdgf','8675465','piacgfdentini','randomepiac1',0,1,0,0,'0',NULL,NULL),('6gente@gmail.com','valgfgfdrio','8543465','pfgdompili','randomlfgep0mp1l1',0,0,1,0,'0',NULL,NULL),('7agente@gmail.com','ranasdf','8675465','randgshni','mepiac1',0,1,0,0,'0',NULL,NULL),('8agente@gmail.com','fhfdomgk','8543465','fhdomdvbi','valerio0mp1l1',0,0,1,0,'0',NULL,NULL),('agente1@gmail.com','hfdgf','8675465','piacgfdentini','mattgfepiac1',0,1,0,0,'0',NULL,NULL),('allardomapenna@gmail.com','alma','5635375','pennacchi','alma123',1,0,0,0,'piacagente@gmail.com',NULL,NULL),('alma.pennacchi@gmail.com','alma','2345678987','penna','alma1A1',1,0,0,0,'0',1,NULL),('almalardo@gmail.com','alma','5635375','pennacchi','alma123',1,0,0,0,'piacagente@gmail.com',NULL,NULL),('almape1nna@gmail.com','alma','5635375','pennacchi','alma123',1,0,0,0,'piacagente@gmail.com',NULL,NULL),('almapenna@gmail.com','alma','5635375','pennacchi','alma123',1,0,0,0,'piacagente@gmail.com',NULL,NULL),('b@gmail.com','arandomlma','5635375','penna','randomlma123',1,0,0,0,'5agente@gmail.com',1,NULL),('bhfrandom@gmail.com','arandomlma','5635375','penna','randomlma123',1,0,0,0,'5agente@gmail.com',NULL,NULL),('bhfranpdom@gmail.com','arandomlma','5635375','penna','randomlma123',1,0,0,0,'5agente@gmail.com',NULL,NULL),('bhran1cf@gmail.com','alma','5635375','penna','bbbbalma123',1,0,0,0,'5agente@gmail.com',NULL,NULL),('bhrancf@gmail.com','alma','5635375','penna','bbbbalma123',1,0,0,0,'5agente@gmail.com',NULL,NULL),('ciaonesara@gmail.com','sara','5749375','84375','3esc1le',1,0,0,1,'prova1@prova.it',1,NULL),('df1tna@gmail.com','gfnhnf','59463','hgfgbsv','h87g6',1,0,0,0,'agente1@gmail.com',NULL,NULL),('dfrandomtna@gmail.com','gfnhnrandomf','59463','hgfgbsv','h87g6',1,0,0,0,'agente1@gmail.com',NULL,NULL),('dfrandoqmtna@gmail.com','gfnhnrandomf','59463','hgfgbsv','h87g6',1,0,0,0,'3agente@gmail.com',NULL,NULL),('dftna@gmail.com','gfnhnf','59463','hgfgbsv','h87g6',1,0,0,0,'agente1@gmail.com',NULL,NULL),('dftnalardo@gmail.com','gfnhnf','59463','hgfgbsv','h87g6',1,0,0,0,'agente1@gmail.com',NULL,NULL),('dwftnalardo@gmail.com','gfnhnf','59463','hgfgbsv','h87g6',1,0,0,0,'agente1@gmail.com',NULL,NULL),('f111escsizea@gmail.com','francesca','1235375','marmigi','1artena2',1,0,0,1,'piacagente@gmail.com',NULL,NULL),('fdsbhfrandom@gmail.com','arandomlma','5635375','penna','randomlma123',1,0,0,0,'5agente@gmail.com',NULL,NULL),('fran1cerancsca@gmail.com','francesca','1235375','marmigi','1artena2',1,0,0,1,'piacagente@gmail.com',NULL,NULL),('francelardosca@gmail.com','francesca','1235375','marmigi','1artena2',1,0,0,1,'7agente@gmail.com',NULL,NULL),('francerancsca@gmail.com','francesca','1235375','marmigi','1artena2',1,0,0,1,'piacagente@gmail.com',NULL,NULL),('francesca@gmail.com','francesca','1235375','marmigi','1artena2',1,0,0,1,'7agente@gmail.com',NULL,NULL),('francescsizea@gmail.com','francesca','1235375','marmigi','1artena2',1,0,0,1,'piacagente@gmail.com',NULL,NULL),('francfdsesca@gmail.com','francesca','1235375','marmigi','1artena2',1,0,0,1,'7agente@gmail.com',NULL,NULL),('francresca@gmail.com','francesca','1235375','marmigi','1artena2',1,0,0,1,'7agente@gmail.com',NULL,NULL),('jf@gmail.com','randomsandra','1235375','tommasi','12bbrandombe',1,0,0,1,'6agente@gmail.com',NULL,NULL),('jgrandomgf@gmail.com','randomsandra','1235375','tommasi','12bbrandombe',1,0,0,1,'6agente@gmail.com',NULL,NULL),('jgranwdomgf@gmail.com','randomsandra','1235375','tommasi','12bbrandombe',1,0,0,1,'6agente@gmail.com',NULL,NULL),('jgrrrrf@gmail.com','randomsandra','1235375','tommasi','12bbrandombe',1,0,0,1,'6agente@gmail.com',NULL,NULL),('jgsiz1egf@gmail.com','sandra','1235375','tommasi','12bbb3escile',1,0,0,1,'pompagente@gmail.com',NULL,NULL),('jgsizegf@gmail.com','sandra','1235375','tommasi','12bbb3escile',1,0,0,1,'pompagente@gmail.com',NULL,NULL),('kkkpenna@gmail.com','salma','5635375','vigliano','calma123',1,0,0,0,'8agente@gmail.com',NULL,NULL),('lardo@gmail.com','sara','5749375','84375','3esc1le',1,0,0,1,'prova1@prova.it',1,NULL),('lardoBulloc@gmail.com','sandra','1235375','bulloc','123escile',1,0,0,1,'pompagente@gmail.com',NULL,NULL),('lardondomtna@gmail.com','gfnhnrandomf','59463','hgfgbsv','h87g6',1,0,0,0,'agente1@gmail.com',NULL,NULL),('lardosara@gmail.com','sara','5749375','84375','3esc1le',1,0,0,1,'prova1@prova.it',NULL,NULL),('pen1nasize@gmail.com','salma','5635375','vigliano','calma123',1,0,0,0,'3agente@gmail.com',NULL,NULL),('pen3nsizea@gmail.com','salma','5635375','vigliano','calma123',1,0,0,0,'4agente@gmail.com',NULL,NULL),('penna@gmail.com','salma','5635375','vigliano','calma123',1,0,0,0,'8agente@gmail.com',NULL,NULL),('pennasize@gmail.com','salma','5635375','vigliano','calma123',1,0,0,0,'3agente@gmail.com',NULL,NULL),('penndfa@gmail.com','salma','5635375','vigliano','calma123',1,0,0,0,'8agente@gmail.com',NULL,NULL),('pennlardoa@gmail.com','salma','5635375','vigliano','calma123',1,0,0,0,'8agente@gmail.com',NULL,NULL),('pennsizea@gmail.com','salma','5635375','vigliano','calma123',1,0,0,0,'4agente@gmail.com',NULL,NULL),('piacagente@gmail.com','matteo','8675465','piacentini','mattepiac1',0,1,0,0,'0',NULL,NULL),('pompagente@gmail.com','valerio','8543465','pompili','valep0mp1l1',0,0,1,0,'0',NULL,NULL),('pompili@gmail.com','Valerio','1123123123','Pompili','qwerty1A',0,0,1,0,'0',NULL,NULL),('prova1@prova.it','prova','8543465','prova','prova1A',0,1,0,0,'0',NULL,NULL),('prova@gmail.com','Prova','1231231231','Prova','prova1A',1,0,0,0,'0',NULL,NULL),('prova@prova.it','Prova','1231231231','Prova','prova1A',1,0,0,0,'0',NULL,NULL),('rancj1ggf@gmail.com','sandra','1235375','tommasi','12bbb3escile',1,0,0,1,'pompagente@gmail.com',NULL,NULL),('rancjggf@gmail.com','sandra','1235375','tommasi','12bbb3escile',1,0,0,1,'pompagente@gmail.com',NULL,NULL),('rand3@gmail.com','gfnhnrandomf','59463','hgfgbsv','h87g6',1,0,0,0,'3agente@gmail.com',NULL,NULL),('ruuuuuuu@mail.ru','Ruuu','3438874438','IlRuuuu','Ruuuuuu1',1,0,0,0,'0',NULL,NULL),('s33mara@gmail.com','sara','5749375','84375','3esc1le',1,0,0,1,'prova1@prova.it',NULL,NULL),('s3domara@gmail.com','sara','5749375','84375','3esc1le',1,0,0,1,'prova1@prova.it',NULL,NULL),('sacara@gmail.com','sara','5749375','84375','3esc1le',1,0,0,1,'prova1@prova.it',1,NULL),('salardondraBulloc@gmail.com','sandra','1235375','bulloc','123escile',1,0,0,1,'pompagente@gmail.com',NULL,NULL),('sandraB1ulloc@gmail.com','sandra','1235375','bulloc','123escile',1,0,0,1,'pompagente@gmail.com',NULL,NULL),('sandraBulloc@gmail.com','sandra','1235375','bulloc','123escile',1,0,0,1,'pompagente@gmail.com',NULL,NULL),('sara@gmail.com','sara','5749375','84375','3esc1le',1,0,0,1,'prova1@prova.it',NULL,NULL),('size1bhf@gmail.com','alma','5635375','penna','bbbbalma123',1,0,0,0,'5agente@gmail.com',NULL,NULL),('sizebhf@gmail.com','alma','5635375','penna','bbbbalma123',1,0,0,0,'5agente@gmail.com',NULL,NULL),('sizendomara@gmail.com','sara','5749375','84375','3esc1le',1,0,0,1,'prova1@prova.it',NULL,NULL),('sizesrandomara@gmail.com','sara','5749375','84375','3esc1le',1,0,0,1,'prova1@prova.it',NULL,NULL),('spampiacentini@gmail.com','Matteo','1231231231','Piacentini','piacentini1A',1,0,0,0,'0',NULL,NULL),('srando1sizemara@gmail.com','sara','5749375','84375','3esc1le',1,0,0,1,'prova1@prova.it',1,NULL),('srandomara@gmail.com','sara','5749375','84375','3esc1le',1,0,0,1,'prova1@prova.it',NULL,NULL),('srandosizemara@gmail.com','sara','5749375','84375','3esc1le',1,0,0,1,'prova1@prova.it',NULL,NULL);
/*!40000 ALTER TABLE `fruitore` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `immobile`
--

DROP TABLE IF EXISTS `immobile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `immobile` (
  `id_immobile` int(11) NOT NULL AUTO_INCREMENT,
  `provincia` char(2) NOT NULL,
  `citta` varchar(45) NOT NULL,
  `zona` varchar(45) NOT NULL,
  `camere` int(3) NOT NULL,
  `bagni` int(2) NOT NULL,
  `tipologia` varchar(20) NOT NULL,
  `subtipologia` varchar(20) DEFAULT NULL,
  `prezzo` double NOT NULL,
  `mq` int(11) NOT NULL,
  `descrizione` text NOT NULL,
  `foto` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_immobile`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `immobile`
--

LOCK TABLES `immobile` WRITE;
/*!40000 ALTER TABLE `immobile` DISABLE KEYS */;
INSERT INTO `immobile` VALUES (1,'RM','Roma','Lunghezza',5,1,'Residenziale','Appartamento',100000,80,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/1/1.jpg'),(2,'FR','Anagni','Manoppello',3,1,'Commerciale','Appartamento',80000,60,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/2/1.jpg'),(3,'CT','Catania','Villaggio',8,2,'Cessione attività','Flat',180000,100,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/3/1.jpg'),(4,'PA','Palermo','Parioli',10,3,'Nuovi cantieri','Attico',200000,120,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/4/1.jpg'),(5,'MI','Milano','Piazza Duomo',10,3,'Residenziale','Loft',500000,200,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/5/1.jpg'),(6,'RM','Roma','Parioli',15,4,'Cessione attività','Attico',230000,200,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/6/1.jpg'),(7,'PE','Pescara','Penne',5,2,'Residenziale','Appartamento',70000,70,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/7/1.jpg'),(8,'FG','San Marco in Lamis','Sita',6,2,'Commerciale','Flat',170000,100,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/8/1.jpg'),(9,'NA','Napoli','Scampia',4,1,'Nuovi cantieri','Attico',75000,100,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/9/1.jpg'),(10,'TO','Torino','Gianni',10,4,'Residenziale','Appartamento',400000,250,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/10/1.jpg'),(11,'BO','Bologna','Piazza Bologna',5,2,'Cessione attività','Attico',125000,80,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/11/1.jpg'),(12,'VE','Venezia','Ferrara',3,1,'Nuovi cantieri','Appartamento',40000,50,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/12/1.jpg'),(13,'TA','Taranto','Piazza Pia',12,4,'Residenziale','Loft',300000,300,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/13/1.jpg'),(14,'CS','Cosenza','Trettete',3,1,'Residenziale','Appartamento',30000,40,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/14/1.jpg'),(15,'TE','Teramo','Querty',9,3,'Commerciale','Loft',125000,100,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/15/1.jpg'),(16,'IM','Imperia','Asdfg',3,1,'Cessione attività','Attico',60000,50,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/16/1.jpg'),(17,'GE','Genova','Zxcvb',6,2,'Nuovi cantieri','Appartamento',75000,50,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/17/1.jpg'),(18,'MT','Matera','Poiuy',6,2,'Residenziale','Appartamento',160000,80,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/18/1.jpg'),(19,'GO','Gorizia','Lkjhg',20,5,'Commerciale','Flat',1000000,600,'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet neque vitae felis faucibus, ut tincidunt nulla placerat. Nulla orci diam, ornare sed faucibus id, pretium et elit. Donec eu tristique lectus, sed volutpat ex. Sed tincidunt suscipit eros eu dignissim. Vivamus nunc nunc, congue sed mauris quis, fringilla consequat lacus. Ut tristique gravida viverra. Donec nec est in eros suscipit pharetra.','/img/immobili/19/1.jpg');
/*!40000 ALTER TABLE `immobile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preferiti`
--

DROP TABLE IF EXISTS `preferiti`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `preferiti` (
  `email` varchar(45) NOT NULL,
  `id_immobile` int(11) NOT NULL,
  PRIMARY KEY (`email`,`id_immobile`),
  KEY `id_immobile` (`id_immobile`),
  CONSTRAINT `preferiti_ibfk_1` FOREIGN KEY (`email`) REFERENCES `fruitore` (`email`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `preferiti_ibfk_2` FOREIGN KEY (`id_immobile`) REFERENCES `immobile` (`id_immobile`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preferiti`
--

LOCK TABLES `preferiti` WRITE;
/*!40000 ALTER TABLE `preferiti` DISABLE KEYS */;
/*!40000 ALTER TABLE `preferiti` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schedadiricerca`
--

DROP TABLE IF EXISTS `schedadiricerca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `schedadiricerca` (
  `id_scheda` int(11) NOT NULL AUTO_INCREMENT,
  `provincia` char(2) DEFAULT NULL,
  `citta` varchar(45) DEFAULT NULL,
  `zona` varchar(45) DEFAULT NULL,
  `fascia_prezzo` int(11) DEFAULT NULL,
  `fascia_mq` int(11) DEFAULT NULL,
  `tipologia` varchar(45) DEFAULT NULL,
  `subtipologia` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`id_scheda`),
  KEY `scheda_fruitore` (`email`),
  CONSTRAINT `scheda_fruitore` FOREIGN KEY (`email`) REFERENCES `fruitore` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedadiricerca`
--

LOCK TABLES `schedadiricerca` WRITE;
/*!40000 ALTER TABLE `schedadiricerca` DISABLE KEYS */;
INSERT INTO `schedadiricerca` VALUES (61,'rm','roma',NULL,0,4,NULL,NULL,'rancjggf@gmail.com'),(62,'rm','roma',NULL,1,4,NULL,NULL,'bhrancf@gmail.com'),(63,'rm','roma','lunghezza',1,3,NULL,NULL,'jgsizegf@gmail.com'),(64,'rm','roma',NULL,2,3,NULL,NULL,'sizebhf@gmail.com'),(65,'mi','milano',NULL,3,3,NULL,NULL,'francescsizea@gmail.com'),(66,'mi','milano',NULL,0,2,NULL,NULL,'pennsizea@gmail.com'),(67,'fr','frosinone','piazza bologna',2,0,NULL,NULL,'allardomapenna@gmail.com'),(68,'fr','frosinone','piazza bologna',3,0,NULL,NULL,'lardoBulloc@gmail.com'),(69,'na','napoli','piazza bologna',0,4,NULL,NULL,'salardondraBulloc@gmail.com'),(70,'na','napoli','piazza x',1,4,NULL,NULL,'fdsbhfrandom@gmail.com'),(71,'na','napoli','piazza x',1,4,NULL,NULL,'bhfrandom@gmail.com'),(72,'na','napoli','piazza x',1,4,NULL,NULL,'jgrandomgf@gmail.com'),(73,'na','napoli','piazza x',1,4,NULL,NULL,'dfrandomtna@gmail.com'),(74,'na','napoli','piazza x',1,4,NULL,NULL,'kkkpenna@gmail.com'),(75,'na','napoli','piazza x',2,1,NULL,NULL,'srandomara@gmail.com'),(76,'pa','palermo','piazza y',2,1,NULL,NULL,'ciaonesara@gmail.com'),(77,'pa','palermo','piazza y',2,1,NULL,NULL,'pennlardoa@gmail.com'),(78,'pa','palermo','piazza y',2,1,NULL,NULL,'pen1nasize@gmail.com'),(79,'pa','palermo','piazza y',3,3,NULL,NULL,'df1tna@gmail.com'),(80,'ve','verona','piazza y',3,3,NULL,NULL,'fran1cerancsca@gmail.com'),(81,'ve','verona','piazza z',3,3,NULL,NULL,'rancj1ggf@gmail.com'),(82,'ve','verona','piazza z',3,3,NULL,NULL,'sandraB1ulloc@gmail.com'),(83,'ve','verona','piazza z',3,3,NULL,NULL,'almape1nna@gmail.com'),(84,'ve','verona','piazza z',3,3,NULL,NULL,'srando1sizemara@gmail.com'),(85,'ve','verona','frosinone',3,2,NULL,NULL,'bhran1cf@gmail.com'),(86,'ve','verona','lunghezza',3,2,NULL,NULL,'dftnalardo@gmail.com'),(87,'ve','verona','tor bella monaca',3,2,NULL,NULL,'s3domara@gmail.com'),(88,'ve','verona','grottaferrata',3,2,NULL,NULL,'s33mara@gmail.com'),(89,'zz','zurigo','grottaferrata',3,2,NULL,NULL,'jgsiz1egf@gmail.com'),(90,'zz','zurigo','grottaferrata',3,2,NULL,NULL,'size1bhf@gmail.com'),(91,'zz','zurigo','tor bella monaca',3,2,NULL,NULL,'f111escsizea@gmail.com'),(92,'zz','zurigo','tor bella monaca',1,1,NULL,NULL,'jgrrrrf@gmail.com'),(93,'zz','zurigo','tor bella monaca',1,1,NULL,NULL,'pen3nsizea@gmail.com'),(94,'zz','zurigo','tor bella monaca',1,1,NULL,NULL,'dftnalardo@gmail.com'),(95,'zz','zurigo','tor bella monaca',1,1,NULL,NULL,'francfdsesca@gmail.com'),(96,'zz','zurigo','tor bella monaca',1,1,NULL,NULL,'rand3@gmail.com'),(97,'zz','zurigo','tor bella monaca',1,1,NULL,NULL,'penndfa@gmail.com'),(98,'zz','zurigo','tor bella monaca',1,1,NULL,NULL,'sacara@gmail.com'),(99,'rm','roma','tor bella monaca',1,1,NULL,NULL,'lardosara@gmail.com'),(100,'rm','roma','piazza bologna',3,4,NULL,NULL,'francelardosca@gmail.com'),(101,'rm','roma','piazza bologna',3,4,NULL,NULL,'b@gmail.com'),(102,'rm','roma','piazza bologna',3,4,NULL,NULL,'jf@gmail.com'),(103,'rm','roma','piazza bologna',3,4,NULL,NULL,'almalardo@gmail.com'),(104,'rm','roma','piazza bologna',3,4,NULL,NULL,'lardondomtna@gmail.com'),(105,'rm','roma','piazza bologna',3,4,NULL,NULL,'lardo@gmail.com'),(106,NULL,NULL,NULL,NULL,NULL,NULL,'città','francfdsesca@gmail.com');
/*!40000 ALTER TABLE `schedadiricerca` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-07-28 10:13:51
