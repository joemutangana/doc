/*

========Explain the code we used==================

In this task we used the variables as specfied, such as variable of sys_ref_cursor to create the reference cursor
, and v_report to holr what kind of report cursor will hold. 
then we used if/else condion to check for valid report and open cursor to hold the query that performs the logic 
to display the report.

We used the %rowcount to show the total number of rows fetched.

And we used the loop to iterate through the cursor so that it displays the result based on report selected
We also used the dbms_output.put_line() function to display the outout to the screen.

and finaly we closed the cursor.


=================== Approach we used ======================
We declared the variable to hold the students data
We used the sys_refcursor to make the reference cursor that will help us to hold the result of 
Single query.

we also used the if/else statement condition to handle the valid and invalid report type.
Then the fecth into method used to get data from cursor when opened to storing the in specified variables
and the loop to iterate through the result then dbms_output.put_line() to display the output on the screen
and finally we closed the cursor, for effient memory use.



================ Lesson learned =========================

We learned to use referrence cursor  that it can be used to perfrom different tasks 
and show different information based on user needs r the task to be peroformed.

================ Challenges we faced =====================

At first we were not understanding that the v_report will be the variable to hold the report type like
HONOURS, then later in condition we check using the v_report.

*/



set serveroutput on

declare

rc SYS_REFCURSOR;
v_student_id number;
v_full_name varchar2(100);
v_gpa number;
v_enrollment_date date;
v_report VARCHAR2(20) :='HONOURS';


begin

if v_report = 'HONOURS' then
open rc for select student_id, first_name || ' ' ||last_name as fullname, gpa, enrollment_date
from students where gpa >= 3.7 ORDER BY GPA DESC;
dbms_output.put_line('=================== HONOURS ====================');
dbms_output.put_line(' ');

elsif v_report = 'PROBATION' then

open rc for select student_id, first_name || ' ' ||last_name as fullname, gpa, enrollment_date
from students where gpa < 3 ORDER BY GPA ASC;
dbms_output.put_line('=================== PROBATION ====================');
dbms_output.put_line(' ');

elsif v_report = 'NEW INTAKE' then
open rc for select student_id, first_name || ' ' ||last_name as fullname, gpa, enrollment_date
from students where enrollment_date >= date'2024-09-01' ORDER BY enrollment_date DESC;
dbms_output.put_line('=================== NEW INTAKE ====================');
dbms_output.put_line(' ');

end if;

IF v_report IN ('HONOURS', 'PROBATION', 'NEW_INTAKE') THEN
loop
fetch rc into v_student_id, v_full_name, v_gpa, v_enrollment_date;
exit when rc%notfound;
dbms_output.put_line(v_student_id ||' | Fullname: ' || rpad(v_full_name,18) || ' | Gpa: ' || rpad(v_gpa,5) ||' | Enrollment_date: ' ||v_enrollment_date) ;
end loop;
dbms_output.put_line(rc%rowcount||' rows returned');
close rc;
else 
dbms_output.put_line('Unknown report type');
end if;

end;
/
