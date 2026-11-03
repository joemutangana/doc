/*
=================== Explain the code we used =======================
We used the two cursors in this task, one to get thedepartment name and other with parameter to help us make reposrt of each course under the department name
We also used loops to help us calculate the statistics without using aggreagte functions, such as avg(), count(),... to update number of enrolled students, 
Totalscore score or total below.

We rested the values at the top of each course before it is processed, so the statisctic remain consistency on each course.



================== Approach we used ======================
We used the two cursors in this task, one to get thedepartment name and other with parameter to help us make reposrt of each course under the department name
We also used loops to help us calculate the statistics without using aggreagte functions, such as avg(), count(),... to update number of enrolled students, 
Totalscore score or total below.

We declared many variables to facilate us hold value for each course under the department name.
We rested the values at the top of each course before it is processed, so the statisctic remain consistency on each course.

===== Challenges ======
 We struggled how we would not use aggraget functionsto get statistics.
 It was hard to figureout where to reset values.

===== Lesson learned ==============

We lewrned to use loops to get statistics not depending on bultin functions such as count(), avg(),sum(),min(),max()


*/

SET SERVEROUTPUT ON;

DECLARE
CURSOR dep_cursor IS
SELECT *
FROM courses
WHERE department = 'Computer Science'
ORDER BY course_id ASC;

CURSOR c_cursor(p_course_id NUMBER) IS
SELECT student_id, score, grade
FROM enrollments
WHERE course_id = p_course_id;

v_dep dep_cursor%ROWTYPE;
v_label VARCHAR2(100);
enrolled NUMBER;
count_graded NUMBER;
count_scores NUMBER;
total_score NUMBER;
min_score NUMBER;
max_score NUMBER;
avg_score NUMBER;
below_avg NUMBER;
total_below_avg NUMBER := 0;
high_avg NUMBER;
high_avg_c_name VARCHAR2(100);
v_courses_processed NUMBER := 0;

BEGIN
    OPEN dep_cursor;

    LOOP
        FETCH dep_cursor INTO v_dep;
        EXIT WHEN dep_cursor%NOTFOUND;

        v_courses_processed := v_courses_processed + 1;

        
        enrolled := 0;
        count_graded := 0;
        count_scores := 0;
        total_score := 0;
        min_score := NULL;
        max_score := NULL;
        avg_score := NULL;
        below_avg := 0;
        v_label := 'No results yet';

        
        FOR c_row IN c_cursor(v_dep.course_id) LOOP
            enrolled := enrolled + 1;

            IF c_row.grade IS NOT NULL THEN
                count_graded := count_graded + 1;
            END IF;

            IF c_row.score IS NOT NULL THEN
                total_score := total_score + c_row.score;
                count_scores := count_scores + 1;

                IF min_score IS NULL OR c_row.score < min_score THEN
                    min_score := c_row.score;
                END IF;

                IF max_score IS NULL OR c_row.score > max_score THEN
                    max_score := c_row.score;
                END IF;
            END IF;
        END LOOP;

        
        IF count_scores > 0 THEN
            avg_score := total_score / count_scores;

            CASE
                WHEN avg_score >= 85 THEN
                    v_label := 'Strong';

                WHEN avg_score >= 75 THEN
                    v_label := 'Satisfactory';

                ELSE
                    v_label := 'Needs Attention';
            END CASE;

            
            FOR score_rc IN c_cursor(v_dep.course_id) LOOP
                IF score_rc.score IS NOT NULL
                   AND score_rc.score < avg_score THEN
                    below_avg := below_avg + 1;
                END IF;
            END LOOP;

           
            total_below_avg := total_below_avg + below_avg;

            
            IF high_avg IS NULL OR avg_score > high_avg THEN
                high_avg := avg_score;
                high_avg_c_name := v_dep.course_name;
            END IF;
        END IF;

        DBMS_OUTPUT.PUT_LINE('');
        DBMS_OUTPUT.PUT_LINE(
            '================ ' || v_dep.course_name || ' ================'
        );
        DBMS_OUTPUT.PUT_LINE('Course Code: ' || v_dep.course_id);
        DBMS_OUTPUT.PUT_LINE('Course Name: ' || v_dep.course_name);
        DBMS_OUTPUT.PUT_LINE('Instructor: ' || v_dep.instructor);
        DBMS_OUTPUT.PUT_LINE(
            'Enrolled vs Maximum: ' || enrolled || ' / ' || v_dep.max_students
        );
        DBMS_OUTPUT.PUT_LINE('Number Graded: ' || count_graded);
        DBMS_OUTPUT.PUT_LINE('Minimum Score: ' || min_score);
        DBMS_OUTPUT.PUT_LINE('Maximum Score: ' || max_score);

        IF avg_score IS NOT NULL THEN
            DBMS_OUTPUT.PUT_LINE(
                'Average Score: ' || TO_CHAR(avg_score, 'FM999990.00')
            );
        ELSE
            DBMS_OUTPUT.PUT_LINE('Average Score: No results yet');
        END IF;

        DBMS_OUTPUT.PUT_LINE('Label: ' || v_label);
        DBMS_OUTPUT.PUT_LINE('Students Below Average: ' || below_avg);
        DBMS_OUTPUT.PUT_LINE('--- Students Below the Average ---');

        IF avg_score IS NOT NULL THEN
            FOR st_rc IN (
                SELECT s.first_name || ' ' || s.last_name AS full_name
                FROM students s
                JOIN enrollments e
                    ON e.student_id = s.student_id
                WHERE e.course_id = v_dep.course_id
                  AND e.score IS NOT NULL
                  AND e.score < avg_score
            ) LOOP
                DBMS_OUTPUT.PUT_LINE(st_rc.full_name);
            END LOOP;
        ELSE
            DBMS_OUTPUT.PUT_LINE('No graded scores available.');
        END IF;

    END LOOP;

    CLOSE dep_cursor;

    
    DBMS_OUTPUT.PUT_LINE('');
    DBMS_OUTPUT.PUT_LINE('========== Summary ==========');
    DBMS_OUTPUT.PUT_LINE('Courses Processed: ' || v_courses_processed);
    DBMS_OUTPUT.PUT_LINE(
        'Total Students Below Average: ' || total_below_avg
    );

    IF high_avg IS NOT NULL THEN
        DBMS_OUTPUT.PUT_LINE(
            'Highest Average: ' || TO_CHAR(high_avg, 'FM999990.00')
        );
        DBMS_OUTPUT.PUT_LINE(
            'Course With Highest Average: ' || high_avg_c_name
        );
    ELSE
        DBMS_OUTPUT.PUT_LINE('No courses have graded scores.');
    END IF;

END;
/
