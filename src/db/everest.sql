/*
This sql script is made for java Everest software & it's under GPL3 license
*/

DROP DATABASE If EXISTS everest;	-- removing old database if exist
CREATE SCHEMA everest;

/*! SET NAMES utf8mb4 */;
create user if not exists test@localhost identified by 'test';
USE everest;
GRANT ALL PRIVILEGES ON * . * TO test@localhost;

/*	This table created for login users	*/
CREATE TABLE IF NOT EXISTS user (
    user_id INT(11) NOT NULL AUTO_INCREMENT,
    user_name VARCHAR(50) NOT NULL,
    user_password VARCHAR(50) NOT NULL,
    user_privilege VARCHAR(15) NOT NULL,
    PRIMARY KEY (user_id)
)  AUTO_INCREMENT=1;


-- Dumping data for table user
INSERT INTO user (user_id, user_name, user_password, user_privilege) 
VALUES(1, 'admin', '21232f297a57a5a743894a0e4a801fc3', 'Admin');

-- --------------------------------------------------------
/*	This table is created for exams	*/
CREATE TABLE IF NOT EXISTS exam (
    exam_id INT(5) NOT NULL AUTO_INCREMENT,
    exam_name VARCHAR(50) NOT NULL,
    exam_price DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
    exam_time TIMESTAMP NOT NULL,
    PRIMARY KEY (exam_id),
    UNIQUE (exam_name , exam_time)
)  AUTO_INCREMENT=1;

-- Dumping data for table exam
INSERT INTO exam (exam_id, exam_name, exam_price, exam_time) 
VALUES(1, 'exam_1', 100, '2019-04-20');

-- --------------------------------------------------------
/*	This table is created for books */
CREATE TABLE IF NOT EXISTS book (
    book_id INT(11) NOT NULL AUTO_INCREMENT,
    book_name VARCHAR(50) NOT NULL,
    book_price DOUBLE NOT NULL,
    book_quantity INT NOT NULL,
    book_sold INT NOT NULL DEFAULT 0,
    book_isbn VARCHAR(13),
    PRIMARY KEY (book_id)
)  AUTO_INCREMENT=1;

-- Dumping data for table book
INSERT INTO book 
(book_id,book_name,book_price,book_quantity,book_sold,book_isbn)
Values(1,'Book1',100,10,5,'some isbn');

-- --------------------------------------------------------
/*	This table is created for teachers */
CREATE TABLE IF NOT EXISTS teacher (
    teacher_id INT(11) NOT NULL AUTO_INCREMENT,
    teacher_name VARCHAR(100) NOT NULL,
    teacher_phone VARCHAR(12) NOT NULL,
    PRIMARY KEY (teacher_id)
)  AUTO_INCREMENT=1;
-- Dumping data for table teacher
INSERT INTO teacher(teacher_id,teacher_name,teacher_phone)
values(1,'Teacher 1','059-123-4567');

-- --------------------------------------------------------
/*	This table is created for course */
CREATE TABLE IF NOT EXISTS course (
    course_id INT(11) NOT NULL AUTO_INCREMENT,
    course_name VARCHAR(50) NOT NULL,
    course_start_date VARCHAR(11) NOT NULL,
    course_end_date VARCHAR(11) NOT NULL,
    course_price INT(11) NOT NULL,
    course_time_hour_from VARCHAR(10) NOT NULL,
    course_time_hour_to VARCHAR(10) NOT NULL,
    course_days VARCHAR(20) NOT NULL,
    PRIMARY KEY (course_id)
)  AUTO_INCREMENT=1;

-- Dumping data for table course
INSERT INTO course 
(course_id,course_name,course_start_date,course_end_date,
course_price,course_time_hour_from,
course_time_hour_to,course_days)value
(1, 'course 1', '2018-01-01','2018-02-02', 500, '5:30', '10:30', 'Su,Tu,Th'),
(2, 'course 2', '2018-01-01','2018-02-02', 200, '10:00', '3:30', 'Sa,Su,Mo');


