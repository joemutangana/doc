#include<stdio.h>
int main(){

    int choice, a, b;

    do{
        printf("\n\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit\n\nEnter the choice: ");
        scanf("%d", &choice);

        if(choice >=1 && choice <=4){
            printf("\n\nEnter the first number: ");
            scanf("%d", &a);
            printf("Enter the second number: ");
            scanf("%d", &b);
        }

        switch(choice){
        case 1:
            printf("\nResult: %d", a + b);
            break;
        case 2:
            printf("\nResult: %d", a - b);
            break;
        case 3:
            printf("\nResult: %d", a * b);
            break;
        case 4:
            if(b == 0){
                printf("\nError: Divide by 0.");
            }
            else{
                    printf("\nResult: %d", a / b);

            }
        break;
        case 5:
        printf("\nExit...\n\n");
        break;

        default:
        printf("\n\nWrong choice. Try again!");
        }





    }


    while(choice !=5);

return 0;
}
