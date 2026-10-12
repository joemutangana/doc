set SERVEROUTPUT on

declare
cursor employee_cursor(dep_name varchar) is 
select * from employees where department=dep_name;

v_cursor employee_cursor%rowtype;

begin
dbms_output.put_line('Employees in Computer Science');
dbms_output.put_line('-----------------------------------------');

open employee_cursor('Computer Science');
loop
fetch employee_cursor into v_cursor;
dbms_output.put_line(v_cursor.first_name||' '||v_cursor.last_name);
exit when employee_cursor%notfound;
end loop;
close employee_cursor;
end;
/