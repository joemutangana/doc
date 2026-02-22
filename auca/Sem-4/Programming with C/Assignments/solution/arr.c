#include<stdio.h>
int main(){

    int a, choice,j=0;
    printf("Enter array size :");
    scanf("%d", &a);
    int arr[a],sum=0;

    for (int i=0; i<a; i++){
        printf("Enter number %d: ", (i+1));
        scanf("%d", &arr[i]);
        sum +=arr[i];
        printf("\n");
        
    }

    do{
        
        
        printf("\nCurrent value: %d \n1.Next\n2.Back\n3.Quit\nEnter option :> ", arr[j]);
        scanf("%d", &choice);

        if (choice==1){
            if (j<a - 1){
                j++;
                printf("\nResult :%d\n", arr[j]);
            }
            else{
                printf("\nAlready at last element\n");
            }
                  
        }
        else if(choice == 2){
            if(j>0){
                j--;
                printf("\nResult :%d\n", arr[j]);
            }
            else{
                printf("\nAlready at first element.\n");
                
            }     
        }

        else if (choice == 3){
            printf("Exiting...\n");
        }
        else {
            printf("Invalid choice. Try again.\n");
        }
        
        
        
        
        
    }

    while(choice !=3 );
    return 0;
}