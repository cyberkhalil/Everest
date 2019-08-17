CREATE TABLE IF NOT EXISTS version (
    version DOUBLE NOT NULL
);
-- STUDENT BOOKS
CREATE TABLE student_books_temp as select * from student_books;
drop table student_books;
CREATE TABLE IF NOT EXISTS student_books (
    student_id INT,
    book_id INT,
    book_quantity INT NOT NULL,
    buy_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT sb_book_id_fk FOREIGN KEY (book_id)
        REFERENCES book (book_id)
        ON DELETE RESTRICT,
    CONSTRAINT sb_student_id_fk FOREIGN KEY (student_id)
        REFERENCES student (student_id)
        ON DELETE CASCADE,
    PRIMARY KEY (student_id , book_id)
)  ENGINE=INNODB;
insert into student_books (select * from student_books_temp);
drop table student_books_temp;
-- STUDENT EXAMS
CREATE TABLE student_exams_temp as select * from student_exams;
drop table student_exams;
CREATE TABLE student_exams (
    student_id INT,
    exam_id INT,
    enroll_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT se_exam_id_fk FOREIGN KEY (exam_id)
        REFERENCES exam (exam_id)
        ON DELETE RESTRICT,
    CONSTRAINT se_student_id_fk FOREIGN KEY (student_id)
        REFERENCES student (student_id)
        ON DELETE CASCADE,
    PRIMARY KEY (student_id , exam_id)
)  ENGINE=INNODB;
insert into student_exams (select * from student_exams_temp);
drop table student_exams_temp;
-- STUDENT COURSES
CREATE TABLE student_courses_temp as select * from student_courses;
drop table student_courses;
CREATE TABLE IF NOT EXISTS student_courses (
    student_id INT,
    course_id INT,
    enroll_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT sc_course_id_fk FOREIGN KEY (course_id)
        REFERENCES course (course_id)
        ON DELETE RESTRICT,
    CONSTRAINT sc_student_id_fk FOREIGN KEY (student_id)
        REFERENCES student (student_id)
        ON DELETE CASCADE,
    PRIMARY KEY (student_id , course_id)
)  ENGINE=INNODB;
insert into student_courses (select * from student_courses_temp);
drop table student_courses_temp;
-- STUDENT PURCHASES
CREATE TABLE student_purchases_temp as select * from student_purchases;
drop table student_purchases;
CREATE TABLE IF NOT EXISTS student_purchases (
    purchase_id INT NOT NULL AUTO_INCREMENT,
    student_id INT NOT NULL,
    purchase_price DOUBLE NOT NULL,
    purchase_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT sp_student_id_fk FOREIGN KEY (student_id)
        REFERENCES student (student_id)
        ON DELETE CASCADE,
    PRIMARY KEY (purchase_id)
)  AUTO_INCREMENT=1;
insert into student_purchases (select * from student_purchases_temp);
drop table student_purchases_temp;
--------------
DELETE from version;
INSERT INTO version values(1.5);