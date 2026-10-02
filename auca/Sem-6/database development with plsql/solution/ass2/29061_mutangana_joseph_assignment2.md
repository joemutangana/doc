# PL/SQL ASSIGNMENT 2 APPROACH

----

## TASK A: SQL RECAP


I used the `select` command to specify the columns I need as output. I used different functions: `count()` helped to count total items, ``
`sum()` helped to get total salary, `avg()` helped to get average salary of employees, `round()` helped to make 2 decimal places, `nvl()` to provide 0 as value where result were null, `LEFT JOIN` to keep all `departments`, a `SUBQUERY` in select section to provide total count of courses, then `ORDER BY DESC` to sort total salary in descending order. I used `departments`, `courses`, and `employees` tables to fetch aquired data.

I also used `GROUP BY` and `HAVING` clause on `Task A: (b)`, to filter group and filter groups.


### Challenges I faced on TASK A

I struggled to know where I would put correlated subquery, because I didn't know I can even decide what coulmn I want in select sesction.

### Lesson I learned

I learned that suquery can even go in select section to aliase a new column.

### Why joining `EMPLOYEES` and `COURSES` to `DEPARTMENTS` in the same query would give wrong counts?


Joining those tables results in wrong counts because the tables have many to many relation ship, and more you combine them, more repeatdly data being counted.

That is why counting, summing up and average from those three combined tabels would give wrong number output, especially a higher output because that were duplicated and counted.


----

## TASK B: `Variables`, `%TYPE`, `%ROWTYPE` and `DBMS_OUTPUT`

**B1**
I declared variables under `DECLARE` section, those variables included v_c_name, for course name wit data type of `VARCHAR2(100)` and i used `BOOLEAN` variable to retrun `TRUE` or `FALSE`. For displaying output, the `DBMBS_OUTPUT.PUT_LINE()` helped to displaye output.

For `Boolean` Values, I used an `IF ELSE` constion to decide whether it saty true of false.

**B2**

Here I declare variables which will follow the data type of the columns in the tables i was dealing with by using `%TYPE` under declare function.

Then in `BEGIN` and `END` section I seleted required feild into the specified variables.
And again 
`DBMBS_OUTPUT.PUT_LINE()` helped to displaye output.

**B3**
Here I used the `%ROWTYPE` to declare a variable which will correspond too entire row from the table `v_employee employees%ROWTYPE;`.

Then later to get specific value I use that variable.value i want example `employee.first_name`.

I also used `EXTRACT ()` function to get only year from hired date, and `TRUNC ()` function to remove decimal numbers after the point when I was calculating the years of employee with 22 id worked.

### Challanges I faced
I was confused about what  `%TYPE` and `%ROWTYPE` helps us.
It was hard for first to know what will i used to get number of years that employee worked.

### Lesson I learned
I learned data I can declare variales initialy with forcing them to match the data type of field it correspond to with `%TYPE`.

I also leaerned that I can scpecify one variable which stands for entire row from the table with one keyword which is `%ROWTYPE`.

Lastly, I learned that I can use the `TRUNC ()` function to get only one single value before decimal point numbers.




----


## TASK C: `IF` / `ELSIF` / `ELSE` Conditions

In this task, the code I used were more about making decisions by using `IF`, `ELSIF` and `ELSE` conditions.
But, To make a better decisions, I use included some variables under `DECLARE` section which helped me to decide
because that had values decision depends on.

I also used `DBMS_OUTPUT.PUT_LINE()` function to orint the output mostly the desion from code I wrote.
Lastly, the `EXCEPTION` to handle no data found error or others when unexpected error happens.



### Challenges I faced

I struggled on task C2, where I was not getting this requirement well `enrolled above max_students * 0.8 but below max_students: 'Almost full, enroll soon` this confused me!

Also to get enrollment date in 2023 on task C3, Challenged me, that is why I used ```v_enrollment_year := extract(year from v_enrollment_date);``` To get only year regardless entire date.

### Lesson I learned

I learned that, I can create more variables to facilitate me in getting result, especially on `Task C3` that is where I used many variables.

----


# Section D: `CASE Statements` and `Expressions`

In this task, it was more about making decisions, but using case condition rather than an IF, ELSIF and ELSE
The code I wrote, I mostly declared variables which facilitated me while working with case condition
For example: having v_score in task D1 some variables like v_grade, v_score, v_stored_grade,

