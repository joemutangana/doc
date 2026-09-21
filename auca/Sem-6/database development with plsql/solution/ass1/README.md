# How I operated on assignment with sql commands what results looked like.

---

# SECTION A: Filtering, Sorting, and Expressions

### A1: Students with GPA of 3.5 or higher

---

**Query**

```sql
select first_name, last_name, email 

from students where gpa >=3.5 order by gpa desc;
```

**Testing Results:**

I executed the command, 25 rows in students

table were RETURNED and the result come order by gpa in descending order.

### A2: Courses have 4 credist and belong to Computer Science department

---

**Query**

```sql
select course_name, course_code, instructor

from courses where credits = 4 and department = 'Computer Science';
```

**Testing Results**

The query returned 5 rows from courses table whith specified column names showinh courses with credits of 4

### A3: Case logic to classfy gpa in categories such as honors, good, and probation

---

**Query**

```sql
select first_name, last_name,

case

    when gpa >= 3.7 then 'Honors'

    when gpa >= 3.0 and gpa < 3.7 then 'Good'

    else 'Probation'

end as Category

from students;
```

**Testing Results**

The query returened 50 rows from students table, the columns returned were their first name, last name, and new column called category that shows if students if in honors, good or probation

### A4: Getting students whose email is domain of emil.com

---

**Query**

```sql
select first_name, last_name,  enrollment_date

from students   

where email like '%@email.com' and enrollment_date >= date'2024-01-01'

order by enrollment_date;
```

**Testing result**

From students table 25 rows were returned , the command fikltered the email regadless what can be first letters in their email, but ends with email.com. that shows that all students have emails with email.com domain

---

# SECTION B: Aggregation and Grouping

### B1: Showing the department name and average salary of it's employees rounded to 2 decimal places, then sort them by average salary in descening order

---

**Query**

```sql
select d.department_name, round(avg(e.salary), 2) 

as Average_salary 

from departments d

join employees e on e.department = d.department_name

group by d.department_name ORDER by avg(e.salary) desc;
```

**Test results**

4 rows returned

where Department of Mathematics were having high average of 82500 and lastly the Business department were last having 57444.44 as average.

### B2: Showing course name and number students enrolled in course and show course with no enlomment then ordered in descending order

---

**Query**

```sql
select c.course_name , count(e.student_id) as Total_students

from courses c

left join enrollments e on c.course_id = e.course_id

group by c.course_name

order by count(e.student_id) desc;
```

**Test Results**

15 rows courses were returned with the number of students enrolled in it. The left join used in sql commands

ensures that the data from courses like column of coures_name show up in results even if no matching student_id in enrollments table.

### B3: Sql command to show only Courses have more than students enrolled in them.

---

**Query**

```sql
select c.course_name, count(e.student_id) as More_than_five

from courses c 

join enrollments e on e.course_id = c.course_id 

group by c.course_name

having count(e.student_id)>5;
```

**Test results**

The query return 5  rows courses from two combined tables, courses and enrollments, this query what it did, was to group courses that have their ids in enrollment table, then having comes again after each gruoup found theh calculate they counts of students who enrolled in them, and if that count is more than 5 show me those courses with their counts.

### B4: Query to select students fullname and get the average of their score from enrollment table rounded to 1 decimal, but for students who have at least score in any enrolled course not all course being null valued score

---

**Query**

```sql
select s.first_name||' '||s.last_name as Full_Name,round(avg(e.score),1) 

from enrollments e

join students s on e.student_id = s.student_id

group by e.student_id, s.first_name, s.last_name

having count(e.score)>0;
```

**Testing results**

The query displayed 50 rows of students with their fullname and average score acrros their enrolled courses rounded to 1 decimal after point.

### B5: The query to show highest gpa, lowest, and average gpa acrros all students

---

**query**

```sql
select max(gpa) as Highest_gpa, min(gpa) as Lowest_gpa, avg(gpa) as Average_gpa from students;
```

**Testing results**

The output came out as 3 coumns, one called HIGHEST_GPA with a value of 3.9, next column showed up as LOWEST_GPA, with value of 2.7, and last column as AVERAGE_GPA, with value of 3.38. The functions make the query easier to perfom and easy to understand that results in correct output and better for data analysis decisions.

---

# SECTION C: JOINS

### C1: A query to display all enrollments students and marks they got in courses they enrolled

---

**Query**

```sql
select s.first_name||' '||s.last_name as Full_Name, c.course_name, e.score

from enrollments e

inner join students s on e.student_id = s.student_id

inner join courses c on e.course_id = c.course_id;
```

