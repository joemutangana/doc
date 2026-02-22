#include<stdio.h>
#include<stdlib.h>

int main(){
    // int i=0;

    // while(i < 5){
    //     printf("%d\n", i);
    //     i++;
    // }

    /*int countdown = 3;
    while(countdown > 0) {
        printf("%d\n", countdown);
        countdown--;
    }
    printf("Happy New Year!\n");*/

    int i=0;
    while (i <= 10){
        
        if(i==8){
            i+=2;
            continue;
        }
        
        printf("%d\n", i);
        i+=2;
    }



    return 0;
}