Helped me to compute the garde of score, and after computing the grade, the v_stored_grade helped me to compare what it
to what i ccmputed mathes the stored grade.

### Challenges I faced

This task on task D2, I got challaged by getting `Computer Science` departments,
I used it in where clause  to get exact same department, but error throws saying that
Too many rows returned.

Then when I checked in on `DEPARTMETS` table, I found that  `Computer Science` department is there twice
In that case I used one department id of them.


### Lesson I learned

I learned that two many rows can't fit in one variable like
that issue happended in `Task D2`, the query were returning more than one row, while query 
saying put that  results into this variable, and dmbs said, no that can't work.

`So better fetch one row value, store in a variable.`


----


# Section E: `Loops`


Aproach I used was to first declare variables and select the required data into those variables, then perform calculations and checks within loops, and finally display the results using DBMS_OUTPUT.PUT_LINE.

I also used an `IF` statement within the `loops` to check for specific conditions, such as whether the total credits have specified number. Based on these conditions, I performed different actions, such as updating totals or displaying specific messages.

I used the `DBMS_OUTPUT.PUT_LINE` procedure to display the results of the calculations and actions performed within the loops. The loops allowed me to 
process multiple records and perform calculations based on the retrieved data.

A `cursor` was used to `fetch` employee data from the employees table, allowing me to iterate through the result set and perform calculations on each employee's salary. The loop continued until all employees in the specified department were processed.

`%TYPE` was used to declare variables that correspond to the data types of specific columns in the tables, ensuring that the variables can hold the appropriate values retrieved from the database.

`%FOUND` was used to check if the cursor has fetched any rows, allowing me to control the flow of the loop and exit when all employees have been processed.


### Challenges I faced

On E2, I did not know what cursor means, and i tried to use normal while loop, but it did not work, so I had to research and learn about cursors and how to use them in PL/SQL. After understanding the concept of cursors, I was able to implement it correctly in my code.


### Lesson I learned

I learned how to use loops, cursors, mixed with conditional statements in PL/SQL to process data and perform calculations. I also learned how to use the  Additionally, I gained a better understanding of how to declare variable like cursors and use them to fetch data from the database. Overall, this task helped me improve my PL/SQL programming skills and understand how to work with loops and cursors.

I also learned `RPAD()`  used to format the output by padding strings to a specified length on the right side, ensuring that the output is aligned and readable.


----


# Section F: Combined Challenge
Approach I used was to first declare variables and select the employee's data into a record variable, then calculate years of service and determine service class using a CASE statement. I also used another CASE statement to determine pay grade based on salary ranges.

I used function to_char() to format the output for better readability.


### Challenges I faced:

In the task F1 I faced no challenges because I was able to combine all the concepts learned in previous tasks to create a comprehensive employee profile report. I can say that formatting the output for better readability was a bit challenging, because it was for first time    I was using it, then after some research i knew how to use it and why it mattered in thi task to improve the output readability.


### Lesson I Learned:

I learned how to work with multiple concept to solve a given problem, and how to format output for better readability by using the `to_char()` function. 


---

# Section G: `SQL`



Approach I used was to first create a table called `stats` to store the total number of employees, total salary, average salary, number of higher earners, number of lower earners, and the highest paid salary in the Computer Science department. Then I created another temporary table called `top_employee` to store the name and salary of the highest paid employee in the same department. Finally, I selected all the data from both temporary tables and displayed them in one row using a `cross join`.

### Challenges I faced

At first I used normal `select statement`, for total number of employees, total salary, average salary, number of higher earners, number of lower earners, and the highest paid salary in the Computer Science department and those only worked. But when I added another subquery to get names of highest paid employee, The query stopped working throwing error that i can't use `aggregate function` with `non aggregate function`. I did not know how to use with for temporary data, so I searched and found that I can use with clause to store temporary data and because both temporary data produces one row value, I can use cross join to combine those two temporary data and display the result in one row.

### Lesson I Learned

I learned that `WITH` clause is very useful when you want to store temporary data for use in a query, and cross join can be used to combine two temporary tables that produce one row value each. I also learned that aggregate functions cannot be used with non-aggregate functions in the same select statement, and that using with clause can help to avoid this issue.


----

