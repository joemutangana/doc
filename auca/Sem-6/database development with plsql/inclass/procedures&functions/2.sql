set SERVEROUTPUT on
accept n1 prompt 'Enter a number 1';
accept n2 prompt 'Enter number 2';

declare
v_n1 number :=&n1;
v_n2 number :=&n2;

begin
get_max(v_n1, v_n2);
end;
/