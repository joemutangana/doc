accept choice number prompt 'Enter a choice';

declare
v_choice number :=&choice;
st_cur sys_refcursor;
--st_cur student_cursor%rowtype;
v_name varchar(100);
v_course varchar2(100);

begin

if v_choice = 1 then
open st_cur for 
select s.first_name || ' ' || s.last_name as fullname, c.course_name
from students s
join enrollments e on e.student_id = s.student_id
join courses c on c.course_id = e.course_id
where c.course_name = 'Data Structures';

elsif v_choice = 2 then
open st_cur for 
select s.first_name || ' ' || s.last_name as fullname, c.course_name
from students s
join enrollments e on e.student_id = s.student_id
join courses c on c.course_id = e.course_id
where c.course_name = 'Web Development';

elsif v_choice = 3 then
open st_cur for 
select s.first_name || ' ' || s.last_name as fullname, c.course_name
from students s
join enrollments e on e.student_id = s.student_id
join courses c on c.course_id = e.course_id
where c.course_name = 'Computer Networks';
else
dbms_output.put_line('Invalid Choice');
end if;

loop
fetch st_cur into v_name, v_course;
dbms_output.put_line(v_name || ' ' || v_course);
exit when st_cur%notfound;
end loop;

close st_cur;

end;
/
