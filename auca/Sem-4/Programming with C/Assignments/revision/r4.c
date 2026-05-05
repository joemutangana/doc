#include<stdio.h>
int main(){
    int n;

    do{
        printf("Enter the positive number: ");
        scanf("%d", &n);

        //Increasing
        for(int i=0; i<=n; i++){
                for(int j=0; j<=n-i; j++){
                    printf(" ");
                }
                for(int j=1; j<= 2 * i - 1; j++){
                    printf("*");
                }
            printf("\n");
        }

        //Decreasing
        for(int i=n-1; i>=1; i--){
                for(int j=0; j<=n-i; j++){
                    printf(" ");
                }
                for(int j=1; j<= 2 * i - 1; j++){
                    printf("*");
                }
            printf("\n");
        }

    }

    while(n<0);
return 0;
}
