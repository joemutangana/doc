accept empid number prompt 'enter the emp id';
declare
v_empid number:=&empid;
v_first_name varchar2(50);
v_last_name varchar2(50);
v_salary number;
v_salary_category varchar2(50);

begin
select first_name,last_name,salary into v_first_name,
v_last_name,v_salary from employees where 
employee_id=v_empid;
case
when v_salary>=80000 then
v_salary_category:='Directors';
when v_salary>=60000 and v_salary<80000 then
v_salary_category:='Managers';
when v_salary>=40000 and v_salary<60000 then
v_salary_category:='Senior Staff';
when v_salary>0 and v_salary<40000 then
v_salary_category:='STAFF';
else
v_salary_category:='INVALID';
end case;

dbms_output.put_line(v_first_name);
dbms_output.put_line(v_last_name);
dbms_output.put_line(v_salary);
dbms_output.put_line(v_salary_category);

exception

when no_data_found then
dbms_output.put_line('No EMPLOYEE MATCHING ' ||v_empid || ' found' );

end;
/