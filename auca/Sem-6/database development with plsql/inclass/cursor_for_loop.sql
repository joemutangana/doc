declare
cursor employee_cursor is
select * from employees where 
department = 'Computer Science';

begin

for emp in employee_cursor loop
dbms_output.put_line(emp.first_name ||' ' || emp.last_name);
end loop;

end;
/