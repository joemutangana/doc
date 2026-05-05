#include<stdio.h>
int main(){

    int age, licence, id;
    printf("Enter your age: ");
    scanf("%d", &age);
    printf("\nDo you have licence? \n\n1. Yes\n2. No\n>: ");
    scanf("%d", &licence);
    printf("\nDo you have ID? \n\n1. Yes\n2. No\n>: ");
    scanf("%d", &id);

    if(age >=18 && id==1){
        printf("\nYou are eligible to vote.\n");
    }
    if((age < 18 || id!=1) || (age >=18 && id!=1)){
            printf("\nYou are not eligible to vote.\n");

    }
    if(age >=18 && licence == 1 && id==1){
        printf("\nYou are eligible to drive.\n");
    }
    if( (age<18) || (age >=18 && licence != 1) || id!=1){
        printf("\nYou are not eligible to drive.\n");
    }



return 0;}
