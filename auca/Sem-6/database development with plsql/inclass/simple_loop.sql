DECLARE
i number :=10;

begin
loop

dbms_output.put_line(i);
i:=i-1;
EXIT when i<1;
end loop;

end;
/