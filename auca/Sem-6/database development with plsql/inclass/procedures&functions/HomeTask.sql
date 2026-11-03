/*

==== HOME TASK ==============
Write a procedure that that will
display all employee's names, salary under that entered by the user
ordered by salary desc, then provide the salary category of the emplyee based
when salary >= 80000 Category 'Directors'
when salary >= 60000 Category 'Managers'
when salary >= 40000 Category 'Senior Staff'
when salary >=0 Category 'Junior Staff'
else
Category
.

*/

create or replace procedure get_employees(P_dname in varchar2) is
v_count number :=0;
begin
for emp in 
(select first_name, last_name, salary,
case 
when salary >= 80000 then 'Directors'
when salary >= 60000 then 'Managers'
when salary >= 40000 then 'Senior Staff'
when salary >=0 then 'Junior Staff'
else 'Invalid'
end as Salary_category 
from employees 
where department = p_dname
order by salary desc)

loop
v_count :=v_count +1;
dbms_output.put_line('');
dbms_output.put_line('================ '||'Employee('||v_count||') ====================');
dbms_output.put_line('First Name: '||emp.first_name);
dbms_output.put_line('Last Name: '||emp.last_name);
dbms_output.put_line('Salary(Frw): '||emp.salary);
dbms_output.put_line('Salary Category: '||emp.salary_category);
dbms_output.put_line('Department: '||p_dname);
dbms_output.put_line('');
end loop;
if v_count =0 then
dbms_output.put_line('No department found');
end if;
end;


set SERVEROUTPUT on;
accept dname prompt 'Enter department name';
declare
v_dname varchar2(100) :='&dname';
begin
get_employees(v_dname);
end;
/





