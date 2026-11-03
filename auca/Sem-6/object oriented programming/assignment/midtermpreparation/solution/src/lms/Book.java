package lms;
public class Book{

    private int bookId;
    private String bookTitle;
    private String author;
    private int publicationYear;
    private int availableCopies;
    
    



    public Book(int bookId, String bookTitle, String author, int publicationYear, int availableCopies) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publicationYear = publicationYear;
        this.availableCopies = availableCopies;
    }


    public boolean setBookID(int bookId){
        if(bookId <= 0){
            return false;
        }
        else{
            this.bookId = bookId;
            return true;
        }
    }
    

    public int getBookId(int bookId){
        return bookId;
    }



    @Override
    public String toString() {
        return "\nBookId: " + bookId + "\nBookTitle: " + bookTitle + "\nAuthor: " + author + "\nPublicationYear: "
                + publicationYear + "\nAvailableCopies: " + availableCopies + "\n";
    }

   






}