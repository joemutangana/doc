#include <iostream>
using namespace std;

float calculator(float *ptra, float *ptrb, char op){

    if (op == '+'){
        return *ptra + *ptrb;
    }
    else if (op == '-'){
        return *ptra - *ptrb;
    }
    else if (op == '*')
    {
        return *ptra * *ptrb;
    }
    else if (op == '/')
    {
        if (*ptrb == 0){
            cout<<"Error: division by zero."<<endl;
        }
        else {
            return *ptra / *ptrb;
        }
    }
    else{
        cout<<"Invalid Option"<<endl;
        return 0;
    }
}

int main(){

    float c, d, result;
    
    char operator_choice;
    cout<<"Enter two numbers: ";
    cin>>c;
    cin>>d;
    cout<<"Choose operator: + - * / : ";
    cin>> operator_choice;
    result = calculator(&c, &d, operator_choice);
    cout<<c <<" "<<operator_choice<< " " <<d<<" = " <<result<<endl;
    
    return 0;
}