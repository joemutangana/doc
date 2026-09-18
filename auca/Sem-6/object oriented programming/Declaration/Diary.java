package Declaration;

public class Diary {
    public static void main(String[] args) {
        for(int week = 1; week <=5; week ++){
            System.out.println(" Week"+week);
            for(int day=1; day <=7; day++){
                System.out.print(" Day"+day);
                for(int item=1; item <=3; item++){
                    System.out.print(" Item "+item);
                }
                System.out.println("");
            }
            System.out.println("\n");
        }
    }
    
}
