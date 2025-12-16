-- Q1: Basic LEFT JOIN - List all employees with their department names
-- Includes employees even if they don't have a department
SELECT 
    e.name, 
    d.department_name
FROM employees e
LEFT JOIN departments d
    ON e.dept_id = d.dept_id;


-- Q2: LEFT JOIN - List employees without a department
-- Fetch all employee names and department names
-- Only include employees who do NOT have a department (department_name is NULL)
SELECT 
    e.name, 
    d.department_name
FROM employees e
LEFT JOIN departments d
    ON e.dept_id = d.dept_id
WHERE d.department_name IS NULL;


-- IS NULL → checks for NULL
-- IS NOT NULL → checks for non-NULL
-- = or <> or != does not work with NULL



-- Q3: LEFT JOIN with COUNT - Number of employees per department
-- Include all departments, even if they have no employees
-- Only show departments with more than 1 employee
SELECT 
    d.department_name, 
    COUNT(e.emp_id) AS employee_count
FROM employees e
LEFT JOIN departments d
    ON e.dept_id = d.dept_id
GROUP BY d.department_name
HAVING COUNT(e.emp_id) > 1;


-- Q4: LEFT JOIN with salary filter
-- Fetch all employee names, their department name, and salary
-- Include employees even if they do not have a department
-- Only include employees whose salary is greater than 50,000
SELECT 
    e.name, 
    d.department_name, 
    e.salary
FROM employees e
LEFT JOIN departments d
    ON e.dept_id = d.dept_id
WHERE e.salary > 50000;


-- Q5: LEFT JOIN with multiple conditions and sorting
-- Fetch employee name, department name, and hire date
-- Include all employees, even if they do not have a department
-- Only include IT and Finance departments
-- Only include employees hired after 1st Jan 2021
-- Sort results by hire date in ascending order

SELECT 
    e.name,
    d.department_name,
    e.hire_date
FROM employees e
LEFT JOIN departments d
    ON e.dept_id = d.dept_id
    AND d.department_name IN ('IT', 'Finance')
WHERE e.hire_date > '2021-01-01'
ORDER BY e.hire_date ASC;


-- Q6: LEFT JOIN to find departments with zero employees
-- Include all departments, even those without employees
-- Display only departments that have no employees

SELECT 
    d.department_name,
    COUNT(e.emp_id) AS employee_count
FROM departments d
LEFT JOIN employees e
    ON d.dept_id = e.dept_id
GROUP BY d.department_name
HAVING COUNT(e.emp_id) = 0;


-- Q7: LEFT JOIN - Count employees per department
-- Include all departments, even those with zero employees

SELECT 
    d.department_name,
    COUNT(e.emp_id) AS total_employees
FROM departments d
LEFT JOIN employees e
    ON d.dept_id = e.dept_id
GROUP BY d.department_name;


-- Q8: LEFT JOIN with department filter without breaking LEFT JOIN
-- Fetch all employees, include those without a department
-- Show only HR department employees

SELECT 
    e.name,
    d.department_name
FROM employees e
LEFT JOIN departments d
    ON e.dept_id = d.dept_id
    AND d.department_name = 'HR';


-- Q9: LEFT JOIN - Find employees without a department
SELECT 
    e.name
FROM employees e
LEFT JOIN departments d
    ON d.dept_id = e.dept_id
WHERE d.department_name IS NULL;



-- Q10: LEFT JOIN with mixed filters
-- Include all employees
-- Filter salary from employees table
-- Filter Finance department without breaking LEFT JOIN

SELECT 
    e.name,
    d.department_name,
    e.salary
FROM employees e
LEFT JOIN departments d
    ON e.dept_id = d.dept_id
    AND d.department_name = 'Finance'
WHERE e.salary > 40000;




-- Q11: LEFT JOIN - Sorting with NULLs
-- Fetch employee name and department name
-- Include all employees, even those without a department
-- Sort by department name ascending
-- Employees without a department (NULL) should appear last
-- Includes NULL handling in a portable, interview-safe way

SELECT 
    e.name, 
    d.department_name
FROM employees e
LEFT JOIN departments d
    ON e.dept_id = d.dept_id
ORDER BY 
    CASE 
        WHEN d.department_name IS NULL THEN 1  -- Push NULLs to the end
        ELSE 0                                -- Non-NULLs come first
    END,
    d.department_name ASC;                    -- Sort non-NULLs alphabetically



-- another answer 
SELECT e.name, d.department_name 
FROM employees e 
LEFT JOIN departments d 
    ON d.dept_id = e.dept_id
ORDER BY d.department_name IS NULL, d.department_name ASC;


-- this line can also be  used to handle null value 
ORDER BY d.department_name ASC NULLS LAST;
