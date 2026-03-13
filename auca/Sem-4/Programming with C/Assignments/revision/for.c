#include <stdio.h>

int main() {
    int endPoint;

    printf("Enter endpoint: ");
    scanf("%d", &endPoint);

    if (endPoint < 2) {
        printf("No prime numbers in this range.\n");
        return 0;
    }

    for (int i = 2; i <= endPoint; i++) {

        int isPrime = 1;

        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                isPrime = 0;
                break;
            }
        }

        if (isPrime) {
            printf("%d ", i);
        }
    }

    return 0;
}
