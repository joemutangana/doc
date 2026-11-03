set SERVEROUTPUT on

a number prompt 'Enter the first number';
b number prompt 'Enter the second number';
declare
message varchar2(50):= 'HI PLSQL GROUP A';
name varchar2(25):='Joseph';

num1 number:=&num1prt;
num2 number:=&num2prt;

summation number:=num1+num2;
div number:=num1/num2;
mult number:=num1*num2;
sub number:=num1-num2;

begin 
--dbms_output.put_line(message);
--dbms_output.put_line('My name is: ' || name);
dbms_output.put_line('Sum is: ' || num1 || ' + '|| num2|| ' = ' || summation);
dbms_output.put_line('Subtraction: ' || num1 || ' - '|| num2|| ' = ' || sub);
dbms_output.put_line('Product: ' || num1 || ' * '|| num2|| ' = '||mult);
dbms_output.put_line('Division: ' || num1 || ' / '|| num2|| ' = '||div);

end;
/