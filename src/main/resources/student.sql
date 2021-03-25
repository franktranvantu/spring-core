DROP TABLE IF EXISTS student;

CREATE TABLE IF NOT EXISTS student(
    student_id INT NOT NULL,
    name VARCHAR(20) NOT NULL,
    age INT NOT NULL,
    PRIMARY KEY (student_id)
);