--Create table employees and make the insert values ;
CREATE DATABASE Organization ;
USE Organization;
CREATE TABLE employees(
emp_id INT AUTO_INCREMENT  PRIMARY KEY, 
name VARCHAR(40)  NOT NULL, 
department VARCHAR(50), 
salary INT, 
hire_date DATE
);

INSERT INTO employees(emp_id, name, department, salary, hire_date)
VALUES
(1,'Amit', 'IT', 60000, '2021-06-01'), 
(2,'Neha', 'HR', 45000, '2020-03-15'),
(3,'Rahul', 'IT', 70000, '2019-11-01'),
(4,'Priya','Finance', 50000, '2022-01-20'),
(5,'Karan', 'IT',40000,'2023-02-12');




-- Q1: Fetch IT employees earning more than 50,000 sorted by salary descending

SELECT name, salary
FROM employees
WHERE department = 'IT'
  AND salary > 50000
ORDER BY salary DESC;


-- Q2: Employees hired after 2021-01-01 excluding HR, sorted by hire date
SELECT name, department, hire_date
FROM employees
WHERE hire_date > '2021-01-01'
  AND department <> 'HR' --AND NOT department = 'HR' it will also work;
 
ORDER BY hire_date ASC;



-- ADD dept_id as an extra column in employees table and then make new table named department having dept_id and its name;

CREATE TABLE department(
dept_id INT PRIMARY KEY, 
department_name VARCHAR(20)
);

INSERT INTO department(dept_id, department_name)
VALUES
(1, 'IT'),
(2,'HR'),
(3,'Finance');


-- how to add column in existing table ;
ALTER TABLE employees 
ADD COLUMN dept_id INT ;

-- how to make foreign key constraint in employees table ;
ALTER TABLE employees
ADD CONSTRAINT fk_emp_dept
FOREIGN KEY(dept_id) REFERENCES department(dept_id);


SELECT *FROM employees;
SELECT * FROM department;



-- update the dept_id column with the help of department table ;
UPDATE employees
SET dept_id=3
where department ='Finance';

--now we can update the row with the help of this line ;
SET SQL_SAFE_UPDATES =0;

--  how to delete a column from table;
ALTER TABLE employees
DROP COLUMN department;
