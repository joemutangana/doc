package lms;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bookId;
        System.out.print("Enter the book id: ");
       
        while(!sc.hasNextInt()){
            System.out.println("Invalid ID");
            sc.nextLine();
            System.out.print("Enter the book id: ");

        }

        bookId = sc.nextInt();

        Book book = new Book(bookId);

        while(!book.setBookID(bookId)){
            System.out.println("Invalid ID");
            System.out.print("Enter the book id: ");
            bookId = sc.nextInt();
        }

        System.out.println("Book ID updated successfully!");
        System.out.println("Current ID is "+ book.getBookId(bookId));



        
    }
}