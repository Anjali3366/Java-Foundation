-- Q3: Count employees per department
SELECT department, COUNT(emp_id) AS employee_count
FROM employees
GROUP BY department;



-- Q4: Departments with more than 2 employees
SELECT department, COUNT(emp_id) AS employee_count
FROM employees
GROUP BY department
HAVING COUNT(emp_id) > 2;




