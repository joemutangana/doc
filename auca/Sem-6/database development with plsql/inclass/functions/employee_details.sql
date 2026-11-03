create or replace function func_employee_details(
p_empid in number, p_firstname out varchar2,
p_lastname out varchar2, p_salary out number, p_category out varchar2) return varchar2 is


begin
select first_name,last_name,salary into p_firstname,
p_lastname,p_salary from employees where 
employee_id=p_empid;

if p_salary >=80000 then
p_category :='Directors';
elsif p_salary >= 60000 then
p_category :='Managers';
elsif p_salary >= 40000 then
p_category :='Senior Staff';
elsif p_salary >=0 then
p_category :='Junior Staff';
else
p_category :='Invalid';
end if;

return p_firstname || ' ' ||  p_lastname || ' ' || p_salary || ' '||p_category;
exception
when no_data_found then
return 'No data found';

end;


declare
v_first_name varchar2(40);
v_last_name varchar2(40);
v_salary number;
v_category varchar2(50); 
begin
dbms_output.put_line(func_employee_details(4,v_first_name,v_last_name,v_salary, v_category));
end;
/