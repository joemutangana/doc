begin
for emp in (select first_name from employees) loop
dbms_output.put_line(emp.first_name);
end loop;
end;
/