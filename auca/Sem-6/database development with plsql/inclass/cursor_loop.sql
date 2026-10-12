set SERVEROUTPUT on;

ACCEPT dept1 varchar2(100) prompt 'Enter department 1';
ACCEPT dept2 varchar2(100) prompt 'Enter department 2';
ACCEPT dept3 varchar2(100) prompt 'Enter department 3';

declare
v_dep1 varchar2(100) :='&dept1';
v_dep2 varchar2(100) :='&dept2';
v_dep3 varchar2(100) :='&dept3';
v_name varchar2(100);

cursor dep1 is select first_name||' '||last_name from employees where department=v_dep1;
cursor dep2 is select first_name||' '||last_name from employees where department=v_dep2;
cursor dep3 is select first_name||' '||last_name from employees where department=v_dep3;
begin

dbms_output.put_line('Employees in ' || v_dep1);
open dep1;
loop
fetch dep1 into v_name;
EXIT WHEN dep1%NOTFOUND;
dbms_output.put_line(v_name);
end loop;

close dep1;
dbms_output.put_line('Employees in ' || v_dep2);
open dep2;
loop
fetch dep2 into v_name;
EXIT WHEN dep2%NOTFOUND;
dbms_output.put_line(v_name);
end loop;
close dep2;

dbms_output.put_line('Employees in ' || v_dep3);
open dep3;
loop
fetch dep3 into v_name;
EXIT WHEN dep3%NOTFOUND;
dbms_output.put_line(v_name);
end loop;
close dep3;
end;
/