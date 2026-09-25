# STEPS TO RUN THE `QUERIES`
---

## Step 1: Open Oracle SQL Developer

```
Open Oracle Sql Developer and connect to your existing user, or create new connection.
```

## Step 2: Open the SQL worksheet


```
Find the icon of sql on icon menu bar to open new query worksheet.
```

## Step 3: Make sure you have the following tables or create them using their schema below.


* `students`
* `courses`
* `enrollments`
* `employees`
* `departments`

### Students table schemma
```
CREATE TABLE students (
 student_id NUMBER PRIMARY KEY,
 first_name VARCHAR2(50) NOT NULL,
 last_name VARCHAR2(50) NOT NULL,
 email VARCHAR2(100) UNIQUE,
 phone VARCHAR2(20),
 date_of_birth DATE,
 enrollment_date DATE DEFAULT SYSDATE,
 gpa NUMBER(3,2) CHECK (gpa BETWEEN 0 AND 4),
 status VARCHAR2(20) DEFAULT 'Active'
);
```
---
### Course table schema

```
CREATE TABLE courses (
 course_id NUMBER PRIMARY KEY,
 course_name VARCHAR2(100) NOT NULL,
 course_code VARCHAR2(10) UNIQUE,
 credits NUMBER(1) CHECK (credits BETWEEN 1 AND 5),
 instructor VARCHAR2(50),
 department VARCHAR2(50),
 max_students NUMBER DEFAULT 30,
 semester VARCHAR2(20)
);
```
---

### Enrollments table schema
```
CREATE TABLE enrollments (
 enrollment_id NUMBER PRIMARY KEY,
 student_id NUMBER REFERENCES students(student_id),
 course_id NUMBER REFERENCES courses(course_id),
 enrollment_date DATE DEFAULT SYSDATE,
 grade VARCHAR2(2),
 score NUMBER(5,2),
 status VARCHAR2(20) DEFAULT 'Active',
 UNIQUE(student_id, course_id)
);

```
----
### Employees table schema

```
Create the EMPLOYEES table
CREATE TABLE employees (
 employee_id NUMBER PRIMARY KEY,
 first_name VARCHAR2(50) NOT NULL,
 last_name VARCHAR2(50) NOT NULL,
 email VARCHAR2(100),
 phone VARCHAR2(20),
 hire_date DATE,
 job_title VARCHAR2(50),
 salary NUMBER(10,2),
 commission_pct NUMBER(2,2),
 department VARCHAR2(50),
 manager_id NUMBER REFERENCES employees(employee_id)
);
```
---

### Departments table schema

```
CREATE TABLE departments (
 department_id NUMBER PRIMARY KEY,
 department_name VARCHAR2(50) NOT NULL,
 manager_id NUMBER,
 location VARCHAR2(50),
 budget NUMBER(12,2)
);

```

---

## Step 4: Paste the queries based on a query you want to execute, or retype it as it is.

## Step 5: Click on run script above the worksheet

## Step 6: The query result tap will show up

## Step 7: View the result

## Step 8: Repeat from `Step 4`



