#include<stdio.h>
#include<ctype.h>
#include<conio.h>

struct Employee{

    int id;
    char name[50],department[50];
    float hoursWorked, hoursRate, grossSalary, tax, netSalary;

};

int main(){

    struct Employee emp[3];
    int highNetSalaryIndex = 0;

    for(int i=0; i<3; i++){

        printf("Enter the ID of employee %d: ", i+1);
        scanf("%d", &emp[i].id);
        printf("Enter the name of employee %d: ", i+1);
        scanf(" %[^\n]s", emp[i].name);
        printf("Enter the department of employee %d: ", i+1);
        scanf(" %[^\n]s", emp[i].department);
        printf("Enter the total worked hours of employee %d: ", i+1);
        scanf("%f", &emp[i].hoursWorked);
        printf("Enter the hour rate of employee %d: ", i+1);
        scanf("%f", &emp[i].hoursRate);
        emp[i].grossSalary = emp[i].hoursWorked * emp[i].hoursRate;
        emp[i].tax = emp[i].grossSalary * 0.15;

        emp[i].netSalary = emp[i].grossSalary - emp[i].tax;

        if(emp[i].netSalary > emp[highNetSalaryIndex].netSalary){
            highNetSalaryIndex = i;
        }

         printf("\n");
    }


    for(int i=0; i<3; i++){
        printf("\nPaySlip for Employee: %d", i+1);
        printf("\n\nId: %d", emp[i].id);
        printf("\nName: %s", emp[i].name);
        printf("\nDepartment: %s", emp[i].department);
        printf("\nHours Worked: %.2f", emp[i].hoursWorked);
        printf("\nHour Rate: %.2f", emp[i].hoursRate);
        printf("\nGross Salary: %.2f", emp[i].grossSalary);
        printf("\nNet Salary: %.2f", emp[i].netSalary);

        printf("\n");
    }

    printf("\n\nEmployee  with highest Net Salary is %s with %.2f Frw\n", emp[highNetSalaryIndex].name, emp[highNetSalaryIndex].netSalary);



   return 0;
}
