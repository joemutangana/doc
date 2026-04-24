#include<stdio.h>

int main(){

    int daily_sales_figures[7],above_average[7], sale_figure;
    int max_sale, min_sale, count=0, max_day=1, min_day=1;
    char *classification;
    float average,total_sales = 0;

    for(int i=0; i < 7; i++){

        printf("Enter sales figures for day %d: ", i+1);
        scanf("%d", &sale_figure);

        daily_sales_figures[i]=sale_figure;
        total_sales +=sale_figure;


    }

    average = total_sales/7;
    max_sale=daily_sales_figures[0];
    min_sale=daily_sales_figures[0];

    printf("\n\n");
    for(int j=0; j<7; j++){


        if(daily_sales_figures[j] > max_sale){

            max_day=j+1;
            max_sale = daily_sales_figures[j];


        }

        if(daily_sales_figures[j] < min_sale){
            min_day=j+1;
            min_sale=daily_sales_figures[j];

        }
         if(daily_sales_figures[j] > average){
            above_average[count]=daily_sales_figures[j];
            count ++;
            printf("Day %d: %d (High)\n", j+1, daily_sales_figures[j]);

        }
        else if(daily_sales_figures[j] == average ){
            classification="Average";
            printf("Day %d: %d (Average)\n", j+1, daily_sales_figures[j]);
        }
        else{
            printf("Day %d: %d (Low)\n", j+1, daily_sales_figures[j]);
        }

    }


    printf("\n\nTotal Sales :%.0f\n", total_sales);
    printf("Daily average sales :%.2f\n", average);
    printf("Maximum sale: (Day: %d, Value: %d)\n",max_day,max_sale );
    printf("Minimum sale: (Day: %d, Value: %d)\n",min_day, min_sale );
    printf("Day's sale above average :%d\n", count);
    printf("Sales above average :[");

    for(int above=0; above < count; above++){
        printf("%d, ", above_average[above]);
    }

    printf("]\n");
    //7,6,5,4,3,2,1
     for(int s=0; s<7; s++){
            int swapped=0;
            for(int n=0; n<6-s; n++){
                if(daily_sales_figures[n] > daily_sales_figures[n+1]){
                        int swap=daily_sales_figures[n];
                        daily_sales_figures[n] = daily_sales_figures[n+1];
                        daily_sales_figures[n+1]=swap;
                        swapped=1;
            }



            }
            if(swapped==0){
                break;
            }

    }
    printf("Bubble Sort ascending order :[");
    for(int k=0; k<7; k++){
        printf("%d, ", daily_sales_figures[k]);
    }

    printf("]\n\n");
return 0;
}