**Test results**

**Tery Results**

The outout displayed as 75 rows of students with thiei full name in one column, and each course they enrolled in and the score they obtained in certain course.

### C2: A query to display the courses with the budget of their departments

---

**Query**

```sql
select c.course_name, d.budget

from courses c

left join departments d on d.department_name = c.department;
```

**Test results**

The output came out as 30 rows of courses and their departments budgets

### C3: a query to show employees with their manager

---

**Query**

```sql
select e.first_name as Employee_name, nvl(mngr.first_name, 'No manager') as manager_name from 

employees e

left join employees mngr on e.manager_id = mngr.employee_id;
```

**Test results**

80 rows were returned from self join on employees that displayed employees and thir manager

### C4: A query to display all students with no enrollment at all

---

**Query**

```sql
select s.first_name||' '||s.last_name as Full_Name

from students s

left join enrollments e on s.student_id = e.student_id

where e.student_id is null;
```

**Test Results**

No rows returned means all students were enrolled

### C5: A query to display departments with number employess in it.

---

**Query**

```sql
select d.department_name, mngr.first_name||' '||mngr.last_name as Manager_name, count(e.employee_id) as Total_employees

from departments d

join employees mngr on d.manager_id = mngr.employee_id

left join employees e on d.department_name = e.department_name

group by d.department_name, mngr.first_name, mngr.last_name;
```

**Test Results**

The 5 rows were returned, computer scince has 60 number of employees, while Mathematics has 16 employees

---

# SECTION D: SUBQUERIES

### D1: A query to show students enrolled in PL/SQL Programming course

---

**Query**

```sql
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
```

**Test Results**

The query executed and 10 rows were returned showing full name of the students in course of pl/sql programming, by using it's id in enrollment table.

### D2: A query to display the courses whose average score is above average score of an entire enrollments

---

**Query**

```sql
select c.course_id, c.course_name

from courses c

where (select avg(e.score)

from enrollments e where e.course_id = c.course_id) 

>

(select avg(e.score) from enrollments e);
```

**Test results**

The returned 7 rows of courses with their course_id and course_name

### D3: A query to show employees whose slary is equals to the maximum salary in their own department

---

**Query**

```sql
select e.first_name, e.last_name

from employees e

where e.salary =( select max(e1.salary) from employees e1

where e.department = e1.department);
```

**Test Results**

12 rows were returned with first name and last name of those employees

### D4: Select course where it doesn't have any enrollment

---

**Query**

```sql
select c.course_name

from courses c

where course_id not in 

(select e.course_id from enrollments e);
```

**Test Results**

No row returned as output of the query

---

# SECTION E: DATA DEFINITION & MANIPULATION

### E1: adding advisor_id in students table

---

```sql
alter table students add advisor_id number references employees(employee_id);

COMMIT;
```

### E2: A query ncrease salary by 5% to employees whose department is Engineering

---

**Query**

```sql
update employees

set salary = salary + (salary*0.05)

where department = 'Engineering';

COMMIT;
```

**Test Results**

12 rowse were affected by the changes

for example and employees called Julia

was having 48000 as her salary and now she is having 50400 as new salary.

### E3: A query to delete enroments whose status are Active, grade C, and score below 73.

---

**A query first to check data to be affected**

```sql
select * from enrollments

where status = 'Active' and score < 73 and grade = 'C';
```

**Results**

The query returned 5 rows

**A query to delete**

```sql
delete from enrollments

where status = 'Active' and score < 73 and grade = 'C';
```

**Test Results**

The replied that 5 rows affected and when i checked again with query above to check if the still exist, the data was not there

### E4: A query to create a view called honor_roll with full name, gpa and enrollment date of the students with gpa above or equal 3.7

---

**Query**

```sql
create VIEW honor_roll(Fullname, gpa, enrollment_date) AS

select first_name||' '||last_name, GPA, enrollment_date

from students

where gpa >=3.7

order by gpa desc;

commit;

--A query to select students from a view

select * from honor_roll;
```

**Test Results**

A view was created successfull then i select data from the view, 17 rows were returned with lsit of students oderder by gpa descending order

---

# SECTION F: RANK()

### A query to rank students based on their gpa who enrolled in same date cohort

---

**Query**

```sql
select first_name||' '||last_name as student_name, gpa,

enrollment_date, rank() over(PARTITION by enrollment_date order by gpa desc) as rank

from students;
```

**Test Results**

The query returned students data with new column called rank.

the way data were organize, same date was same group, and each group it has rank from 1 to last student in that same cohort ordered by gpa descending.
