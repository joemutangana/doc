#include<stdio.h>

int main() {
    float mark1;
    float mark2;
    float mark3;
    float average;

    printf("Enter your marks of 3 subjects\n");
    scanf("%f %f %f", &mark1,&mark2,&mark3);

    average = (mark1+mark2+mark3)/3;

    printf("%.3f\n %.2f\n %.2f\n", mark1,mark2,mark3);
    printf("\n%.3f is average \n", average);
}