create or replace function func_even_odd(p_number in number) return varchar2 as
begin

if mod(p_number, 2) = 0 then
return p_number ||' Is EVEN';
else
return p_number ||' Is ODD';
end if;
end;

set SERVEROUTPUT on;
accept n prompt 'Enter a number';
declare
v_n number :=&n;
begin
dbms_output.put_line(func_even_odd(v_n));
end;
/
