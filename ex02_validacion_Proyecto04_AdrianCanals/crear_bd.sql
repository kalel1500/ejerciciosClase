-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-03-2019 a las 20:26:37
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_java_extraordinaria`
--
DROP DATABASE IF EXISTS bd_java_extraordinaria;
CREATE DATABASE IF NOT EXISTS `bd_java_extraordinaria` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
USE `bd_java_extraordinaria`;

-- --------------------------------------------------------
-- Estructura de tabla para la tabla `tbl_administrador`

DROP TABLE IF EXISTS `tbl_administrador`;
CREATE TABLE IF NOT EXISTS `tbl_administrador` (
	`admin_id` int(11) NOT NULL AUTO_INCREMENT,
	`admin_correo` varchar(255) NOT NULL,
	`admin_password` varchar(255) NOT NULL,
	`admin_edad` int(11) DEFAULT NULL,
	PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


-- -------------------------------------------------------
-- DATOS DE LAS TABLAS 
-- ---------------------------------------------------

-- TRUNCATE TABLE `tbl_administrador`;
INSERT INTO `tbl_administrador` (`admin_correo`,`admin_password`,`admin_edad`) VALUES
('usu01@gmail.com','1234',32),
('usu02@gmail.com','1234',64),
('usu03@gmail.com','1234',53),
('usu04@gmail.com','1234',48),
('usu05@gmail.com','1234',39);

