#include <stdio.h>
#include <stdlib.h>

int main() {

    int a, b;
    
    printf("\nEnter number a: ");
    scanf("%d", &a);

    printf("Enter number b: ");
    scanf("%d", &b);

    printf("\n===== Arithmetic Operations =====\n");

    printf("%d + %d = %d\n", a, b, a + b);
    printf("%d - %d = %d\n", a, b, a - b);
    printf("%d * %d = %d\n", a, b, a * b);

    if (b != 0) {
        printf("%d / %d = %d\n", a, b, a / b);
        printf("%d %% %d = %d\n", a, b, a % b);
    } else {
        printf("Division and Modulus not possible (b is zero)\n");
    }

    printf("\n===== Comparison Results =====\n");

    printf("Is a equal to b? %d\n", (a == b));
    printf("Is a greater than b? %d\n", a > b);
    printf("Is a less than or equal to b? %d\n", a <= b);

    printf("\n===== Logical Operations =====\n");

    printf("Are both numbers positive? %s\n", (a > 0 && b > 0)? "Yes":"No");
    printf("Is at least one number even? %s\n", (a % 2 == 0 || b % 2 == 0)? "Yes":"No");

    printf("\n===== Increment Demonstration =====\n");

    printf("Original a: %d\n", a);
    printf("Pre-increment ++a: %d\n", ++a);
    printf("Post-increment a++: %d\n", a++);
    printf("After post-increment, a is: %d\n", a);

    printf("\n===== Bitwise Operations =====\n");

    printf("a & b = %d\n", a & b);
    printf("a | b = %d\n", a | b);
    printf("a ^ b = %d\n", a ^ b);

    printf("\n\n");

    return 0;
}
