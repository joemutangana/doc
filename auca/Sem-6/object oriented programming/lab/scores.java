import java.util.Scanner;

class scores{
    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);

        
        int scores[]= new int[5];

        for(int i = 0; i<5; i++){
            System.out.println("Enter score :" + (i+1));
            int score = myInput.nextInt();
            scores[i] = score;

        }

        int maxScore = scores[0];
        float minScore = scores[0];
        for(int i = 0; i< 5; i++){
            if(scores[i] > maxScore){
                maxScore = scores[i];
            }
            else if(scores[i] < minScore){
                minScore = scores[i];
            }
        }
        System.out.println("Maximum score is: " + maxScore);
        System.out.println("Minimum score is: " + minScore);
    }

}