#include<stdio.h>
int main(){

    //Declare array and variable
    int arr[10], n, sum=0, largest, smallest;
    float average=0;

    //For loop to get data stored in array
    for(int i=0; i<10; i++){
        printf("Enter the number %d: ", i+1);
        scanf("%d", &n);
        arr[i] = n;

    }

    //calculate the sum by using for loop

    for(int i=0; i<10; i++){
        sum += arr[i];
    }

    //Calculate the average
    average = sum/10.0;

    //Initialize the first element as smallest or largest in array
    largest = arr[0];
    smallest = arr[0];

    //for loop to traverse the array to find largest number and smallest number
    for(int i=1; i<10; i++){
        if(arr[i] > largest){
            largest = arr[i];
        }
        if(arr[i] < smallest){
            smallest = arr[i];
        }
    }




    //Display the output
    printf("\n\n=====Output=====\n\n");
    printf("Sum: %d\n", sum);
    printf("Average: %.2f\n", average);
    printf("Largest: %d\n", largest);
    printf("Smallest: %d\n", smallest);

    //Display array before sorting
    printf("Before sorting: ");
    for(int i=0; i<10; i++){
        printf("%d, ", arr[i]);
    }
    printf("\n");
    //sort array in ascending order
    for(int i=0; i<10; i++){
            int swap, sorted=1;

        for(int j=0; j<10-1-i; j++){
            if(arr[j] > arr[j+1]){
                swap=arr[j];
                arr[j] = arr[j+1];
                arr[j + 1]= swap;
                sorted = 0;
            }

        }

        if(sorted){
            break;
        }

    }

    //Display array after sorting
    printf("After sorting: ");
    for(int i=0; i<10; i++){
        printf("%d, ", arr[i]);
    }
    printf("\n");





return 0;
}
