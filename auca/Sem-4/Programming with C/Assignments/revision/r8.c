#include<stdio.h>

int isPrime(int n){
    int check=1;

    for(int i=2; i*i<=n; i++){
        if(n%i==0){
            check = 0;
        }
    }

    return check;
    }



int factorial(int n){
    if(n<=0){
        return 1;
    }
    return n * factorial(n-1);

}

int power(int base, int exp){

    int result = base;
    if(exp >1){
        for(int i=2; i<=exp; i++){
            result = result * result;
        }
    }

    return result;


}

int fibonacci(int n){

    int start=0, second=1, next;

    for(int i=0; i<=n; i++){
        printf("%d, ", start);
        next=start + second;
        start = second;
        second = next;

    }
}



int main(){

    int n, exp;
    printf("Enter the number: ");
    scanf("%d", &n);
    printf("The number to power on %d: ", n);
    scanf("%d", &exp);
    printf("\nIs prime number?: %d", isPrime(n));
    printf("\nFactorial of %d is: %d",n, factorial(n));
    printf("\n%d power %d is: %d", n,exp, power(n,exp));
    printf("\nFibonacci Sequence to %d: ", n);
    fibonacci(n);

return 0;
}
