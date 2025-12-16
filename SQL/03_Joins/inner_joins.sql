-- Q1: All employees with their department names
SELECT e.name, d.department_name
FROM employees e
INNER JOIN departments d
  ON e.dept_id = d.dept_id;


-- -- Q2: Employees in Finance department using INNER JOIN
SELECT e.name, d.department_name
FROM employees e
INNER JOIN departments d
  ON e.dept_id = d.dept_id
WHERE d.department_name = 'Finance';


-- Q3: Employees earning more than 50k
SELECT e.name, d.department_name, e.salary
FROM employees e
INNER JOIN departments d
  ON e.dept_id = d.dept_id
WHERE e.salary > 50000;


-- Q4: Employees in IT hired after 2021-01-01
SELECT e.name, e.hire_date, d.department_name
FROM employees e
INNER JOIN departments d
  ON e.dept_id = d.dept_id
WHERE d.department_name = 'IT'
  AND e.hire_date > '2021-01-01';


-- Q5: Employees in IT or Finance departments, sorted by name
SELECT 
    e.name, 
    d.department_name
FROM employees e
INNER JOIN departments d
    ON e.dept_id = d.dept_id
WHERE d.department_name IN ('IT', 'Finance')
ORDER BY e.name ASC;


-- Q6: Count of employees per department (only departments with more than 1 employee)
SELECT 
    d.department_name, 
    COUNT(e.emp_id) AS employee_count
FROM employees e
INNER JOIN departments d
    ON e.dept_id = d.dept_id
GROUP BY d.department_name
HAVING COUNT(e.emp_id) > 1;
