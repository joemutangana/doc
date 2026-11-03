create or replace function func_greetings(p_name in varchar2) return varchar2 is
result varchar2(50);
begin
result := 'Hy, '||p_name;
return result;
end;

accept name prompt 'Enter your name';

declare
v_name varchar2(50) :='&name';
begin
dbms_output.put_line(func_greetings(v_name));
end;
/