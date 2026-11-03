create or replace procedure salary_category(emp_id in number, v_fname out varchar2, v_lname out varchar2, emp_salary out number) is
v_category VARCHAR2(100);

begin

select first_name, last_name, salary into v_fname, v_lname, emp_salary from employees where employee_id = emp_id;

case
when emp_salary >= 80000 then
v_category :='Directors';
when emp_salary >= 60000 then
v_category :='Managers';
when emp_salary >= 40000 then
v_category :='Senior Staff';
when emp_salary >=0 then
v_category :='Junior Staff';
else
v_category :='Invalid';
end case;

dbms_output.put_line('');
dbms_output.put_line('First Name: '||v_fname);
dbms_output.put_line('Last Name: '||v_lname);
dbms_output.put_line('Salary: '||emp_salary);
dbms_output.put_line('Salary category: '||v_category);

exception
when no_data_found then
dbms_output.put_line('No employee found');

end;


set SERVEROUTPUT on

accept n prompt 'Enter employee id';

declare
v_n number := &n;
v_fname varchar2(100);
v_lname varchar2(100);
v_salary number;

begin
salary_category(v_n, v_fname, v_lname, v_salary);
end;
/