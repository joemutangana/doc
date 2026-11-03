create or replace procedure  swap(a in out number, b in out number)
is v_temp number;
begin 

dbms_output.put_line('Before swapping');
dbms_output.put_line('---------------');
dbms_output.put_line('A is: '||a);
dbms_output.put_line('B is: '||b);
v_temp :=a;
a :=b;
b :=v_temp;
dbms_output.put_line('After swapping');
dbms_output.put_line('---------------');
dbms_output.put_line('A is: '||a);
dbms_output.put_line('B is: '||b);
end;
/

---Call the swap procedure

set SERVEROUTPUT on;
accept num1 prompt 'Enter first number ';
accept num2 prompt 'Enter last number ';

declare 
v_a number :=&num1;
v_b number :=&num2;

begin
--- Here comes a real call
swap(v_a,v_b);
end;
/