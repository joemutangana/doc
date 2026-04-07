#include<stdio.h>
#include<string.h>

int main(){
    //int myNumbers[]={25, 50, 75, 100};

    // // myNumbers[0]=33;
    // // printf("%d", myNumbers[0]);

    // for(int i=0; i< 4; i++){
    //     printf("%d\n", myNumbers[i]);
    // }

    //char greetings[]= "Hello world!";
    //greetings[0]='J';

    //char greetings[] = {'H', 'e', 'l', 'l', ' ', 'o', 'W', 'o', 'r','l','d','!','\0'};
    //char greetings2[]= "Hello world!";
    //printf("%lu\n", sizeof(greetings));
    //printf("%lu\n", sizeof(greetings2));

    //char langs[10][15]={
    //"PYTHON", "JAVASCRIPT","PHP","NODE JS","HTML","KOTLIN","C++","REACT JS","RUST","VBSCRIPT"};

    //for(int i=0; i<10; i++){
    //     printf("%d) %s\n",i+1, langs[i]);
    //}



    //char str1[]= "Hello";
    //char str2[]= "Hello";
    //char str3[]= "Hi";

    //printf("%d\n", strcmp(str1, str2));
    //printf("%d\n", strcmp(str3, str1));

    //Pointers

    //int myNumbers[4]={25, 50, 75, 100};
    //int i;
    //printf("%p\n", myNumbers);
    //printf("%p\n", &myNumbers[0]);
    //printf("%d\n", *myNumbers);
    //printf("%d\n", *(myNumbers + 2));

    //for(i=0; i<4; i++){
     //   printf("%p\n", &myNumbers[i]);
    //}

    int myAge=43;
    int* ptr = &myAge;

    printf("%d\n", myAge);
    printf("%p\n", &myAge);
    printf("%p\n", ptr);

    return 0;
}
