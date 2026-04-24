#include<stdio.h>
#include<conio.h>

struct TEST{
    int x, y;

};

int main(){

struct TEST t1 = {0,1};

//Accessing members ot TEST t1

t1.x = 20;
printf("X = %d, y = %d", t1.x, t1.y);
getch();

}
