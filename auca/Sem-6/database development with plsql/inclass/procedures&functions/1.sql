

ACCEPT name prompt 'Enter your name';

declare
v_name varchar2(50) :='&name';
begin
proc_greeting(v_name);
end;
/
