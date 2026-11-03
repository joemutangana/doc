begin
for dep in (select department_name from departments) loop
 for emp in (select first_name from employees where department = dep.department_name) loop
 dbms_output.put_line(dep.department_name ||' ' || emp.first_name);
 end loop;
end loop;
end;
/