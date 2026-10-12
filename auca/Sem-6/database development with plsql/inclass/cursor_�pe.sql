declare

cursor employees_cursor is select * from employees;
v_cursor employees_cursor%rowtype;


begin

open employees_cursor;
loop
fetch employees_cursor into v_cursor;
dbms_output.put_line(v_cursor.first_name || ' ' || v_cursor.last_name || ' ' ||v_cursor.salary);
exit when employees_cursor%notfound;
end loop;
close employees_cursor;

end;
/


