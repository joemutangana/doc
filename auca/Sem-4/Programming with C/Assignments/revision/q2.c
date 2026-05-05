#include<stdio.h>
int main (){

    char name[50];
    float price, quantity, total;

    printf("Enter the name: ");
    scanf("%s", name);
    printf("Enter the price: ");
    scanf("%f", &price);
    printf("Enter the quantity: ");
    scanf("%f", &quantity);

    printf("\n\n====Generated Invoice======\n\n");
    printf("Item Name: %s\n", name);
    printf("Price: %.2f\n", price);
    printf("Quantity: %.2f\n", quantity);
    printf("The total price: %.2f\n\n", price * quantity);
    
    return 0;
}