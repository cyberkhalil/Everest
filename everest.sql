/*
This sql script is made for java Everest software & it's under GPL3 license
*/

DROP DATABASE If EXISTS everest;	-- removing old database if exist
CREATE SCHEMA everest;
create user if not exists 'test'@'localhost' identified by 'test';
USE everest;
GRANT ALL PRIVILEGES ON * . * TO 'test'@'localhost';
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

CREATE TABLE IF NOT EXISTS `book` (
    `BookId` INT(11) NOT NULL,
    `BookName` VARCHAR(50) NOT NULL,
    `Price` DOUBLE NOT NULL,
    `Bought` VARCHAR(3) NOT NULL DEFAULT 'No',
    PRIMARY KEY (`BookId`)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;

-- --------------------------------------------------------

CREATE TABLE IF NOT EXISTS `course` (
    `CourseId` INT(11) NOT NULL AUTO_INCREMENT,
    `CourseName` VARCHAR(50) DEFAULT NULL,
    `CourseDateStart` VARCHAR(11) DEFAULT NULL,
    `Teacher_TeacherId` INT(11) DEFAULT NULL,
    `CoursePrice` INT(11) DEFAULT NULL,
    `HourFrom` VARCHAR(10) DEFAULT NULL,
    `HourTo` VARCHAR(10) DEFAULT NULL,
    `CourseDays` VARCHAR(50) DEFAULT NULL,
    `CourseDateEnd` VARCHAR(11) DEFAULT NULL,
    PRIMARY KEY (`CourseId`),
    KEY `Teacher_TeacherId` (`Teacher_TeacherId`)
)  ENGINE=INNODB AUTO_INCREMENT=3 DEFAULT CHARSET=UTF8;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`CourseId`, `CourseName`, `CourseDateStart`, `Teacher_TeacherId`, `CoursePrice`, `HourFrom`, `HourTo`, `CourseDays`, `CourseDateEnd`) VALUES
(1, 'cpm', '01-01-2018', NULL, 500, '5:30', '10:30', 'Sunday,Tuesday,Thursday', '02-02-2018'),
(2, 'cpa', '01-01-2018', NULL, 200, '10:00', '3:00', 'Saturday,Sunday,Monday', '03-03-2018');

-- --------------------------------------------------------

CREATE TABLE IF NOT EXISTS `exam` (
    `ExamID` INT(5) NOT NULL AUTO_INCREMENT,
    `ExamName` VARCHAR(50) NOT NULL,
    `ExamPrice` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
    PRIMARY KEY (`ExamID`)
)  ENGINE=INNODB AUTO_INCREMENT=3 DEFAULT CHARSET=UTF8;

-- --------------------------------------------------------

CREATE TABLE IF NOT EXISTS `invoice` (
    `invoiceId` INT(10) NOT NULL AUTO_INCREMENT,
    `StdId_fk` INT(11) DEFAULT NULL,
    `TotalPrice` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
    `paymentValue` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
    `Net` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
    `remaindCash` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
    PRIMARY KEY (`invoiceId`),
    KEY `invoice_ibfk_1` (`StdId_fk`)
)  ENGINE=INNODB AUTO_INCREMENT=12 DEFAULT CHARSET=UTF8;

CREATE TABLE IF NOT EXISTS `payments` (
    `PaymentNo` INT(5) NOT NULL AUTO_INCREMENT,
    `StdID` INT(11) DEFAULT NULL,
    `paymentValue` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
    `remaindCash` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
    `paymentTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `Net` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
    `paymentMethod` VARCHAR(50) DEFAULT NULL,
    PRIMARY KEY (`PaymentNo`)
)  ENGINE=INNODB AUTO_INCREMENT=15 DEFAULT CHARSET=UTF8;

-- --------------------------------------------------------

CREATE TABLE IF NOT EXISTS `payment_item` (
    `PaymentID` INT(10) NOT NULL AUTO_INCREMENT,
    `Item` VARCHAR(50) DEFAULT NULL,
    `ItemID` INT(10) NOT NULL,
    `PaidFor` TEXT NOT NULL,
    PRIMARY KEY (`PaymentID`)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;

-- --------------------------------------------------------

CREATE TABLE IF NOT EXISTS `student` (
    `StdID` INT(11) NOT NULL AUTO_INCREMENT,
    `StdName` VARCHAR(50) NOT NULL,
    `IDCardNum` INT(9) NOT NULL DEFAULT '0',
    `StdPhoneNum` INT(10) NOT NULL,
    `AddedBy` VARCHAR(20) NOT NULL,
    `Time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `discount` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
    PRIMARY KEY (`StdID`)
)  ENGINE=INNODB AUTO_INCREMENT=12 DEFAULT CHARSET=UTF8;

