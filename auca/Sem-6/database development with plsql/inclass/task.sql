emp_id number prompt 'Enter employee id';

declare
v_id number:=&emp_id;
v_fname varchar2(50);
v_lname varchar2(50);
v_salary number;

begin

select first_name, last_name, salary into v_fname,v_lname,v_salary
from employees
where employee_id=v_id;
dbms_output.put_line(v_fname);
dbms_output.put_line(v_lname);
dbms_output.put_line(v_salary);

EXCEPTION
when no_data_found then
dbms_output.put_line('No employee found');
end;
/