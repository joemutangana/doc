#include<stdio.h>
int main(){

    int total_classes, attended_classes,message;
    float attendance_percent;
    char *classfication;

    printf("Enter total classes :");
    scanf("\n%d", &total_classes);
    while( total_classes <0){
        printf("Total classes can not be less than 0.\n\nEnter total classes :");
        scanf("\n%d", &total_classes);
    }


    do{

        printf("Enter attended classes :");
        scanf("\n%d", &attended_classes);

        if (attended_classes > total_classes){
            printf("\n\nError: Attended classes can not be more than total classes.\n\n");
        }

        else{

            if(attended_classes > 0 )
            {
                attendance_percent = ((float)attended_classes/total_classes)*100;

                if(attendance_percent >=90){
                    classfication="Excellent";
                    message=1;
                }
                else if(attendance_percent >=75 ){
                    classfication="Satisfactory";
                    message=2;
                }
                else if(attendance_percent >=60 ){
                    classfication="Low";
                    message=3;
                }
                else{
                    classfication="Critical";
                    message=4;
                }


            printf("\n\nAttendance percent: %.2f\n%s\n",attendance_percent,classfication);
            switch (message){
                case 1:
                    printf("Keep it up!");
                    break;
                case 2:
                    printf("Maintain your attendance.");
                    break;
                case 3:
                    printf("Attendance improvement required.");
                     break;
                case 4:
                    printf("You may be barred from exams.");
                     break;
            }

            printf("\n\n");
            }
        }

    }



    while(attended_classes != -1);
    printf("\n\nBye!!!\n\n");
return 0;
}
