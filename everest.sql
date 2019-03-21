-- removing old database if exist ..

DROP DATABASE If EXISTS everest;
CREATE SCHEMA everest;
USE everest;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `everest`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE IF NOT EXISTS `book` (
  `BookId` int(11) NOT NULL,
  `BookName` varchar(50) NOT NULL,
  `Price` double NOT NULL,
  `Bought` varchar(3) NOT NULL DEFAULT 'No',
  PRIMARY KEY (`BookId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE IF NOT EXISTS `course` (
  `CourseId` int(11) NOT NULL AUTO_INCREMENT,
  `CourseName` varchar(50) DEFAULT NULL,
  `CourseDateStart` varchar(11) DEFAULT NULL,
  `Teacher_TeacherId` int(11) DEFAULT NULL,
  `CoursePrice` int(11) DEFAULT NULL,
  `HourFrom` varchar(10) DEFAULT NULL,
  `HourTo` varchar(10) DEFAULT NULL,
  `CourseDays` varchar(50) DEFAULT NULL,
  `CourseDateEnd` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`CourseId`),
  KEY `Teacher_TeacherId` (`Teacher_TeacherId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`CourseId`, `CourseName`, `CourseDateStart`, `Teacher_TeacherId`, `CoursePrice`, `HourFrom`, `HourTo`, `CourseDays`, `CourseDateEnd`) VALUES
(1, 'cpm', '01-01-2018', NULL, 500, '5:30', '10:30', 'Sunday,Tuesday,Thursday', '02-02-2018'),
(2, 'cpa', '01-01-2018', NULL, 200, '10:00', '3:00', 'Saturday,Sunday,Monday', '03-03-2018');

-- --------------------------------------------------------

--
-- Table structure for table `exam`
--

CREATE TABLE IF NOT EXISTS `exam` (
  `ExamID` int(5) NOT NULL AUTO_INCREMENT,
  `ExamName` varchar(50) NOT NULL,
  `ExamPrice` double(5,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`ExamID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE IF NOT EXISTS `invoice` (
  `invoiceId` int(10) NOT NULL AUTO_INCREMENT,
  `StdId_fk` int(11) DEFAULT NULL,
  `TotalPrice` double(5,2) NOT NULL DEFAULT '0.00',
  `paymentValue` double(5,2) NOT NULL DEFAULT '0.00',
  `Net` double(5,2) NOT NULL DEFAULT '0.00',
  `remaindCash` double(5,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`invoiceId`),
  KEY `invoice_ibfk_1` (`StdId_fk`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

--
-- Table structure for table `payments`
--

CREATE TABLE IF NOT EXISTS `payments` (
  `PaymentNo` int(5) NOT NULL AUTO_INCREMENT,
  `StdID` int(11) DEFAULT NULL,
  `paymentValue` double(5,2) NOT NULL DEFAULT '0.00',
  `remaindCash` double(5,2) NOT NULL DEFAULT '0.00',
  `paymentTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Net` double(5,2) NOT NULL DEFAULT '0.00',
  `paymentMethod` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`PaymentNo`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `payment_item`
--

CREATE TABLE IF NOT EXISTS `payment_item` (
  `PaymentID` int(10) NOT NULL AUTO_INCREMENT,
  `Item` varchar(50) DEFAULT NULL,
  `ItemID` int(10) NOT NULL,
  `PaidFor` text NOT NULL,
  PRIMARY KEY (`PaymentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `StdID` int(11) NOT NULL AUTO_INCREMENT,
  `StdName` varchar(50) NOT NULL,
  `IDCardNum` int(9) NOT NULL DEFAULT '0',
  `StdPhoneNum` int(10) NOT NULL,
  `AddedBy` varchar(20) NOT NULL,
  `Time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `discount` double(5,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`StdID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `student_book`
--

CREATE TABLE IF NOT EXISTS `student_book` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `StdID` int(11) NOT NULL,
  `BookID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `student_book_ibfk_1` (`StdID`),
  KEY `student_book_ibfk_2` (`BookID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `student_course`
--

CREATE TABLE IF NOT EXISTS `student_course` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `StdID` int(11) NOT NULL,
  `courseID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_StdID1` (`StdID`),
  KEY `FK_courseID` (`courseID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `student_exam`
--

CREATE TABLE IF NOT EXISTS `student_exam` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `StdID` int(11) NOT NULL,
  `examID` int(5) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_StdID` (`StdID`),
  KEY `FK_examID` (`examID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE IF NOT EXISTS `teacher` (
  `TeacherId` int(11) NOT NULL AUTO_INCREMENT,
  `TeacherName` varchar(100) NOT NULL,
  `TeacherPhoneNumber` int(11) NOT NULL DEFAULT '0',
  `CourseHours` int(5) NOT NULL DEFAULT '0',
  `HourPrice` double(5,2) NOT NULL DEFAULT '0.00',
  `TotalPrice` double(5,2) DEFAULT '0.00',
  PRIMARY KEY (`TeacherId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Privilege` varchar(15) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=2342 DEFAULT CHARSET=utf8;

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
