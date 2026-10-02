
SET SERVEROUTPUT ON

DECLARE
depart varchar(100) := 'Computer Science';
total_salary number :=0;
total_emp number :=0;
higher_earners number :=0;
low_earners number :=0;
highest_paid number :=0;
highest_paid_name varchar2(100);
avg_salary number;


begin
for emp in (select * from employees where department = depart) loop
total_emp :=total_emp + 1;
total_salary :=total_salary + emp.salary;
if emp.salary > highest_paid then
highest_paid := emp.salary;
highest_paid_name := emp.first_name||' '||emp.last_name;
elsif emp.salary > 75000 then
higher_earners := higher_earners + 1;
elsif emp.salary < 65000 then
low_earners := low_earners + 1;
end if;
end loop;
avg_salary := total_salary / total_emp;
dbms_output.put_line('==== '||depart||' Salary Report ====');
dbms_output.put_line('Total Employees: '||total_emp);
dbms_output.put_line('Total salary: '||total_salary);
dbms_output.put_line('Average Salary: '||avg_salary);
dbms_output.put_line('Higher Earners (>75k): '||higher_earners);
dbms_output.put_line('Low Earners (<65k): '||low_earners);
dbms_output.put_line('Highest Paid: '||highest_paid_name||' - RWF'||highest_paid);
dbms_output.put_line('========================================');
end;
/