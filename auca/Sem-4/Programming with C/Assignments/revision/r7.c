#include<stdio.h>
int main(){

    int count=0;
    char ch[5];
    printf("Enter a character: ");
    scanf(" %[^\n]s", ch);

    for(int i=0; ch[i] !='\0'; i++){
            if(ch[i] >='a' && ch[i] <='z'){
                ch[i] = ch[i] - 32;
            if( ch[i] !=' ' && ch[i] !='\n' && (i==0 || ch[i-1]==" ")){
                count++;
            }
    }


    }


    printf("%s", ch);
    printf("\n%d words.", count);
return 0;
}
