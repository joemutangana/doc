package lms;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Book attributes

        int bookId;
        String bookTitle;
        String author;
        int publicationYear;
        int availableCopies;

        // mmember attributes
        int memberId;
        String memberName;
        String memberEmail;
        int memberAge;
        String membershipType;


        //Librarian atrributes
        int librarianId;
        String librarianName;
        String librarianEmail;
        int yearsOfExperience;
        String librarySection;

        System.out.print("\n=============Enter book details==========\n");
        System.out.print("enter book id: ");
        readInt(sc);
        bookId = sc.nextInt();
        
        System.out.print("enter published year: ");
        readInt(sc);
        publicationYear = sc.nextInt();
        System.out.print("enter avalable copies: ");
        readInt(sc);
        availableCopies = sc.nextInt();
        sc.nextLine();
        System.out.print("enter book title: ");
        bookTitle = sc.nextLine();
        System.out.print("enter book author: ");
        author = sc.nextLine();
        Book book = new Book(bookId, bookTitle, author, publicationYear, availableCopies);
        


    
        System.out.print("\n============= Enter member details ==========\n");
        System.out.print("enter member id: ");
        readInt(sc);
        memberId = sc.nextInt();
        System.out.print("enter member age: ");
        readInt(sc);
        memberAge = sc.nextInt();
        sc.nextLine();
        System.out.print("enter member name: ");
        memberName = sc.nextLine();
        System.out.print("enter member email: ");
        memberEmail = sc.nextLine();
        System.out.print("enter membership: ");
        membershipType = sc.nextLine();
        
        Member member = new Member(memberId, memberName, memberEmail, memberAge, membershipType);


    
        System.out.print("\n============= Enter librarian  details ==========\n");
        System.out.print("enter librarian id: ");
        readInt(sc);
        librarianId = sc.nextInt();
        System.out.print("enter years of experience: ");
        readInt(sc);
        yearsOfExperience = sc.nextInt();
        sc.nextLine();
        System.out.print("enter librarian name: ");
        librarianName = sc.nextLine();
        System.out.print("enter librarian email: ");
        librarianEmail = sc.nextLine();
        System.out.print("enter section: ");
        librarySection = sc.nextLine();
        

        Librarian lib = new Librarian(librarianId, librarianName, librarianEmail, librarianId, librarySection);

        System.out.print("\n============= Enter Borrwing  details ==========\n");
        System.out.print("enter borrowing id: ");
        readInt(sc);
        int borrowingId = sc.nextInt();
        System.out.print("How many days of borrowing: ");
        readInt(sc);
        int borrowingDays = sc.nextInt();

        Borrowing borrowing = new Borrowing(book, member, lib, borrowingId, borrowingDays);

        System.out.print("\n=================Borrowing Information==================");
        System.out.print(borrowing);
   
    }

    public static void readInt(Scanner sc){
        
       
            while(!sc.hasNextInt()){
            System.out.print("Invalid value, Only integers allowed! Try again: ");
            sc.nextLine();
            
            }
            

        
        
       
        
    }
}