-- --------------------------------------------------------

CREATE TABLE IF NOT EXISTS `student_book` (
    `ID` INT(11) NOT NULL AUTO_INCREMENT,
    `StdID` INT(11) NOT NULL,
    `BookID` INT(11) NOT NULL,
    PRIMARY KEY (`ID`),
    KEY `student_book_ibfk_1` (`StdID`),
    KEY `student_book_ibfk_2` (`BookID`)
)  ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=UTF8;

-- --------------------------------------------------------

CREATE TABLE IF NOT EXISTS `student_course` (
    `ID` INT(11) NOT NULL AUTO_INCREMENT,
    `StdID` INT(11) NOT NULL,
    `courseID` INT(11) NOT NULL,
    PRIMARY KEY (`ID`),
    KEY `FK_StdID1` (`StdID`),
    KEY `FK_courseID` (`courseID`)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;

-- --------------------------------------------------------

CREATE TABLE IF NOT EXISTS `student_exam` (
    `ID` INT(11) NOT NULL AUTO_INCREMENT,
    `StdID` INT(11) NOT NULL,
    `examID` INT(5) NOT NULL,
    PRIMARY KEY (`ID`),
    KEY `FK_StdID` (`StdID`),
    KEY `FK_examID` (`examID`)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;

-- --------------------------------------------------------

CREATE TABLE IF NOT EXISTS `teacher` (
    `TeacherId` INT(11) NOT NULL AUTO_INCREMENT,
    `TeacherName` VARCHAR(100) NOT NULL,
    `TeacherPhoneNumber` INT(11) NOT NULL DEFAULT '0',
    `CourseHours` INT(5) NOT NULL DEFAULT '0',
    `HourPrice` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
    `TotalPrice` DOUBLE(5 , 2 ) DEFAULT '0.00',
    PRIMARY KEY (`TeacherId`)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;

-- --------------------------------------------------------

CREATE TABLE IF NOT EXISTS `user` (
    `userid` INT(11) NOT NULL AUTO_INCREMENT,
    `Username` VARCHAR(50) NOT NULL,
    `Password` VARCHAR(50) NOT NULL,
    `Privilege` VARCHAR(15) NOT NULL,
    PRIMARY KEY (`userid`)
)  ENGINE=INNODB AUTO_INCREMENT=2342 DEFAULT CHARSET=UTF8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userid`, `Username`, `Password`, `Privilege`) VALUES
(2341, 'admin', '21232f297a57a5a743894a0e4a801fc3', 'Admin');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `course`
--
ALTER TABLE `course`
  ADD CONSTRAINT `course_ibfk_1` FOREIGN KEY (`Teacher_TeacherId`) REFERENCES `teacher` (`TeacherId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `invoice`
--
ALTER TABLE `invoice`
  ADD CONSTRAINT `invoice_ibfk_1` FOREIGN KEY (`StdId_fk`) REFERENCES `student` (`StdID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `student_book`
--
ALTER TABLE `student_book`
  ADD CONSTRAINT `student_book_ibfk_2` FOREIGN KEY (`BookID`) REFERENCES `book` (`BookId`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `student_course`
--
ALTER TABLE `student_course`
  ADD CONSTRAINT `FK_courseID` FOREIGN KEY (`courseID`) REFERENCES `course` (`CourseId`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `student_exam`
--
ALTER TABLE `student_exam`
  ADD CONSTRAINT `FK_examID` FOREIGN KEY (`examID`) REFERENCES `exam` (`ExamID`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;