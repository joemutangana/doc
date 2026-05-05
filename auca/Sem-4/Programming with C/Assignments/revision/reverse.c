#include<stdio.h>
int main(){


    char name[50];
    printf("Enter your name: ");
    scanf(" %[^\n]", name);
    int count=0;
    for(int i=0; name[i]!='\0'; i++){
        count++;
    }

    printf("%d", count);

    for(count-1; count>=0; count--){
        printf("%c", name[count]);
    }


return 0;

}