-- --------------------------------------------------------
/*	This table is created for student */
CREATE TABLE IF NOT EXISTS student (
    student_id INT(11) NOT NULL AUTO_INCREMENT,
    student_name VARCHAR(50) NOT NULL,
    student_phone VARCHAR(12) NOT NULL,
    student_added_by INT(12) REFERENCES student (student_id),
    PRIMARY KEY (student_id)
)  AUTO_INCREMENT=1;

-- Dumping data for table student
INSERT INTO student(student_id,student_name,student_phone)
values(1,'Student 1','059-123-4567');

INSERT INTO student
(student_id,student_name,student_phone,student_added_by)
values(2,'Student 2','059-123-4567',1);

-- --------------------------------------------------------
/*	This table is created for student books */
CREATE TABLE IF NOT EXISTS student_books (
    student_id INT(11),
    book_id INT(11),
    CONSTRAINT FOREIGN KEY (book_id)
        REFERENCES book (book_id)
        ON DELETE RESTRICT,
    CONSTRAINT FOREIGN KEY (student_id)
        REFERENCES student (student_id)
        ON DELETE RESTRICT,
    PRIMARY KEY (student_id , book_id)
)  ENGINE=INNODB;

-- Dumping data for table student
INSERT INTO student_books(student_id,book_id)
values(1,1);

-- --------------------------------------------------------
/*	This table is created for student exams */
CREATE TABLE IF NOT EXISTS student_exams (
    student_id INT(11),
    exam_id INT(11),
    CONSTRAINT FOREIGN KEY (exam_id)
        REFERENCES exam (exam_id)
        ON DELETE RESTRICT,
    CONSTRAINT FOREIGN KEY (student_id)
        REFERENCES student (student_id)
        ON DELETE RESTRICT,
    PRIMARY KEY (student_id , exam_id)
)  ENGINE=INNODB;

-- Dumping data for table student
INSERT INTO student_exams(student_id,exam_id)
values(1,1);

-- --------------------------------------------------------
/*	This table is created for student courses */
CREATE TABLE IF NOT EXISTS student_courses (
    student_id INT(11),
    course_id INT(11),
    CONSTRAINT FOREIGN KEY (course_id)
        REFERENCES course (course_id)
        ON DELETE RESTRICT,
    CONSTRAINT FOREIGN KEY (student_id)
        REFERENCES student (student_id)
        ON DELETE RESTRICT,
    PRIMARY KEY (student_id , course_id)
)  ENGINE=INNODB;

-- Dumping data for table student
INSERT INTO student_courses(student_id,course_id)
values(1,1);

-- --------------------------------------------------------
/*	This table is created for teacher courses */
CREATE TABLE IF NOT EXISTS teacher_courses (
    teacher_id INT(11),
    course_id INT(11),
    CONSTRAINT FOREIGN KEY (course_id)
        REFERENCES course (course_id)
        ON DELETE RESTRICT,
    CONSTRAINT FOREIGN KEY (teacher_id)
        REFERENCES teacher (teacher_id)
        ON DELETE RESTRICT,
    PRIMARY KEY (teacher_id , course_id)
)  ENGINE=INNODB;

-- Dumping data for table student
INSERT INTO teacher_courses(teacher_id,course_id)
values(1,1);

-- --------------------------------------------------------
-- CREATE TABLE IF NOT EXISTS invoice (
--     invoiceId INT(10) NOT NULL AUTO_INCREMENT,
--     StdId_fk INT(11) DEFAULT NULL,
--     TotalPrice DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
--     paymentValue DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
--     Net DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
--     remaindCash DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
--     PRIMARY KEY (invoiceId),
--     KEY invoice_ibfk_1 (StdId_fk)
-- )  ENGINE=INNODB AUTO_INCREMENT=12 DEFAULT CHARSET=UTF8;

-- CREATE TABLE IF NOT EXISTS purchases (
--     PaymentNo INT(5) NOT NULL AUTO_INCREMENT,
--     StdID INT(11) DEFAULT NULL,
--     paymentValue DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
--     remaindCash DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
--     paymentTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
--     Net DOUBLE(5 , 2 ) NOT NULL DEFAULT '0.00',
--     paymentMethod VARCHAR(50) DEFAULT NULL,
--     PRIMARY KEY (PaymentNo)
-- )  ENGINE=INNODB AUTO_INCREMENT=15 DEFAULT CHARSET=UTF8;