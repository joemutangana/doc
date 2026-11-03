declare
cursor student_cursor is select s.first_name, s.last_name
from students s
join enrollments e on e.student_id = s.student_id
join courses c on c.course_id = e.course_id
where c.course_name = 'Computer Networks';

v_cursor student_cursor%rowtype;
begin


for student in student_cursor loop
dbms_output.put_line(student.first_name||' '||student.last_name);
end loop;

--open student_cursor;
--loop
--fetch student_cursor into v_cursor;
--dbms_output.put_line(v_cursor.first_name||' '||v_cursor.last_name || ' ');
--end loop;
--close student_cursor;

end;
/