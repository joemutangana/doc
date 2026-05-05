#include<stdio.h>
int main(){
    int a,b;
    float marks;
    printf("Enter the first number: ");
    scanf("%d", &a);
    printf("Enter the second number: ");
    scanf("%d", &b);
    printf("Enter the marks: ");
    scanf("%f", &marks);

    printf("\n\nIs %d even or odd?: %s",a, (a%2==0)? "Is even":"Is Odd");
    printf("\nMaximum number is: %d", (a>b)? a:b);
    printf("\nIs %d positive, negative or zero?: %s",a, (a>0)? "Positive":(a<0)? "Negative":"Zero");
    printf("\nGrade: %s", (marks>=80)? "A":(marks >=70)? "B":(marks >=60)? "C": (marks >=50)? "D":"F");
    printf("\n\n");

return 0;

}
