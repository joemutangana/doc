#include<stdio.h>

float Convert(float fahrenheit){

    return (fahrenheit - 32) * 5/9 ; //return result converted in celisius
}

int main(){
    // print message and call function
    float f;

    // Prompt a user to enter temperature in fahrenheit
    printf("Enter the temperature in fahrenheit: ");
    scanf("%f", &f);

    printf("\nThe temperature in celsius is %.2f\n\n", Convert(f));

    return 0;
}
