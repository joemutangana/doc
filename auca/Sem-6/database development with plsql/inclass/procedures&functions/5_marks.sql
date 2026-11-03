
accept dep_name prompt 'Enter department name'

create or replace procedure display_employees is

v_dname varchar2(100) :='&dep_name';
v_fname varchar2(100);
v_lname varchar2(100);
begin
for emp in (select first_name , last_name, department from employees where department = v_dname) loop
dbms_output.put_line('First Name: '||emp.first_name);
dbms_output.put_line('Last Name: '||emp.last_name);
dbms_output.put_line('Department Name: '||emp.department);
dbms_output.put_line('');
dbms_output.put_line('===================================');
end loop;

exception
when no_data_found then
dbms_output.put_line('No data dound');
end;
/

begin
display_employees;
end;
/