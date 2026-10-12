SET SERVEROUTPUT ON;

DECLARE
    
    
    CURSOR student_cursor (p_course_name VARCHAR2) IS
        SELECT s.student_id,
               s.first_name || ' ' || s.last_name AS fullname,
               s.email,
               c.course_name
        FROM students s
        JOIN enrollments e ON s.student_id = e.student_id
        JOIN courses c ON e.course_id = c.course_id
        WHERE c.course_name = p_course_name
        ORDER BY s.first_name;

    v_student student_cursor%ROWTYPE;

BEGIN

    OPEN student_cursor('Computer Networks');

    LOOP

        FETCH student_cursor INTO v_student;

        EXIT WHEN student_cursor%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE(
            v_student.student_id || ' ' ||
            v_student.fullname || ' ' ||
            v_student.email || ' ' ||
            v_student.course_name
        );

    END LOOP;

    CLOSE student_cursor;

END;
