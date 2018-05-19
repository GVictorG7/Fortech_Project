CREATE TABLE `useri` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pass` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8


CREATE TABLE `statii` (
  `idStation` int(11) NOT NULL AUTO_INCREMENT,
  `ip` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idStation`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=utf8


CREATE TABLE `servicii` (
  `idService` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `version` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idService`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8


CREATE TABLE `porturi` (
  `idPort` int(11) NOT NULL AUTO_INCREMENT,
  `nr` int(11) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `idService` int(11) DEFAULT NULL,
  `idStation` int(11) DEFAULT NULL,
  PRIMARY KEY (`idPort`),
  KEY `FKsm75qpllji0bmkp4quri6dg6n` (`idService`),
  KEY `FKlol5sq7mv5egj7hel57of3gvl` (`idStation`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8


CREATE TABLE `vulnerabilitati` (
  `idVulnerability` int(11) NOT NULL AUTO_INCREMENT,
  `severity` int(11) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `idService` int(11) DEFAULT NULL,
  PRIMARY KEY (`idVulnerability`),
  KEY `FK211dvcl0xgdsyu26qklkunsl3` (`idService`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8