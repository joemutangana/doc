DECLARE
v_emp_id number:=724567;
v_first_name varchar2(50);
v_last_name varchar2(50);
v_salary number;

begin
select first_name, last_name, salary into v_first_name, v_last_name,v_salary 
from 
employees 
where employee_id=v_emp_id;

dbms_output.put_line(v_first_name);
dbms_output.put_line(v_last_name);
dbms_output.put_line(v_salary);

EXCEPTION
when no_data_found then
dbms_output.put_line('No employee found matching the '||v_emp_id || ' id');

when others then
dbms_output.put_line('Testing');

end;
/