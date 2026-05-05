#include<stdio.h>
int main(){

    //Declare the variables and array to hold marks
    float marks[5], userInput, total=0.00, average=0.00;
    char *grade;

    //For loop to collect 5 subjects marks
    for(int i=0; i<5; i++){
        printf("Enter marks for subject %d: ", i+1);
        scanf("%f", &userInput);
        marks[i] = userInput;
        total +=userInput;
    }

    //calculate the average
    average = total/5.0;

    //Assign grade
    grade = (average >=90)? "A" : (average >=80) ? "B": (average >= 70)? "C" :(average >=60)? "D":"F";

    //Display data
    printf("\n\n=========Student Detail=========\n\n");
    printf("Student %s", (average >=60)? "Passed": "Failed");
    printf("\nTotal: %.2f\nAverage: %.2f\nGrade: %s",total, average, grade);
    printf("\n\n");

return 0;
}
