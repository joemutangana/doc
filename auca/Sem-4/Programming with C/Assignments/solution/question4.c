#include <stdio.h>
#include <stdlib.h>

int main() {

    float celsius, fahrenheit, kelvin;
    int seconds, hours, minutes, remainingSeconds;
    char *classification;

    printf("\n\nEnter temperature in Celsius: ");
    scanf("%f", &celsius);

    printf("Enter time in seconds: ");
    scanf("%d", &seconds);

    
    fahrenheit = (celsius * 9.0 / 5.0) + 32;
    kelvin = celsius + 273.15;

   
    hours = seconds / 3600;
    minutes = (seconds % 3600) / 60;
    remainingSeconds = seconds % 60;

    
    classification = (celsius > 30) ? "Hot" :
                     (celsius >= 15) ? "Moderate" :
                      "Cold";

    int comfortable = 0;
    if (celsius >= 18 && celsius <= 25) {
        comfortable = 1;
    }

    int moreThanHour = 0;
    if (seconds > 3600) {
        moreThanHour = 1;
    }

    
    printf("\nTemperature Conversions:\n");
    printf("Celsius: %.2f\n", celsius);
    printf("Fahrenheit: %.2f\n", fahrenheit);
    printf("Kelvin: %.2f\n", kelvin);
    printf("Classification: %s\n", classification);

    printf("\nTime Conversion:\n");
    printf("%d seconds = %d hours, %d minutes, %d seconds\n",
           seconds, hours, minutes, remainingSeconds);

    printf("\nChecks:\n");
    printf("Comfortable temperature (18-25)? %d\n", comfortable);
    printf("More than 1 hour? %d\n\n", moreThanHour);

    return 0;
}
