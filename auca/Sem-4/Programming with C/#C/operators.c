#include<stdio.h>
#include<stdlib.h>
int main(){
    /*int a = 10, b = 4, res;

    //printing a and b

    printf("a is %d and b is %d\n", a,b);
    
    res = a-b;//subtraction
    printf("a - b is %d\n", res);

    res = a*b;//Multplication
    printf("a * b is %d\n", res);

    res = a/b;//Division
    printf("a / b is %d\n", res);

    res = a%b;//Modulas
    printf("a mod b is %d\n", res);

    //C program for logical
    //OR operator
   int c=-1, d=20;

    if(c>0 || d>0){
        printf("\n\nAny one of given value is greater than 0\n\n");
    }
    else{
        printf("Both values are less than 0\n");
    }*/

    /*int a=5, b,sum; 
    b=((a==5)?(3):(2)); //Conditional Operator

    if (a==5){
        sum=a+b;

    }
    else{
        sum=a-b;
    }

    printf("The value of 'b' variable is:%d and sum is :%d", b,sum);*/

    /*int a,b,c;

    //comma operator: evaluates left to right, then return last value

    a=(5,10,15);
    printf("a = %d\n", a); //Output: a = 15*/

    /*int a=1,b=2,c;
    c=(a++,b++,a+b);
    printf("a =%d\n", a); //Output: a =2
    printf("b =%d\n", b); //Output: b =3
    printf("c =%d\n", c); //Output: c =5*/

    float n1,n2,n3,n4,n5,avg;
    printf("Enter 5 numbers :");
    scanf("%f %f %f %f %f", &n1,&n2,&n3,&n4,&n5);
    avg = (n1 + n2 + n3 + n4 + n5)/5;
    printf("Average is :%.2f", avg);

    


    return 0;

}