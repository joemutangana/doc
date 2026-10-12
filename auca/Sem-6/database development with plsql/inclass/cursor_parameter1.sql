SET SERVEROUTPUT ON

DECLARE
   
    CURSOR Student_Cur (P_Course_name VARCHAR2) IS
        SELECT s.First_name, e.grade, c.Course_name, e.score
        FROM Students S
        JOIN Enrollments e ON e.Student_id = S.Student_id
        JOIN Courses C     ON e.Course_id  = C.Course_id
        WHERE c.Course_name = P_Course_name;

BEGIN
        FOR Student_rec IN Student_Cur('Computer Networks') LOOP
            
            DBMS_OUTPUT.PUT_LINE(rpad('Name: '||Student_rec.First_name,14)|| rpad('| Grade: '||Student_rec.grade, 14)||rpad('| Course name: '||Student_rec.Course_name, 14)|| rpad(' Score: '||Student_rec.score,5));
        END LOOP;


END;
/