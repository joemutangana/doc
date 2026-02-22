#include <stdio.h>
#include <stdlib.h>

int main(){
    
    /*int num;
    float fnum;
    printf("Enter an integer and a floating-pointer number: ");
    scanf("%d %f", &num, &fnum);
    printf("You have entered %d and %.2f\n", num, fnum);*/

    // Variable declration

    int age;
    float height;
    double salary;
    char grade;
    char name[30];

    // Variable Initialization

    age = 20;
    height = 1.65;
    salary = 500000.75;
    grade = 'A';

    printf("INITIAL VALUES\n");
    printf("-----------------\n");

    printf("Name :John\n");
    printf("Age :%d\n", age);
    printf("Height :%.2f\n", height);
    printf("Salary :%.2f\n", salary);

    printf("-----------------\n\n");

    //Reading Values from a user

    printf("Enter Your Name :");
    scanf("%s", &name);

    printf("Enter Your Age :");
    scanf("%d", &age);

    printf("Enter Your Height: ");
    scanf("%f", &height);

    printf("Enter Your Grade: ");
    scanf("%s", &grade);

    printf("Enter Your Salary: ");
    scanf("%lf", &salary);

    

    // Displaying User Input

    printf("\n\nUser Details\n");
    printf("-----------------\n\n");
    printf("User Name: %s \nUser Age: %d \nUser Height: %.2f cm \nUser Salary: %.2lf Rwf \nUser Grade: %c \n\n", name, age, height, salary, grade);
    
    
    return 0;     
}