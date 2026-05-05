#include <stdio.h>

int main() {

    int n, i, j;

    printf("Enter a number: ");
    scanf("%d", &n);

    for(i=2; i<=n; i++){

            int isPrime=1;

            for(j=2; j*j<=i; j++){

                    if(i%j==0){
                        isPrime=0;
                    }

            }

        if(isPrime){
            printf("%d, ", i);
        }
    }

    return 0;
}
