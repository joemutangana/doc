package lms;
public class Book{

    private int bookId;
    private String bookTitle;
    private String author;
    private int publicationYear;
    private int availableCopies;
    
    public Book(int bookId){
        this.bookId = bookId;
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
        return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", author=" + author + ", publicationYear="
                + publicationYear + ", availableCopies=" + availableCopies + "]";
    }






}