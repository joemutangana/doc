# SQL Assignment1

## How to Run the SQL Queries

---

Follow the steps below to run the SQL queries in Oracle SQL Developer.

### Step 1: Open Oracle SQL Developer

---

Open Oracle SQL Developer and connect to the Oracle database using the database user where the assignment tables were created.

### Step 2: Open the SQL Script

---

Open the SQL script containing the queries for this assignment.

### Step 3: Make Sure the Required Tables Exist

---

Before running the queries, make sure the following tables have been created and contain the required data:

* `students`
* `employees`
* `departments`
* `courses`
* `enrollments`

### Step 4: Run the Queries

---

Run each SQL query according to its section.

The queries are organized into the following sections:

* **Section A:** Filtering, Sorting, and Expressions
* **Section B:** Aggregation and Grouping
* **Section C:** Joins
* **Section D:** Subqueries
* **Section E:** Data Definition & Manipulation
* **Section F:** RANK()

### Step 5: Run SELECT Queries

---

For queries that use `SELECT`, execute the query and check the returned rows in the query result area.

For example:

```sql
SELECT first_name, last_name, email
FROM students
WHERE gpa >= 3.5
ORDER BY gpa DESC;
```

### Step 6: Run DML Queries

---

For commands such as `UPDATE` and `DELETE`, execute the command and check the number of affected rows.

After making changes, use `COMMIT;` when the changes should be saved.

### Step 7: Run the View Query

---

For the `honor_roll` view, first execute the command that creates the view.

Then execute:

```sql
SELECT * FROM honor_roll;
```

to display the data stored through the view.

### Step 8: Run the RANK() Query

---

Execute the Section F query to display students with their GPA, enrollment date, and rank within their enrollment-date cohort.

```sql
SELECT first_name||' '||last_name AS student_name,
       gpa,
       enrollment_date,
       RANK() OVER(
           PARTITION BY enrollment_date
           ORDER BY gpa DESC
       ) AS rank
FROM students;
```

### Step 9: Check the Results

---

After running each query, check the result returned by Oracle SQL Developer to make sure the query executed successfully.
