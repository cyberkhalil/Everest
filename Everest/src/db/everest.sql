/*
This sql script is made for java Everest software & it's under GPL3 license
*/

DROP DATABASE If EXISTS everest;	-- removing old database if exist
CREATE SCHEMA everest;

/*! SET NAMES utf8mb4 */;
create user if not exists `test`@`localhost` identified by 'test';
USE everest;
GRANT ALL PRIVILEGES ON * . * TO `test`@`localhost`;

/*	This table created for login users	*/
CREATE TABLE IF NOT EXISTS `user` (
    `user_id` INT(11) NOT NULL AUTO_INCREMENT,
    `user_name` VARCHAR(50) NOT NULL,
    `user_password` VARCHAR(50) NOT NULL,
    `user_privilege` VARCHAR(15) NOT NULL,
    PRIMARY KEY (`user_id`)
)  AUTO_INCREMENT=1;


-- Dumping data for table `user`
INSERT INTO `user` (`user_id`, `user_name`, `user_password`, `user_privilege`) 
VALUES(1, 'admin', '21232f297a57a5a743894a0e4a801fc3', 'Admin');

-- --------------------------------------------------------
/*	This table is created for exams	*/
CREATE TABLE IF NOT EXISTS `exam` (
    `exam_id` INT(5) NOT NULL AUTO_INCREMENT,
    `exam_name` VARCHAR(50) NOT NULL,
    `exam_price` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
    `exam_time` TIMESTAMP NOT NULL,
    PRIMARY KEY (`exam_id`),
    UNIQUE (`exam_name` , `exam_time`)
)  AUTO_INCREMENT=1;

-- Dumping data for table `exam`
INSERT INTO `exam` (`exam_id`, `exam_name`, `exam_price`, `exam_time`) 
VALUES(1, 'exam_1', 100, '2019-04-20');

-- --------------------------------------------------------
/*	This table is created for books */
CREATE TABLE IF NOT EXISTS `book` (
    `book_id` INT(11) NOT NULL AUTO_INCREMENT,
    `book_name` VARCHAR(50) NOT NULL,
    `book_price` DOUBLE NOT NULL,
    `book_quantity` INT NOT NULL,
    `book_sold` INT NOT NULL DEFAULT 0,
    `book_isbn` VARCHAR(13),
    PRIMARY KEY (`book_id`)
)  AUTO_INCREMENT=1;

-- Dumping data for table `book`
INSERT INTO `book` 
(`book_id`,`book_name`,`book_price`,`book_quantity`,`book_sold`,`book_isbn`)
Values(1,'Book1',100,10,5,'some isbn');

-- --------------------------------------------------------
/*	This table is created for teachers */
CREATE TABLE IF NOT EXISTS `teacher` (
    `teacher_id` INT(11) NOT NULL AUTO_INCREMENT,
    `teacher_name` VARCHAR(100) NOT NULL,
    `teacher_phone` INT(11) NOT NULL,
    PRIMARY KEY (`teacher_id`)
)  AUTO_INCREMENT=1;
-- Dumping data for table `teacher`
INSERT INTO `teacher`(`teacher_id`,`teacher_name`,`teacher_phone`)
values(1,'Teacher 1','0591234567');

-- --------------------------------------------------------
/*	This table is created for teacher */
CREATE TABLE IF NOT EXISTS `course` (
    `course_id` INT(11) NOT NULL AUTO_INCREMENT,
    `course_name` VARCHAR(50) NOT NULL,
    `course_start_date` VARCHAR(11) NOT NULL,
    `course_end_date` VARCHAR(11) NOT NULL,
    `course_price` INT(11) NOT NULL,
    `course_time_hour_from` VARCHAR(10) NOT NULL,
    `course_time_hour_to` VARCHAR(10) NOT NULL,
    `course_days` VARCHAR(20) NOT NULL,
    PRIMARY KEY (`course_id`)
)  AUTO_INCREMENT=1;


-- Dumping data for table `course`
INSERT INTO `course` 
(`course_id`,`course_name`,`course_start_date`,`course_end_date`,
`course_price`,`course_time_hour_from`,
`course_time_hour_to`,`course_days`)value
(1, 'course 1', '01-01-2018','02-02-2018', 500, '5:30', '10:30', 'Su,Tu,Th'),
(2, 'course 2', '01-01-2018','02-02-2018', 200, '10:00', '3:30', 'Sa,Su,Mo');

-- -- --------------------------------------------------------
-- in new table (teacher_courses)
-- FOREIGN KEY `course_teacher_id` REFERENCES `teacher`(`teacher_id`)
-- FOREIGN KEY `course_id` REFERENCES `course`(`course_id`)

-- CREATE TABLE IF NOT EXISTS `invoice` (
--     `invoiceId` INT(10) NOT NULL AUTO_INCREMENT,
--     `StdId_fk` INT(11) DEFAULT NULL,
--     `TotalPrice` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
--     `paymentValue` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
--     `Net` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
--     `remaindCash` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
--     PRIMARY KEY (`invoiceId`),
--     KEY `invoice_ibfk_1` (`StdId_fk`)
-- )  ENGINE=INNODB AUTO_INCREMENT=12 DEFAULT CHARSET=UTF8;

