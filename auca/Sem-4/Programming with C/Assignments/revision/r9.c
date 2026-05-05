#include<stdio.h>

struct Student{
    char name[50];
    int regNo, age;
    float gpa;
};

int main(){

    FILE *file;

    struct Student student[3];

    for(int i=0; i<3; i++){
        printf("Enter the name of student %d: ", i+1);
        scanf(" %[^\n]", student[i].name);
        printf("Enter the age of student %d: ", i+1);
        scanf(" %d", &student[i].age);
        printf("Enter the reg number of student %d: ", i+1);
        scanf(" %d", &student[i].regNo);
        printf("Enter the GPA of student %d: ", i+1);
        scanf(" %f", &student[i].gpa);
        printf("\n");

    }

    file = fopen("students.txt", "w");
    if(file == NULL){
        printf("Error: Opening file failed");
        return 1;
    }
    for(int i=0; i<3; i++){
            fprintf(file, " %s %d %d %.2f\n", student[i].name, student[i].age, student[i].regNo, student[i].gpa);

    }
    fclose(file);

    struct Student temp[3];
    file = fopen("students.txt", "r");
     if(file == NULL){
        printf("Error: Reading file failed");
        return 1;
    }

    for(int i=0; i<3; i++){
        fscanf(file, " %s %d %d %f", temp[i].name, &temp[i].age, &temp[i].regNo, &temp[i].gpa);
    }
    fclose(file);

    int maxIndex = 0;

    for(int i=1; i<3; i++){
        if(temp[i].gpa > temp[maxIndex].gpa){
            maxIndex = i;
        }
    }



    printf("\n\n========Students======\n\n");
    for(int i=0; i<3; i++){
            printf("\n-----Student %d-----\n\n", i+1);
            printf("Name: %s\n", temp[i].name);
            printf("Age: %d\n", temp[i].age);
            printf("Reg No: %d\n", temp[i].regNo);
            printf("GPA: %.2f\n", temp[i].gpa);
            printf("\n");

    }

    printf("\n\n====Student with maximum GPA===== \n\nName: %s\nAge: %d\nReg No: %d\nGPA: %.2f\n", temp[maxIndex].name,temp[maxIndex].age,temp[maxIndex].regNo,temp[maxIndex].gpa);


return 0;
}
