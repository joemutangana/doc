#include<stdio.h>
int main(){

    int a,b;
    printf("Enter first number: ");
    scanf("%d", &a);
    printf("Enter second number: ");
    scanf("%d", &b);
    printf("\n\nArthimetic Operation of %d and %d:\n\n", a, b);
    printf("Addition: %d\n", a+b);
    printf("Substraction: %d\n", a-b);
    printf("Multiplication: %d\n", a*b);
    if(b == 0){
        printf("Division Error!\n");
    }
    else{
        printf("Division: %d\n", a/b);
    }
    printf("\n\nRelational Operator of %d and %d:\n\n", a, b);
    if(a>b){
        printf("a is greater than b:%d\n");
    }
    else if(a<b){
        printf("b is greater than a:%d\n");
    }
    else{
        printf("a is equal to b:%d\n");
    }
    printf("\n\nLogical Operation of %d and %d:\n\n", a,b);
    printf("a && b: %s\n",(a && b) ? "Yes":"No");
    printf("a || b: %s", (a || b)? "Yes":"No");
    return 0;
}
