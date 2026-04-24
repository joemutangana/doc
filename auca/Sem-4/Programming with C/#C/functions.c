#include<stdio.h>

//void myFunction(){
//    printf("I just got executed!\n");
//}

//void calculateSum(){
//    int x=5;
//    int y=10;
//    int sum=x +y;
//    printf("The sum of x + y is: %d", sum);
//}

//void myFunction(char name[], int age){
//    printf("Hello %s. You are %d years old.\n", name, age);
//
//}

//void myFunction(int myNumbers[5]){
//    for(int i=0; i<5; i++){
//        printf("%d\n", myNumbers[i]);
//    }
//}

//int myFunction(int x){
//    return 5 + x;
//}

int calculateSum(int x, int y){
    return x + y;
}

int main(){

//    myFunction();//call the myFunction
//    calculateSum();//call calculateSum function
//    myFunction("Liam", 3);
//    myFunction("Jenny", 14);
//    myFunction("Anja", 30);

//int myNumbers[5]={10,20,30,40,50};
//myFunction(myNumbers);

//printf("Result is: %d", myFunction(3));

int resultArr[6];
resultArr[0] = calculateSum(5,3);
resultArr[1] = calculateSum(8,2);
resultArr[2] = calculateSum(15,15);
resultArr[3] = calculateSum(9,1);
resultArr[4] = calculateSum(7,7);
resultArr[5] = calculateSum(1,1);

for(int i=0; i<6; i++){
    printf("Result%d is = %2d\n", i+1, resultArr[i]);
}

return 0;
}
