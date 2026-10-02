-- ===========================================
-- TASK A: SQL Recap
-- Student: MUTANGANA Joseph | ID: 29061
-- ===========================================

/*Firstly, in this task, I have used different sql commands and functions combined together to acomplish the task.
For example, to get summaation salary I used sum() with nvl() to replace null values by 0, I also used count to show me the number of items.
Secondary, I also used Group by clause to make grouped result.
Morever, I used the having clause to filter the groups.
Then, correlated subqueries used to exapand logic so results comes accurately.

*/

--A1 a:
SET SERVEROUTPUT ON
select d.department_name, d.location, nvl(count(e.employee_id),0) as number_of_employees,
nvl(sum(e.salary),0) as total_salary_bill,
round(nvl(avg(e.salary),0), 2) as average_salary, (select nvl(count(c.course_id),0)  from courses c where c.department = d.department_name) as total_courses
from departments d
left join
employees e on e.department = d.department_name
group by d.department_name, d.location
order by nvl(sum(e.salary),0) desc ;


--A1 b:
SET SERVEROUTPUT ON
select d.department_name, d.budget, (select sum(e.salary) from employees e where e.department = d.department_name) as total_salary_bill,
(select sum(e.salary) from employees e where e.department = d.department_name)- d.budget as Amount_over_budget
from departments d
group by d.department_name, d.budget
having (select sum(e.salary) from employees e where e.department = d.department_name) > d.budget ;



-- ===========================================
-- TASK B: Variables, %TYPE, %ROWTYPE and DBMS_OUTPU
-- Student: MUTANGANA Joseph | ID: 29061
-- ===========================================

/*I declared variables under `DECLARE` section, those variables included v_c_name, for course name wit data type 
of VARCHAR2(100) and i used `BOOLEAN` variable to retrun `TRUE` or `FALSE`. For displaying output, 
the DBMBS_OUTPUT.PUT_LINE() helped to displaye output.
For Boolean Values, I used an `IF ELSE` constion to decide whether it saty true of false.
Here I declare variables which will follow the data type of the columns in the tables i was dealing with by using `%TYPE` under declare function.
Then in `BEGIN` and `END` section I seleted required feild into the specified variables.
And again DBMBS_OUTPUT.PUT_LINE() helped to displaye output.
Here I used the `%ROWTYPE` to declare a variable which will correspond too entire row from the table v_employee employees%ROWTYPE;.

Then later to get specific value I use that variable.value i want example employee.first_name.

I also used EXTRACT () function to get only year from hired date, and TRUNC () function to remove decimal numbers after the 
point when I was calculating the years of employee with 22 id worked.
*/

--B1
set SERVEROUTPUT on

declare 
v_c_name varchar2(100) :='PL/SQL Programming';
v_cr number(1) :=3;
v_date date :=date'2024-09-01';
is_heavy boolean :=TRUE;
v_check varchar2(5);

begin
dbms_output.put_line('Course: '||v_c_name);
dbms_output.put_line('Credits: '||v_cr);
dbms_output.put_line('Semester Start: '||v_date);

if v_cr >=3 then
is_heavy := TRUE;
v_check :='TRUE';
else
is_heavy := FALSE;
v_check :='FALSE';
end if;
dbms_output.put_line('Heavy Course: ' || v_check);

end;
/


--B2
set SERVEROUTPUT on

declare 
v_course_id number :=110;
v_course_name courses.course_name%TYPE;
v_cr courses.credits%TYPE;
v_instructor courses.instructor%TYPE;
v_max courses.max_students%TYPE;

begin
select course_name,credits, instructor, max_students into
 v_course_name,v_cr, v_instructor, v_max
from courses where course_id = v_course_id;

dbms_output.put_line('Course Name: '||v_course_name);
dbms_output.put_line('Credits: '||v_cr);
dbms_output.put_line('Instructor: '||v_instructor);
dbms_output.put_line('Max_students: '||v_max);
if v_max <=25 then
dbms_output.put_line('Limited seats available!');
end if;
end;
/

-- B3
set SERVEROUTPUT on

declare 
v_employee employees%ROWTYPE;
v_hire_year     NUMBER;
v_years_worked  NUMBER;

