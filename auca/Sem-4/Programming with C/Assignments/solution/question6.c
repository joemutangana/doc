#include<stdio.h>
int main(){
    int n;

    do{
        printf("Enter a number from 1 to 20: ");
        scanf("%d", &n);
    }
    while(n < 1 || n > 20);

    for(int i=1; i<=n; i++){
            printf("\nMultiplication Table of %d:\n\n", i);
        for(int j=1; j<=10; j++){
            int product = i*j;
            if((product)%3 ==0 && (product)%5==0){
                    continue;

                }
                if(product > 100){
                    break;

                }
                int isSquare = 0;
                for (int k = 1; k * k <= product; k++) {
                    if (k * k == product) {
                        isSquare = 1;
                        break;
                    }
                }
                if(isSquare){
                    printf("%4d * %2d = %3d*\n",i,j, product);
                }
                else{
                    printf("%4d * %2d = %3d\n",i,j, product);
                }

        }

        printf("\n");
    }

    printf("\n\nGrid Multiplication:\n\n");
    for(int i=1; i<=n; i++){

            for(int j=1; j<=n; j++){
                int product = i*j;
                if((product)%3 ==0 && (product)%5==0){
                    continue;

                }
                if(product > 100){
                    break;

                }
                int isSquare = 0;
                for (int k = 1; k * k <= product; k++) {
                    if (k * k == product) {
                        isSquare = 1;
                        break;
                    }
                }
                if(isSquare){
                    printf("%5d*", product);
                }
                else{
                    printf("%6d", product);
                }

            }
            printf("\n");
        }
        printf("\n\n");
return 0;
}
