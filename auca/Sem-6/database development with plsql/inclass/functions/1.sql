create or replace function get_bonus(p_emp_id in number ) return number 
is
v_salary number;
v_bonus number :=0;

begin
select salary into v_salary from employees where employee_id =p_emp_id;

if v_salary >= 80000 then
v_bonus := v_bonus + v_salary * 0.01;
elsif v_salary >=60000 then
v_bonus := v_bonus + v_salary * 0.1;
else
v_bonus := v_bonus + v_salary * 0.2;

end if;

return v_bonus;

EXCEPTION
when no_data_found then
dbms_output.put_line('No data found matching the id');
when others then
dbms_output.put_line('Unexpected error');
end;

set SERVEROUTPUT on

begin
for emp in (select first_name||' '||last_name as fullname, salary, round(get_bonus(employee_id), 1) as bonus from employees) loop
dbms_output.put_line('Name: '||rpad(emp.fullname,14)||' | Salary: '||rpad(emp.salary, 8)||' | Bonus: '||rpad(emp.bonus,8));
end loop;
end;
/