-- CREATE TABLE IF NOT EXISTS `payments` (
--     `PaymentNo` INT(5) NOT NULL AUTO_INCREMENT,
--     `StdID` INT(11) DEFAULT NULL,
--     `paymentValue` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
--     `remaindCash` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
--     `paymentTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
--     `Net` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
--     `paymentMethod` VARCHAR(50) DEFAULT NULL,
--     PRIMARY KEY (`PaymentNo`)
-- )  ENGINE=INNODB AUTO_INCREMENT=15 DEFAULT CHARSET=UTF8;

-- -- --------------------------------------------------------

-- CREATE TABLE IF NOT EXISTS `payment_item` (
--     `PaymentID` INT(10) NOT NULL AUTO_INCREMENT,
--     `Item` VARCHAR(50) DEFAULT NULL,
--     `ItemID` INT(10) NOT NULL,
--     `PaidFor` TEXT NOT NULL,
--     PRIMARY KEY (`PaymentID`)
-- )  ENGINE=INNODB DEFAULT CHARSET=UTF8;

-- -- --------------------------------------------------------

-- CREATE TABLE IF NOT EXISTS `student` (
--     `StdID` INT(11) NOT NULL AUTO_INCREMENT,
--     `StdName` VARCHAR(50) NOT NULL,
--     `IDCardNum` INT(9),
--     `StdPhoneNum` INT(10) NOT NULL,
--     `AddedBy` VARCHAR(20),
--     `Time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
--     `discount` DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
--     PRIMARY KEY (`StdID`)
-- )  ENGINE=INNODB AUTO_INCREMENT=12 DEFAULT CHARSET=UTF8;

-- -- --------------------------------------------------------

-- CREATE TABLE IF NOT EXISTS `student_book` (
--     `ID` INT(11) NOT NULL AUTO_INCREMENT,
--     `StdID` INT(11) NOT NULL,
--     `BookID` INT(11) NOT NULL,
--     PRIMARY KEY (`ID`),
--     KEY `student_book_ibfk_1` (`StdID`),
--     KEY `student_book_ibfk_2` (`BookID`)
-- )  ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=UTF8;

-- -- --------------------------------------------------------

-- CREATE TABLE IF NOT EXISTS `student_course` (
--     `ID` INT(11) NOT NULL AUTO_INCREMENT,
--     `StdID` INT(11) NOT NULL,
--     `courseID` INT(11) NOT NULL,
--     PRIMARY KEY (`ID`),
--     KEY `FK_StdID1` (`StdID`),
--     KEY `FK_courseID` (`courseID`)
-- )  ENGINE=INNODB DEFAULT CHARSET=UTF8;

-- -- --------------------------------------------------------

-- CREATE TABLE IF NOT EXISTS `student_exam` (
--     `ID` INT(11) NOT NULL AUTO_INCREMENT,
--     `StdID` INT(11) NOT NULL,
--     `examID` INT(5) NOT NULL,
--     PRIMARY KEY (`ID`),
--     KEY `FK_StdID` (`StdID`),
--     KEY `FK_examID` (`examID`)
-- )  ENGINE=INNODB DEFAULT CHARSET=UTF8;

-- -- --------------------------------------------------------

-- --
-- -- Constraints for table `course`
-- --
-- ALTER TABLE `course`
--   ADD CONSTRAINT `course_ibfk_1` FOREIGN KEY (`Teacher_TeacherId`) REFERENCES `teacher` (`TeacherId`) ON DELETE CASCADE ON UPDATE CASCADE;

-- --
-- -- Constraints for table `invoice`
-- --
-- ALTER TABLE `invoice`
--   ADD CONSTRAINT `invoice_ibfk_1` FOREIGN KEY (`StdId_fk`) REFERENCES `student` (`StdID`) ON DELETE CASCADE ON UPDATE CASCADE;

-- --
-- -- Constraints for table `student_book`
-- --
-- ALTER TABLE `student_book`
--   ADD CONSTRAINT `student_book_ibfk_2` FOREIGN KEY (`BookID`) REFERENCES `book` (`BookId`) ON DELETE NO ACTION ON UPDATE CASCADE;

-- --
-- -- Constraints for table `student_course`
-- --
-- ALTER TABLE `student_course`
--   ADD CONSTRAINT `FK_courseID` FOREIGN KEY (`courseID`) REFERENCES `course` (`CourseId`) ON DELETE NO ACTION ON UPDATE CASCADE;

-- --
-- -- Constraints for table `student_exam`
-- --
-- ALTER TABLE `student_exam`
--   ADD CONSTRAINT `FK_examID` FOREIGN KEY (`examID`) REFERENCES `exam` (`ExamID`) ON DELETE NO ACTION ON UPDATE CASCADE
