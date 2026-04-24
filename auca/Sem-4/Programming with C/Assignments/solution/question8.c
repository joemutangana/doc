#include<stdio.h>
#include<ctype.h>
int main(){
    char sentence[100];
    int option, empty;

    do{
        empty = 1;
        printf("Enter a sentence: ");
        fgets(sentence, sizeof(sentence), stdin);
        for(int i=0; sentence[i] !='\0'; i++){
            sentence[i] = tolower(sentence[i]);

            if(sentence[i] != ' ' && sentence[i] !='\n'){
                empty = 0;
            }
        }


    }

    while(empty==1);

    do{
        printf("\n\n\n");
        printf("1. Count the total number of characters\n");
        printf("2. Count the number of vowels and consonants\n");
        printf("3. Count the number of words\n");
        printf("4. Reverse the string\n");
        printf("5. Check if the string is palindrome\n");
        printf("6. Convert the string to uppercase/lowercase\n");
        printf("7. Exit\n\n");
        printf("Enter option: ");
        scanf("%d", &option);

        printf("\n");
        int count = 0, vowelCount=0, consonantCount=0, wordCount=0;

        for(int j=0; sentence[j] !='\0'; j++){
            char c = sentence[j];

            if (c != '\n') {
                count++;
            }


            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                vowelCount++;
            }


            if (isalpha(c) && !(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')) {
                consonantCount++;
            }


            if (c != ' ' && c != '\n' && (j == 0 || sentence[j-1] == ' ')) {
                wordCount++;
            }
        }


        switch(option){

            case 1:
            printf("Total characters: %d", count);
            break;

            case 2:
                printf("Total vowels: %d", vowelCount);
                printf("\nTotal consonants: %d", consonantCount);
                break;
            case 3:
                printf("Total words: %d", wordCount);
                break;
            case 4:{
                int lenght=0;
                while(sentence[lenght] !='\0'){
                    lenght++;
                }

                int reversed[100];
                printf("Reversed: \n");
                for(int i=lenght - 1; i>=0; i--){
                    printf("%c",sentence[i]);

                }
                break;
            }
            case 5:
                printf("This feature has not completed yet.");
                break;

            case 6:{
                printf("1. UpperCase\n2. LowerCase\n\nEnter option: ");
                scanf("%d", &option);
                if(option == 1){
                    for(int i=0; sentence[i] !='\0'; i++){
                        sentence[i]=toupper(sentence[i]);
                    }
                    printf("\nUppercase: %s", sentence);
                }
                else{
                    for(int i=0; sentence[i] !='\0'; i++){
                        sentence[i]=tolower(sentence[i]);
                    }
                    printf("\nLowercase: %s", sentence);

                }
                break;
            }
            case 7:
                printf("Exiting...\n\n");
                break;
        }

    }

    while(option != 7);




return 0;
}
