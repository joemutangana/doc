#include<stdio.h>
int main(){

    int choice;
    float a, b;

    


    do{
        printf("\n\n1. Addition\n");
        printf("2. Substraction\n");
        printf("3. Multiplication\n");
        printf("4. Division\n");
        printf("5. Exit\n\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        if(choice >= 1 && choice <=4){
            printf("\n\nEnter first number: ");
            scanf("%f", &a);
            printf("Enter second number: ");
            scanf("%f", &b);

        }

        switch(choice){
            case 1:
            printf("Result: %.2f", a + b);
            break;
            case 2:
            printf("Result: %.2f", a - b);
            break;
            case 3:
            printf("Result: %.2f", a * b);
            break;
            case 4:
            if(b==0){
                printf("\nResult: Division error ");
            }
            else{
                printf("Result: %.2f", a / b);

            }
            break;
            case 5:
            printf("Exit...\n");
            break;  
            default:
            printf("\nInvalid choice");
            
        }
        

    }
    while(choice != 5);

    return 0;
}