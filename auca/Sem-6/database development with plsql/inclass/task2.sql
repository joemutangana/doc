set SERVEROUTPUT on

accept number prompt 'Enter a number: ';

declare
v_num number :=&number;

begin

dbms_output.put_line('Multiplication table of ' || v_num);
for i in 1..12 loop
dbms_output.put_line(v_num || ' * ' || i || ' = '|| v_num * i);
end loop;

end;
/