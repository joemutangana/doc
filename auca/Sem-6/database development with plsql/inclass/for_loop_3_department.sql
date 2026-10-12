set SERVEROUTPUT on;

ACCEPT dept1 varchar2(100) prompt 'Enter department 1';
ACCEPT dept2 varchar2(100) prompt 'Enter department 2';
ACCEPT dept3 varchar2(100) prompt 'Enter department 3';

declare
v_dep1 varchar2(100) :='&dept1';
v_dep2 varchar2(100) :='&dept2';
v_dep3 varchar2(100) :='&dept3';

begin

dbms_output.put_line('Employees in ' || v_dep1);
for emp in (select * from employees where department = v_dep1) loop
dbms_output.put_line(emp.first_name || ' ' ||emp.last_name);
end loop;

dbms_output.put_line('Employees in ' || v_dep2);
for emp in (select * from employees where department = v_dep2) loop
dbms_output.put_line(emp.first_name || ' ' ||emp.last_name);
end loop;

dbms_output.put_line('Employees in ' || v_dep3);
for emp in (select * from employees where department = v_dep3) loop
dbms_output.put_line(emp.first_name || ' ' ||emp.last_name);
end loop;

end;
/