begin
select *  into v_employee from employees where employee_id = 22;
v_hire_year := extract(year from v_employee.hire_date);
v_years_worked := trunc(months_between(sysdate, v_employee.hire_date) / 12);
dbms_output.put_line('Full Name: '||v_employee.first_name || ' ' || v_employee.last_name);
dbms_output.put_line('Department: '||v_employee.department);
dbms_output.put_line('Salary: '||v_employee.salary);
dbms_output.put_line('Hire Year: '||v_hire_year);
dbms_output.put_line('Years Worked: '||v_years_worked);
end;
/



-- ===========================================
-- TASK C: IF / ELSIF / ELSE Conditions
-- Student: MUTANGANA Joseph | ID: 29061
-- ===========================================

/*

In this task, the code I used were more about making decisions by using IF/ELSIF and ELSE.
But, To make a better decisions, I use included some variables which helped me to decide
because that had values decision depends on.

I also used dmbs_output.put_line() function to orint the output mostly the desion from code I wrote.
Lastly, the exeption to handle no data found error or others when unexpected error happens.
*/
--C1 :


declare

v_employee_id number :=1;
v_commission_pct number;
v_salary number;
v_potential_earning number;

begin
select commission_pct, salary into v_commission_pct, v_salary
from employees where employee_id = v_employee_id;

