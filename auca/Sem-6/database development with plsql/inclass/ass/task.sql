accept empid number prompt 'Enter the employee ID';
declare
v_empid number:=&empid;
v_first_name varchar2(50);
v_last_name varchar2(50);
v_salary number;
begin
select first_name,last_name,salary into 
v_first_name,v_last_name,v_salary from 
employees where employee_id=v_empid;
dbms_output.put_line(v_first_name);
dbms_output.put_line(v_last_name);
dbms_output.put_line(v_salary);

exception
when no_data_found then
dbms_output.put_line('No data matching the ' ||v_empid|| ' found');
end;
/