#include<stdio.h>

//function to find maximum value using pointer

int findMax(int *arr, int size){
    int maxValue=*arr; //Initialize max vale as first element

    //For loop to traverse in array
    for(int i=0; i<size; i++){
            //check if next element is bigger than previous element
            if(*(arr + i )> maxValue){
                maxValue= *(arr+i);
            }

    }


return maxValue; //Return large value
}

////Function to reverse the array in places
//int reverseArray(int *arr, int size){
//
//    int *start=arr;
//    int end=size-1;
//
//    while(start < end){
//        int swap = *start;
//        *start = end;
//        end = swap;
//
//        start++;
//        end--;
//    }
//
//
//
//
//}

void reverseArray(int *arr, int size){

    int *start = arr;
    int *end = arr + size - 1;

    while(start < end){
        int temp = *start;
        *start = *end;
        *end = temp;

        start++;
        end--;
    }
}

//function to traverse array using pointer, compute sum and average
int traverseArray(int *arr, int size){

    //declare variables
    int sum=0;
    float average;

    //for loop to traverse in array
    for (int i=0; i<size; i++){
        sum += *(arr + i); //calcuate the sum
    }

    average = sum/size;

    //Display output
    printf("Sum: %d\n", sum);
    printf("Average: %.2f\n", average);
}

int main(){

    //declare arr with size of 5 and n
    int arr[5], n, sum=0;
    float average=0.0;

    //For loop to get five integer numbers
    for(int i=0; i<5; i++){
        printf("Enter number %d: ", i+1);
        scanf("%d", &n);
        arr[i] = n;//store number in arr index i

    }


    //Print the output
    printf("\n\n===Result====\n\n");
    traverseArray(arr, 5);// call traverseArray() function
    printf("Maximum Value is: %d\n", findMax(arr, 5)); //Call findMax() function
    printf("Original array: ");

    //for loop to print original array
    for(int i=0; i<5; i++){
        printf("%d, ", arr[i]);
    }
    printf("\n");

    reverseArray(arr, 5);// Call function to reverse array in places
    printf("Reversed array: ");
    for(int i=0; i<5; i++){
        printf("%d, ", arr[i]);
    }
    printf("\n\n");





return 0;
}
