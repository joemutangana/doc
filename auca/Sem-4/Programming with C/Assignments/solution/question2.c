#include<stdio.h>
#include<stdlib.h>

int main(){
    float const pi=3.14159;
    float length, width,radius, area_rectangle,area_circle, circumference, perimeter_rectangle;
    printf("\n\nEnter the radius of circle :");
    scanf("%f", &radius);
    printf("Enter the length of rectangle :");
    scanf("%f", &length);
    printf("Enter the width of rectangle :");
    scanf("%f", &width);

    area_circle = pi * (radius*radius);
    area_rectangle = (length * width);
    circumference = 2 * (pi * radius);
    perimeter_rectangle = 2 * (length + width);
    printf("\n\n----------------------------------\n");
    if( area_circle > area_rectangle){
        printf("Area of circle is larger\n");
        printf("----------------------------------\n");
    }
    else if(area_rectangle > area_circle){
        printf("Area of rectangle is larger\n");
        printf("----------------------------------\n");

    }
    else{
        printf("Area of both shapes are equal\n");
    }

    printf("Area of circle is :%.2f\n", area_circle);
    printf("Area of triangle is :%.2f\n", area_rectangle);
    printf("Circumference is :%.2f\n", circumference); 
    printf("Perimeter of rectangle is :%.2f\n", perimeter_rectangle);
    printf("----------------------------------\n\n");

    return 0;
}