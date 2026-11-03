accept v_n1 prompt 'Enter number 1';
accept v_n2 prompt 'Enter number 2';

create or replace procedure get_max is
n1 number :=&v_n1;
n2 number :=&v_n2;
begin
if n1 > n2 then
dbms_output.put_line(n1 || ' is greater than '||n2);
elsif n1 < n2 then
dbms_output.put_line(n2 || ' is greater than '||n1);
else
dbms_output.put_line(n1 || ' equals '||n2);
end if;
end;
/

BEGIN
get_max;
end;
/
