package lms;

public class Borrowing{

    private Book book;
    private Member member;
    private Librarian librarian;
    private int borrowingId;
    private int borrowingDays;

    public Borrowing(Book book, Member member, Librarian librarian, int borrowingId, int borrowingDays) {
        this.book = book;
        this.member = member;
        this.librarian = librarian;
        this.borrowingId = borrowingId;
        this.borrowingDays = borrowingDays;
    }

    @Override
    public String toString() {
        return "\n=========Book=========" + book + "\n=========Member=========" + member + "\n=========Librarian========" + librarian + "\n==============\nBorrowingId: "
                + borrowingId + "\nBorrowingDays: " + borrowingDays + "";
    }

    

    





}