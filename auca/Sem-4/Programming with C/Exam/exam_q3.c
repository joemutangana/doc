#include<stdio.h>

//Function to check if number is prime number
int isPrime(int n){


    int check=1; //Assume that number is prime

    //for loop to check if number is greater or equal to 4
    for(int i=2; i*i <=n; i++){

        //Condition to check if n % i equal o to negate that number is prime number if is true
        if(n%i==0){
            check=0;
        }
    }
return check; //Return 1 if is prime number or 0 if not prime number
}


//function to return n factorial using recursion
int factorial(int n){


    if(n ==0){
        return 1;
    }


return n * factorial(n-1); //Function calling it's self
}


//Function to get fibonacci sequence from n
int fibonacci(int n){

    //Declare initial values to variables
    int start=0, second=1, next;

    //For loop to traverse from 0 to n
    for(int i=0; i<=n; i++){

        //Display the start
        printf("%d, ", start);
        next = start + second;
        start = second;
        second = next;
    }

}

//Function to calculate the power to the number
int power(int n, int exp){

    int result=n; //Assume that n is powered by 1

    //Check if Exponential is greater than 1
    if(exp > 1){
        //user for look to multiply n to n until to exp

        for(int i=2; i<=exp; i++){
            result *=n; //update result to times n
        }
    }


  return result; //Return result

}
int main(){

    //Declare the variables
    int n, exp;


    //prompt the user to enter numbers
    printf("Enter the number: ");
    scanf("%d", &n);
    printf("Enter the number to power on %d: ", n);
    scanf("%d", &exp);


    //Check if n is gret
    if(n >=0){
            //Call functions and display output
    printf("\n\n====Result====\n\n");
    printf("Is %d Prime Number?: %d\n", n, isPrime(n)); //Call isprime() function
    printf("%d Factorial: %d\n",n, factorial(n)); //Call factorial() Function
    printf("Fibonacci sequence from 0 to %d is: ", n);
    fibonacci(n);// Call fibonacci function



    }
    else{
        printf("\n\nFunctions(primeNumber, factorial, fibonacci)  can not be called on negative number\n");
    }

    printf("\n%d Power %d : %d\n",n,exp, power(n, exp)); //Call Power function
    printf("\n\n");



return 0;
}
