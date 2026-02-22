#include <iostream>
using namespace std;
int main(){

    int array[5], number, i, max_value, *ptr_number, *ptr_max_value;
    ptr_number = &number;
    ptr_max_value = &max_value;
    for (i=0; i<5; i++){
        cout<<"Enter number "<< i+1 <<": ";
        cin>> *ptr_number;
        array[i] = *ptr_number;

    }
    cout<<number<<endl;

    *ptr_max_value = array[0];
    for (i=0; i<5; i++){
        if (array[i] > *ptr_max_value){
            *ptr_max_value = array[i];
        }
    }
    cout<<"The maximum value is "<< *ptr_max_value <<endl;
    
    
    
    return 0;
}