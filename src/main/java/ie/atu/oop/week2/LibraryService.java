package ie.atu.oop.week2;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private static final int MAX_LOAN_DAYS = 14;
    private final List<Book> books = new ArrayList<Book>();

    public void loanBook(Book book, int loanDays){
        if (book == null) {
            throw new IllegalArgumentException("Book is null");
        }
        if (loanDays < 1 || loanDays > MAX_LOAN_DAYS) {
            throw new IllegalArgumentException("Loan Days must be between 1 and 14");
        }
        book.BorrowBook();

    }
    public void ReturnBook(Book book){
        if (book == null) {
            throw new IllegalArgumentException("Book is null");
        }
        book.ReturnBook();
    }
    public void addBook(Book book){
        if (book == null) {
            throw new IllegalArgumentException("Book is null");
        }
        books.add(book);
    }
}
