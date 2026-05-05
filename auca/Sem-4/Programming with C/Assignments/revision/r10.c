#include<stdio.h>

int findMax(int *arr, int size){

    int largeValue= *arr;

    for(int i=0; i<size; i++){
        if(*(arr + i) > largeValue){
            largeValue = *(arr + i);
        }
    }

    return largeValue;
}

int main(){

    int arr[5], n;
    float sum, avg;

    for(int i=0; i<5; i++){
        printf("Enter the element %d: ", i+1);
        scanf("%d", &n);
        sum +=n;
        arr[i] = n;
    }

    avg = sum/5.0;
    int largerValue=arr[0];

    for(int i=0; i<5; i++){
        if(arr[i] > largerValue){
            largerValue = arr[i];
        }
    }

    printf("\n\nLarge value is: %d\n", largerValue);
    printf("Sum: %.2f\n", sum);
    printf("Average: %.2f", avg);

return 0;
}

