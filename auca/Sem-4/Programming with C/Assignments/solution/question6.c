#include<stdio.h>
int main(){
    int n;

    do{
        printf("Enter a number from 1 to 20 :");
        scanf("%d", &n);
    }
    while(n<1 || n>20);

    for(int i=1; i<=n; i++){
            printf("\nMultiplication Table %d:\n\n", i);
            for(int j=1; j<=10; j++){

                if((i*j)%3 ==0 && (i*j)%5==0){
                    continue;

                }
                if(i*j > 100){
                    break;

                }
                if(i == j){
                    printf("(*)\n");
                }
                else{
                    printf("%d * %d = %d\n", i,j,i*j);
                }

            }

        }
return 0;
}
