
--===============================
--SECTION A: Filtering, Sorting, and Expressions
--================================

--A1. A query to return, first_name, last_name, and email of students whose GPA is 3.5 or higher ordered in descending order based gpa--


select first_name, last_name, email 
from students where gpa >=3.5 order by gpa desc;



--A2. A query to return course_name, course_code, and instructor_name of courses that have 4 credits and belong to the Computer Science department--

select course_name, course_code, instructor 
from courses where credits = 4 and department = 'Computer Science';


--A3. Case logic to produce report of students names and with new column caled honors for gpa >=3.7 gives "Honors" for gpa between 3.0 and 3.69 gives Good and probation for gpa below 3.0--


select first_name, last_name,
case
    when gpa >= 3.7 then 'Honors'
    when gpa >= 3.0 and gpa < 3.7 then 'Good'
    else 'Probation'
end as Category
from students;


--A4. A query to return students email whose domain falls under email.com and enrollment date is equal or after jan-2024 showing their name and enrollment date ordered by enrollment date.

select first_name, last_name,  enrollment_date
from students   
where email like '%@email.com' and enrollment_date >= date'2024-01-01'
order by enrollment_date;


--==============================================
--SECTION B: Aggregation and Grouping
--==============================================

--B1. A query to select department name and average salary of it's employees, grouped by department name and ordered by average salary in descending order--

select d.department_name, round(avg(e.salary), 2) 
as Average_salary 
from departments d
join employees e on e.department = d.department_name
group by d.department_name ORDER by avg(e.salary) desc;


--B2. A query to show course names with number of students enrolled in it, grouoed by their course_id in enrollments table and ordered by number of students enrolled in descending order--

select c.course_name , count(e.student_id) as Total_students
from courses c
left join enrollments e on c.course_id = e.course_id
group by c.course_name
order by count(e.student_id) desc;

--B3. A query to select and display courses with more than 5 enrollments

select c.course_name, count(e.student_id) as More_than_five
from courses c 
join enrollments e on e.course_id = c.course_id 
group by c.course_name
having count(e.student_id)>5;


--B4. A query to show astundents full name with the average of score rounded to 1 decimal across their enrolled courses, and having at leat non-null score

select s.first_name||' '||s.last_name as Full_Name,round(avg(e.score),1) 
from enrollments e
join students s on e.student_id = s.student_id
group by e.student_id, s.first_name, s.last_name
having count(e.score)>0;

--B5. A query to find highest gpa, lowest gpa, and average gpa  of students in the students table

select max(gpa) as Highest_gpa, min(gpa) as Lowest_gpa, avg(gpa) as Average_gpa from students;



--==============================================
--SECTION C:  Joins       
--==============================================

--C1:  Display all enrollments students and marks they got in courses they enrolled


select s.first_name||' '||s.last_name as Full_Name, c.course_name, e.score
from enrollments e
inner join students s on e.student_id = s.student_id
inner join courses c on e.course_id = c.course_id;


--C2: Report courses with their department's budget


select c.course_name, d.budget
from courses c
left join departments d on d.department_name = c.department;

--C3: Display empoloyees with manager's name

select e.first_name as Employee_name, nvl(mngr.first_name, 'No manager') as manager_name from 
employees e
left join employees mngr on e.manager_id = mngr.employee_id;


--C4: Display students with no enrollment at all

select s.first_name||' '||s.last_name as Full_Name
from students s
left join enrollments e on s.student_id = e.student_id
where e.student_id is null;


--C5: Show the departments, manager's name of it and the number of employees in it.

select d.department_name, mngr.first_name||' '||mngr.last_name as Manager_name, count(e.employee_id) as Total_employees
from departments d
join employees mngr on d.manager_id = mngr.employee_id
left join employees e on d.department_name = e.department_name
group by d.department_name, mngr.first_name, mngr.last_name;


--=============================================================
--SECTION D: SUBQUERIES
--=============================================================

--D1: Show students who are enrolled in PL/SQL programing course

SELECT first_name || ' ' || last_name AS Full_name
FROM students
WHERE student_id IN (
SELECT student_id
FROM enrollments
WHERE course_id = (
SELECT course_id
FROM courses
WHERE course_code = 'CS202'
)
);

--D2: Courses that have avg score greater than average of overall score in enrollments

select c.course_id, c.course_name
from courses c
where (select avg(e.score)
from enrollments e where e.course_id = c.course_id) 
> 
(select avg(e.score) from enrollments e);


--D3: A query to show employees whose slary is equals to the maximum salary in their own department

select e.first_name, e.last_name
from employees e
where e.salary =( select max(e1.salary) from employees e1
where e.department = e1.department);

--D4: A query to select course where it doesn't have any enrollment

select c.course_name
from courses c
where course_id not in 
(select e.course_id from enrollments e);



--=============================================================
--SECTION E: DATA DEFINITION & MANIPULATION
--=============================================================

--E1: 

alter table students add advisor_id number references employees(employee_id);
COMMIT;


--E2: E2: A query ncrease salary by 5% to employees whose department is Engineering
update employees
set salary = salary + (salary*0.05)
where department = 'Engineering';
commit;


--E3: E3: A query to delete enroments whose status are Active, grade C, and score below 73.


--A query first to check data to be affected**
select * from enrollments
where status = 'Active' and score < 73 and grade = 'C';


--A query too delete
delete from enrollments
where status = 'Active' and score < 73 and grade = 'C';


--E4: A query to create a view called honor_roll with full name, gpa and enrollment date of the students with gpa above or equal 3.7
create VIEW honor_roll(Fullname, gpa, enrollment_date) AS

select first_name||' '||last_name, GPA, enrollment_date
from students
where gpa >=3.7
order by gpa desc;
commit;

--A query to select students from a view
select * from honor_roll;

--=============================================================
--SECTION E: RANK()
--=============================================================

select first_name||' '||last_name as student_name, gpa,
enrollment_date, rank() over(PARTITION by enrollment_date order by gpa desc) as rank
from students;




