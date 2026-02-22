#include<stdio.h>
#include<stdlib.h>

int main(){
    char name[50], grade;
    int student_ID;
    float score1, score2, score3, average;
    
    printf("\n\nEnter student name :");
    scanf("%s", &name);
    printf("Enter student ID :");
    scanf("%d", &student_ID);
    printf("Enter student score1 :");
    scanf("%f", &score1);
    printf("Enter student score2 :");
    scanf("%f", &score2);
    printf("Enter student score3 :");
    scanf("%f", &score3);

    average=(score1 + score2 + score3)/3;
    printf("\n\n----------------------------------\n");
    printf("Student Name :%s\n", name);
    printf("Student ID :%d\n", student_ID);
    printf("Student Score :%.2f\n", average);

    if (score1 >=50 && score2 >=50 && score3 >=50){
        
        printf("Passed all subjects\n");

    }

    if (score1 < 50 || score2 <50 || score3 <50){
        printf("Student did not pass all subjects\n");

    }

    if (average >= 90){
        grade = 'A';
       
    }
    else if (average >= 80 ){
        grade = 'B';
        
    }
    else if (average >= 70 ){
        grade= 'C';
        
    }
    else if (average >= 60 ){
        grade= 'D';
        
    }
    else{
        grade = 'F';
        
    }

    printf("Student Grade :%c", grade);
    printf("\n----------------------------------\n\n");

    
    return 0;
}