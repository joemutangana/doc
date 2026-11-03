create or replace procedure convert_txt(p_txt in out varchar2) as
v_converted varchar2(100);
begin
v_converted := upper(p_txt);

dbms_output.put_line('Before Conversion');
dbms_output.put_line('Text: '||p_txt);

dbms_output.put_line('-------------------');
dbms_output.put_line('After Conversion');
dbms_output.put_line('Text: '||v_converted);
end;

set SERVEROUTPUT  on;

ACCEPT txt prompt 'Enter a text';

declare
v_txt varchar2(100) :='&txt';
begin
convert_txt(v_txt);
end;
/