if v_commission_pct is not NULL and v_salary >80000 then
dbms_output.put_line('High-value manager with commission');
elsif v_commission_pct is not NULL and v_salary <=80000 then
dbms_output.put_line('Manager with commission, standard
tier');
elsif v_commission_pct is NULL and v_salary >90000 then
dbms_output.put_line('Senior employee, consider adding a
commission incentive');
else
dbms_output.put_line('Standard employee profile');
end if;
v_potential_earning :=  v_salary + (v_salary * NVL(v_commission_pct, 0));
dbms_output.put_line('Total potential earnings: '|| v_potential_earning);

EXCEPTION
when no_data_found then
dbms_output.put_line('No data found matching the '|| v_employee_id);

when others then
dbms_output.put_line('Unexpected error');

end;
/


--C2 :


declare

v_course_id number :=103;
v_c_name varchar2(50);
v_enrolled number;
v_max_students number;
v_availability_status varchar(100);


begin
select count(*) into v_enrolled from enrollments
where course_id = v_course_id;

select course_name, max_students into v_c_name, v_max_students from courses
where course_id = v_course_id;

dbms_output.put_line('Course Name: '|| v_c_name);
dbms_output.put_line('Maximum Capacity: '|| v_max_students);
dbms_output.put_line('Current Enrollment: '|| v_enrolled);
if v_enrolled < (v_max_students * 0.5) then
v_availability_status :='Open, plenty of seats available';

elsif v_enrolled BETWEEN (v_max_students * 0.5) and (v_max_students * 0.8)then
v_availability_status :='Filling up, limited seats';

elsif v_enrolled > (v_max_students * 0.8) and v_enrolled < v_max_students  then

v_availability_status :='Almost full, enroll soon';

elsif v_enrolled >= v_max_students then
v_availability_status :='FULL, enrollment closed';
end if;
dbms_output.put_line('Availability Status: '||v_availability_status);

EXCEPTION
when no_data_found then
dbms_output.put_line('No data found matching the '|| v_course_id);

when others then
dbms_output.put_line('Unexpected error');

end;
/

--C3 :


declare

v_student_id number :=1020;
v_dob date;
v_years number;
v_age number;
v_enrollment_date date;
v_enrollment_year number;


begin
select date_of_birth, enrollment_date into v_dob, v_enrollment_date
from students
where student_id = v_student_id;

v_years := trunc(months_between(sysdate, v_dob) / 12);
v_enrollment_year := extract(year from v_enrollment_date);

if v_years <18 then
dbms_output.put_line('Minor student, parental consent required');
elsif v_years >=18 and v_years <=25 then
dbms_output.put_line('Traditional student age');
elsif v_years > 25  then
dbms_output.put_line('Mature student, eligible for the evening program');
end if;

if v_enrollment_year = 2023 then
dbms_output.put_line('First-year cohort (2023)');
else
dbms_output.put_line('Joined in ['||v_enrollment_year||']');
end if;
EXCEPTION
when no_data_found then
dbms_output.put_line('No data found matching the '|| v_student_id);

when others then
dbms_output.put_line('Unexpected error');

end;
/


-- ===========================================
-- TASK D: CASE Statements and Expressions 
-- Student: MUTANGANA Joseph | ID: 29061
-- ===========================================

/*

In this task, it was more about making decisions, but using case condition rather than IF, ELSIF and ELSE
The code I wrote, I mostly declared variables which facilitated me while working with case condition
For example: having v_score in task D1 some variables like v_grade, v_score, v_stored_grade,

Helped me to compute the garde of score, and after computing the grade, the v_stored_grade helped me to compare what it
to what i ccmputed mathes the stored grade



*/

--D1 :


SET SERVEROUTPUT ON

declare

v_enrollment_id number :=5;
v_grade varchar2(25);
v_stored_grade varchar2(25);
v_score number;

begin
select score, grade into v_score, v_stored_grade from enrollments 
where enrollment_id = v_enrollment_id;



case
    when v_score is null then
        v_grade := 'Not yet graded';
    when v_score >= 90 then
        v_grade := 'A';
    when v_score >= 80 then
        v_grade := 'B';
    when v_score >= 70 then
        v_grade := 'C';
    when v_score >= 60 then
        v_grade := 'D';
    else
        v_grade := 'F';
end case;


if v_grade = v_stored_grade then
dbms_output.put_line('Grade match: YES');
else
dbms_output.put_line(
    'Grade match: NO (stored ' || v_stored_grade ||
    ', computed ' || v_grade || ')'
);
end if;

EXCEPTION

when no_data_found then
dbms_output.put_line('No data found matching the '|| v_enrollment_id);
when others then
dbms_output.put_line('Unexpected error');

end;
/



--D2 :


SET SERVEROUTPUT ON

declare

v_department varchar2(100) := 'Computer Science';
v_dep_id number :=10;
v_building_code varchar2(50);
v_budget number;
v_budget_status varchar2(50);



begin
select department_name, budget into v_department, v_budget from departments
where department_id = v_dep_id;



case
    when v_department = 'Computer Science' then
        v_building_code := 'BLD-CS | ICT Wing';
        
     when v_department = 'Mathematics' then
        v_building_code := 'BLD-MT | Science Wing';
    when v_department = 'Business' then
        v_building_code := 'BLD-BS | Commerce Wing';
    when v_department = 'Engineering' then
        v_building_code := 'BLD-EN | Technical Wing';
    when v_department = 'Psychology' then
        v_building_code := 'BLD-PS | Humanities Wing';
    else
    v_building_code := 'BLD-GN | General Wing';
end case;

v_budget_status := CASE
    WHEN v_budget > 600000 THEN 'Well Funded'
    WHEN v_budget >= 400000 THEN 'Adequately Funded'
    ELSE 'Underfunded'
END;
dbms_output.put_line('Building Code: '||v_building_code);
dbms_output.put_line('Budget Status: '||v_budget_status);



EXCEPTION

when no_data_found then
dbms_output.put_line('No data found matching the '|| v_department);
when others then
dbms_output.put_line('Unexpected error');

end;
/



--D3 :


SET SERVEROUTPUT ON

declare


v_emp_id number :=14;
v_name varchar2(50);
V_salary number;
v_job_title varchar2(50);
v_rank number;
v_rank_title varchar2(50);




begin
select first_name||' '|| last_name, salary, job_title into v_name, v_salary, v_job_title from employees
where employee_id = v_emp_id;


case
    when v_job_title = 'Full Professor' then
        v_rank :=1;
        v_rank_title := 'Senior Academic';
        
     when v_job_title = 'Associate Professor' then
        v_rank :=2;
        v_rank_title := 'Mid Academic';
    when v_job_title = 'Assistant Professor' then
        v_rank :=3;
        v_rank_title := 'Junior Academic';
    when v_job_title like '%Developer%' or v_job_title like '%Engineer%' then
        v_rank :=4;
        v_rank_title := 'Technical Staff';
    when v_job_title like '%Admin%' or v_job_title like '%Coordinator%' then
        v_rank :=5;
        v_rank_title := 'Administrative Staff';
    else
    v_rank :=6;
        v_rank_title := 'General Staff';
end case;

dbms_output.put_line('Name: '|| v_name);
dbms_output.put_line('Job Title: '|| v_job_title);
dbms_output.put_line('Rank Number: '|| v_rank);
dbms_output.put_line('Rank Title: '|| v_rank_title);
dbms_output.put_line('Salary: '|| v_salary);

if v_rank <= 2 and v_salary < 100000 then
dbms_output.put_line('Promotion eligible');
else
dbms_output.put_line('Not eligible for promotion yet');
end if;




EXCEPTION

when no_data_found then
dbms_output.put_line('No data found matching the '|| v_emp_id);
when others then
dbms_output.put_line('Unexpected error');

end;
/


-- ===========================================
-- TASK E: Loops
-- Student: MUTANGANA Joseph | ID: 29061
-- ===========================================

/*


I used a loop to iterate through a range of course IDs, retrieving course information and calculating total credits and tuition fees. I also used a loop to iterate through a list of employees in a specific department, calculating total salary, average salary, and identifying the highest-paid employee. Additionally, I used a loop to iterate through a range of student IDs, retrieving student information and calculating GPA and enrollment load.

I also used an if statement within the loops to check for specific conditions, such as whether the total credits have specified number. Based on these conditions, I performed different actions, such as updating totals or displaying specific messages.

I used the `DBMS_OUTPUT.PUT_LINE` procedure to display the results of the calculations and actions performed within the loops. The loops allowed me to 
process multiple records and perform calculations based on the retrieved data.

A cursor was used to fetch employee data from the employees table, allowing me to iterate through the result set and perform calculations on each employee's salary. The loop continued until all employees in the specified department were processed.

%Type was used to declare variables that correspond to the data types of specific columns in the tables, ensuring that the variables can hold the appropriate values retrieved from the database.

%Found was used to check if the cursor has fetched any rows, allowing me to control the flow of the loop and exit when all employees have been processed.

rpad() function was used to format the output by padding strings to a specified length on the right side, ensuring that the output is aligned and readable.



*/

--E1 :
SET SERVEROUTPUT ON
DECLARE 

v_tuition number :=150000;
v_c_name VARCHAR2(100);
v_c_cr NUMBER;
v_c_id number :=101;
v_total_cr number :=0;
v_frw number;
v_total_frw number :=0;
v_avg_cost number;

begin

loop

select course_name, credits into v_c_name, v_c_cr 
from courses where course_id = v_c_id;
v_c_id := v_c_id +1;
v_total_cr := v_total_cr + v_c_cr;
v_frw := v_c_cr * v_tuition;
v_total_frw :=v_total_frw + v_frw;


dbms_output.put_line(rpad('Added: '||v_c_name,20)||' ('||v_c_cr||') |' || rpad(' Total: '||v_total_cr,10)||' credits | RWF '||v_frw );
exit when v_total_cr >= 15;

end loop;
v_avg_cost := v_total_frw / v_total_cr;
dbms_output.put_line('Total Cost: '||v_total_frw);
dbms_output.put_line('Average cost per credit: '||v_avg_cost);
end;
/



--E2 :


SET SERVEROUTPUT ON

DECLARE
depart varchar(100) := 'Computer Science';
total_salary number :=0;
total_emp number :=0;
higher_earners number :=0;
low_earners number :=0;
highest_paid number :=0;
highest_paid_name varchar2(100);
v_name employees.first_name%TYPE;
v_last_name employees.last_name%TYPE;
v_salary employees.salary%TYPE;
avg_salary number;
cursor emp_list is 
select first_name, last_name,salary 
from employees where department=depart;


begin


open emp_list;
fetch emp_list into v_name,v_last_name, v_salary;
while emp_list%found loop
total_emp :=total_emp + 1;
total_salary :=total_salary + v_salary;
if v_salary > highest_paid then
highest_paid := v_salary;
highest_paid_name := v_name||' '||v_last_name;
end if;
if v_salary > 75000 then
higher_earners := higher_earners + 1;
elsif v_salary < 65000 then
low_earners := low_earners + 1;
end if;
fetch emp_list into v_name,v_last_name, v_salary;
end loop;
close emp_list;
avg_salary := total_salary / total_emp;
dbms_output.put_line('==== '||depart||' Salary Report ====');
dbms_output.put_line('Total Employees: '||total_emp);
dbms_output.put_line('Total Salary Bill: RWF '||total_salary);
dbms_output.put_line('Average Salary: RWF '||avg_salary);
dbms_output.put_line('Higher Earners (>75k): '||higher_earners);
dbms_output.put_line('Low Earners (<65k): '||low_earners);
dbms_output.put_line('Highest Paid: '||highest_paid_name||' - RWF '||highest_paid);
dbms_output.put_line('========================================');
end;
/


-- E3 :

set serveroutput on

declare

v_id number;
v_name varchar2(100);
v_gpa number;
v_label varchar2(100);
v_load varchar2(100);
v_count number;

v_students_printed number := 0;
v_summa number := 0;
v_magna number := 0;
v_cum number := 0;
v_satisfactory number := 0;
v_probation number := 0;

begin

for v_id in 1001..1010 loop

select first_name||' '||last_name,gpa into v_name,v_gpa
from students where student_id = v_id;

select count(student_id) as total into v_count
from enrollments where student_id = v_id;

v_students_printed := v_students_printed + 1;

case

when v_gpa >= 3.9 then
    v_label := 'Summa Cum Laude';
    v_summa := v_summa + 1;

when v_gpa >= 3.7 then
    v_label := 'Magna Cum Laude';
    v_magna := v_magna + 1;

when v_gpa >= 3.5 then
    v_label := 'Cum Laude';
    v_cum := v_cum + 1;

when v_gpa >= 3.0 then
    v_label := 'Satisfactory';
    v_satisfactory := v_satisfactory + 1;

else
    v_label := 'Probation';
    v_probation := v_probation + 1;

end case;

case

when v_count >= 4 then
    v_load := 'Full Load';

when v_count >= 2 then
    v_load := 'Normal Load';

else
    v_load := 'Under-enrolled';

end case;

dbms_output.put_line(
    rpad('ID: ' || v_id, 10) || '| ' ||
    rpad(v_name, 20) || '| ' ||
    rpad('GPA: ' || v_gpa, 10) || '| ' ||
    rpad(v_label, 20) || '| ' ||
    rpad(v_load, 16)
);

end loop;

dbms_output.put_line('Number of students printed: ' || v_students_printed);
dbms_output.put_line('Summa Cum Laude: ' || v_summa);
dbms_output.put_line('Magna Cum Laude: ' || v_magna);
dbms_output.put_line('Cum Laude: ' || v_cum);
dbms_output.put_line('Satisfactory: ' || v_satisfactory);
dbms_output.put_line('Probation: ' || v_probation);

end;
/

-- ===========================================
-- TASK F: Combined Challenge
-- Student: MUTANGANA Joseph | ID: 29061
-- ===========================================

/*

In this task, I combined multiple concepts learned in previous tasks such as loops and conditional statements to create a comprehensive employee profile report. I declared variables to hold employee information, calculated years of service, determined service class and pay grade based on salary, and counted colleagues in the same department. I also identified the highest salary among colleagues and counted how many earn more than the selected employee.

I used function to_char() to format the output for better readability.


Approach i used was to first declare variables and select the employee's data into a record variable, then calculate years of service and determine service class using a CASE statement. I also used another CASE statement to determine pay grade based on salary ranges.
*/

--F1 :

set serveroutput on

declare

emp employees%rowtype;
emp_id number :=5;
hired_year number;
years_of_service number;
service_class varchar(50);
pay_grade number(1);
depart varchar2(100);
count_colleagues number :=0;
highest_salary number;
count_more_earners number :=0;
proposed_salary number;
raise_status varchar2(50);




begin
select * into emp from employees where employee_id = emp_id;

years_of_service :=(months_between(sysdate, emp.hire_date) / 12);

case 
when years_of_service >5 then
service_class :='Senior Staff';
when years_of_service >=2 then
service_class :='Confirmed';
else
service_class :='Probationary';
end case;

-- Pay grades: 1 = 100k+, 2 = 90k-99,999, 3 = 80k-89,999,
--             4 = 70k-79,999, 5 = below 70k

case 
when emp.salary >= 100000 then
pay_grade :=1;
when emp.salary >= 90000 then
pay_grade :=2;
when emp.salary >= 80000 then
pay_grade :=3;
when emp.salary >= 70000 then
pay_grade :=4;
else
pay_grade :=5;
end case;

highest_salary :=emp.salary;
for new_emp in (select * from employees where department = emp.department and employee_id != emp.employee_id) loop

count_colleagues :=count_colleagues +1;
if new_emp.salary > highest_salary then
highest_salary := new_emp.salary;
end if;

if new_emp.salary > emp.salary then
count_more_earners := count_more_earners + 1;
end if;

end loop;
dbms_output.put_line('========================================');
dbms_output.put_line('   EMPLOYEE PROFILE REPORT
   AUCA Staff Records System');
dbms_output.put_line('========================================');
dbms_output.put_line('Employee: '||emp.first_name||' '||emp.last_name||' (ID: '||emp.employee_id||')');
dbms_output.put_line('Department: '||emp.department);
dbms_output.put_line('Job Title: '||emp.job_title);
dbms_output.put_line('Hire Date: '||emp.hire_date||' | Years of Service: '||to_char(years_of_service, 'fm0.0'));
dbms_output.put_line('Service Status: '||service_class);
dbms_output.put_line('----------------------------------------');
dbms_output.put_line('Salary: RWF '||TO_CHAR(emp.salary, '999,999')||' | Pay Grade: '||pay_grade);
if years_of_service > 3 and emp.salary <85000 then
proposed_salary := emp.salary * 1.10;
raise_status:='Raise recommended';
dbms_output.put_line('Raise Status: '||raise_status);
dbms_output.put_line('Proposed Salary: RWF '||TO_CHAR(proposed_salary, '999,999'));
else
raise_status:='No raise due';
dbms_output.put_line('Raise Status: '||raise_status);
end if;
dbms_output.put_line('----------------------------------------');
dbms_output.put_line('Dept. Colleagues: '||count_colleagues);
dbms_output.put_line('Dept Highest Salary: RWF '||TO_CHAR(highest_salary, '999,999'));
dbms_output.put_line('Colleagues Earning More: '||count_more_earners);
dbms_output.put_line('========================================');



end;
/

-- ===========================================
-- TASK G: SQL
-- Student: MUTANGANA Joseph | ID: 29061
-- ===========================================

/*

This task I used with clause to store specific data for temporary use, so i can display the result from those temporary data. So because each of the temporary data produces one row value, I used cross join to combine those two temporary data and display the result in one row.

Approach I used was to first create a temporary table called stats to store the total number of employees, total salary, average salary, number of higher earners, number of lower earners, and the highest paid salary in the Computer Science department. Then I created another temporary table called top_employee to store the name and salary of the highest paid employee in the same department. Finally, I selected all the data from both temporary tables and displayed them in one row using a cross join.

Challenges I faced, At first I used normal select statement, for total number of employees, total salary, average salary, number of higher earners, number of lower earners, and the highest paid salary in the Computer Science department and those only worked. But when I added another subquery to get names of highest paid employee, The query stopped working throwing error that i can't use aggregate function with non aggregate function. I did not know how to use with for temporary data, so I searched and found that I can use with clause to store temporary data and because both temporary data produces one row value, I can use cross join to combine those two temporary data and display the result in one row.

I learned that with clause is very useful when you want to store temporary data for use in a query, and cross join can be used to combine two temporary tables that produce one row value each. I also learned that aggregate functions cannot be used with non-aggregate functions in the same select statement, and that using with clause can help to avoid this issue.


So Between this Aprroach of SQL and the approach of PL/SQL, I would use PL/SQL approach, because it is more flexible for me, Because with PL/SQL I can declare separate variables and later i do query to select data i want into variables, and later I make deision based on thise variables.

*/

--G1 :

WITH stats AS (
    SELECT
        COUNT(*) AS total_employees,
        SUM(salary) AS total_salary,
        AVG(salary) AS average_salary,
        SUM(CASE WHEN salary > 75000 THEN 1 ELSE 0 END) AS higher_earners,
        SUM(CASE WHEN salary < 65000 THEN 1 ELSE 0 END) AS lower_earners,
        MAX(salary) AS highest_paid
    FROM employees
    WHERE department = 'Computer Science'
),
top_employee AS (
    SELECT
        first_name || ' ' || last_name AS highest_paid_name,
        salary
    FROM employees
    WHERE department = 'Computer Science'
    ORDER BY salary DESC
    FETCH FIRST 1 ROW ONLY
)
SELECT
    stats.total_employees,
    stats.total_salary,
    stats.average_salary,
    stats.higher_earners,
    stats.lower_earners,
    stats.highest_paid,
    top_employee.highest_paid_name
FROM stats
CROSS JOIN top_employee;
