package ie.atu.oop.week2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int loanDays = 15;
        Book book = new Book("Dune", "Frank Herbert", 412);
        LibraryService service = new LibraryService();
        try {
            service.loanBook(book, loanDays);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(book.getStatus());
    }
}