-- Q1: RIGHT JOIN - Fetch all departments and their employees
-- Include all departments even if no employee belongs to them

SELECT 
    e.name,
    d.department_name
FROM employees e
RIGHT JOIN departments d
    ON e.dept_id = d.dept_id;


-- Q2: RIGHT JOIN - Filter employees by salary
-- Include all departments, even if no employee belongs to them
-- Only employees with salary > 50000 are included

SELECT 
    e.name,
    d.department_name,
    e.salary
FROM employees e
RIGHT JOIN departments d
    ON e.dept_id = d.dept_id
WHERE e.salary > 50000;



-- Q3: RIGHT JOIN - Find departments with no employees
SELECT 
    d.department_name,
    e.name
FROM employees e
RIGHT JOIN departments d
    ON e.dept_id = d.dept_id
WHERE e.name IS NULL;
