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
