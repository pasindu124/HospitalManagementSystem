-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 12, 2017 at 03:09 PM
-- Server version: 5.7.9
-- PHP Version: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
CREATE TABLE IF NOT EXISTS `doctor` (
  `d_id` int(11) NOT NULL AUTO_INCREMENT,
  `d_registrationcode` varchar(45) NOT NULL,
  `d_type` varchar(45) NOT NULL,
  `Employee_e_id` int(11) NOT NULL,
  PRIMARY KEY (`d_id`,`Employee_e_id`),
  KEY `fk_doctor_Employee1_idx` (`Employee_e_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`d_id`, `d_registrationcode`, `d_type`, `Employee_e_id`) VALUES
(1, 'ABC123', 'Dentist', 1),
(2, 'ABB4587', 'Dentist', 6),
(3, 'djhsd', 'Psychiatrist', 7);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
  `e_id` int(11) NOT NULL AUTO_INCREMENT,
  `e_name` varchar(100) NOT NULL,
  `e_sex` varchar(45) NOT NULL,
  `e_age` varchar(45) NOT NULL,
  `e_address` varchar(100) NOT NULL,
  `e_contactno` varchar(45) NOT NULL,
  PRIMARY KEY (`e_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`e_id`, `e_name`, `e_sex`, `e_age`, `e_address`, `e_contactno`) VALUES
(1, 'Pasindu', 'Female', '59', 'Matara,veligama', '111111'),
(2, 'Malith', 'Male', '59', 'Matara,veligama', '07454666'),
(3, 'Thashila', 'Male', '59', 'Matara,veligama', '07454666'),
(4, 'Vimukthi', 'Female', '99', 'Matara,veligama', '07454666'),
(5, 'Lumindu', 'Male', '59', 'Matara,veligama', '07454666'),
(6, 'Vishswa', 'Male', '59', 'Matara,veligama', '07454666'),
(7, 'Lasan', 'Male', '59', 'Matara,veligama', '07454666');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('Admin', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `maintancestaff`
--

DROP TABLE IF EXISTS `maintancestaff`;
CREATE TABLE IF NOT EXISTS `maintancestaff` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_tasks` varchar(100) NOT NULL,
  `Employee_e_id` int(11) NOT NULL,
  PRIMARY KEY (`s_id`,`Employee_e_id`),
  KEY `fk_maintanceStaff_Employee1_idx` (`Employee_e_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `maintancestaff`
--

INSERT INTO `maintancestaff` (`s_id`, `s_tasks`, `Employee_e_id`) VALUES
(1, 'Athugeema', 2),
(2, 'Checjfsjlkfsklfsldfs;fsfsfsfsk remaining beds', 5);

-- --------------------------------------------------------

--
-- Table structure for table `nurse`
--

DROP TABLE IF EXISTS `nurse`;
CREATE TABLE IF NOT EXISTS `nurse` (
  `n_id` int(11) NOT NULL AUTO_INCREMENT,
  `n_grade` varchar(45) NOT NULL,
  `Employee_e_id` int(11) NOT NULL,
  `ward_w_id` int(11) NOT NULL,
  PRIMARY KEY (`n_id`,`Employee_e_id`,`ward_w_id`),
  KEY `fk_nurse_Employee1_idx` (`Employee_e_id`),
  KEY `fk_nurse_ward1_idx` (`ward_w_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `nurse`
--

INSERT INTO `nurse` (`n_id`, `n_grade`, `Employee_e_id`, `ward_w_id`) VALUES
(1, 'A', 3, 3),
(2, 'B', 4, 4);

-- --------------------------------------------------------

--
-- Table structure for table `patientdetails`
--

DROP TABLE IF EXISTS `patientdetails`;
CREATE TABLE IF NOT EXISTS `patientdetails` (
  `p_id` int(11) NOT NULL AUTO_INCREMENT,
  `p_name` varchar(45) NOT NULL,
  `p_age` varchar(45) NOT NULL,
  `p_sex` varchar(45) NOT NULL,
  `p_address` varchar(100) NOT NULL,
  `p_contactno` varchar(45) NOT NULL,
  `ward_w_id` int(11) NOT NULL,
  `doctor_d_id` int(11) NOT NULL,
  `doctor_Employee_e_id` int(11) NOT NULL,
  PRIMARY KEY (`p_id`,`ward_w_id`,`doctor_d_id`,`doctor_Employee_e_id`),
  KEY `fk_patientDetails_ward1_idx` (`ward_w_id`),
  KEY `fk_patientDetails_doctor1_idx` (`doctor_d_id`,`doctor_Employee_e_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `patientdetails`
--

INSERT INTO `patientdetails` (`p_id`, `p_name`, `p_age`, `p_sex`, `p_address`, `p_contactno`, `ward_w_id`, `doctor_d_id`, `doctor_Employee_e_id`) VALUES
(1, 'Amila Darshana', '22', 'Male', '107,Weeraketiya		107,Weeraketiya', '0785545544', 1, 1, 1),
(2, 'Vimal', '54', 'Female', 'asdasd', '54524', 3, 1, 1),
(3, 'Waruni', '23', 'Female', 'dsfs', '324', 4, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
CREATE TABLE IF NOT EXISTS `payment` (
  `pay_id` int(11) NOT NULL AUTO_INCREMENT,
  `pay_amount` int(11) NOT NULL,
  `patientDetails_p_id` int(11) NOT NULL,
  `pay_mode` varchar(100) NOT NULL,
  `pay_date` varchar(100) NOT NULL,
  PRIMARY KEY (`pay_id`,`patientDetails_p_id`),
  KEY `fk_payment_patientDetails1_idx` (`patientDetails_p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`pay_id`, `pay_amount`, `patientDetails_p_id`, `pay_mode`, `pay_date`) VALUES
(1, 4500, 1, '', ''),
(2, 4300, 3, 'byCheck', '1/15/2016'),
(3, 1230, 3, 'byCash', '12/02/2017');

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
CREATE TABLE IF NOT EXISTS `salary` (
  `employee_e_id` int(11) NOT NULL,
  `s_year` varchar(45) NOT NULL,
  `s_month` varchar(45) NOT NULL,
  `s_attendance` varchar(45) NOT NULL,
  `s_amount` varchar(45) NOT NULL,
  PRIMARY KEY (`employee_e_id`,`s_year`,`s_month`),
  KEY `fk_salary_employee1_idx` (`employee_e_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `salary`
--

INSERT INTO `salary` (`employee_e_id`, `s_year`, `s_month`, `s_attendance`, `s_amount`) VALUES
(1, '2017', 'may', '12', '23000');

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

DROP TABLE IF EXISTS `test`;
CREATE TABLE IF NOT EXISTS `test` (
  `t_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_title` varchar(45) NOT NULL,
  `t_details` varchar(45) NOT NULL,
  `patientDetails_p_id` int(11) NOT NULL,
  PRIMARY KEY (`t_id`,`patientDetails_p_id`),
  KEY `fk_test_patientDetails_idx` (`patientDetails_p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `test`
--

INSERT INTO `test` (`t_id`, `t_title`, `t_details`, `patientDetails_p_id`) VALUES
(1, 'Urin Test', 'Positive\n286.5', 1);

-- --------------------------------------------------------

--
-- Table structure for table `ward`
--

DROP TABLE IF EXISTS `ward`;
CREATE TABLE IF NOT EXISTS `ward` (
  `w_id` int(11) NOT NULL AUTO_INCREMENT,
  `w_name` varchar(45) CHARACTER SET big5 NOT NULL,
  PRIMARY KEY (`w_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ward`
--

INSERT INTO `ward` (`w_id`, `w_name`) VALUES
(1, 'Maternity'),
(2, 'Pediatrics'),
(3, 'Oncology'),
(4, 'Gynecologist');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `doctor`
--
ALTER TABLE `doctor`
  ADD CONSTRAINT `fk_doctor_Employee1` FOREIGN KEY (`Employee_e_id`) REFERENCES `employee` (`e_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `maintancestaff`
--
ALTER TABLE `maintancestaff`
  ADD CONSTRAINT `fk_maintanceStaff_Employee1` FOREIGN KEY (`Employee_e_id`) REFERENCES `employee` (`e_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `nurse`
--
ALTER TABLE `nurse`
  ADD CONSTRAINT `fk_nurse_Employee1` FOREIGN KEY (`Employee_e_id`) REFERENCES `employee` (`e_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_nurse_ward1` FOREIGN KEY (`ward_w_id`) REFERENCES `ward` (`w_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `patientdetails`
--
ALTER TABLE `patientdetails`
  ADD CONSTRAINT `fk_patientDetails_doctor1` FOREIGN KEY (`doctor_d_id`,`doctor_Employee_e_id`) REFERENCES `doctor` (`d_id`, `Employee_e_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_patientDetails_ward1` FOREIGN KEY (`ward_w_id`) REFERENCES `ward` (`w_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `fk_payment_patientDetails1` FOREIGN KEY (`patientDetails_p_id`) REFERENCES `patientdetails` (`p_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `salary`
--
ALTER TABLE `salary`
  ADD CONSTRAINT `fk_salary_employee1` FOREIGN KEY (`employee_e_id`) REFERENCES `employee` (`e_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `test`
--
ALTER TABLE `test`
  ADD CONSTRAINT `fk_test_patientDetails` FOREIGN KEY (`patientDetails_p_id`) REFERENCES `patientdetails` (`p_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
