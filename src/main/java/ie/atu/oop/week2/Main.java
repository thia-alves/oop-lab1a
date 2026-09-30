package ie.atu.oop.week2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Book FIRST = new Book("Dune", "Frank Herbert", 412);
        Book SECOND = new Book("De", "Fnk Hrt", 42);
        LibraryService libraryService = new LibraryService();

        System.out.println(FIRST.getStatus());
        libraryService.loanBook(FIRST,7);
        System.out.println(FIRST.getStatus());
        libraryService.ReturnBook(FIRST);
        System.out.println(FIRST.getStatus());
        System.out.println(SECOND.getStatus());

        try {
            libraryService.loanBook(FIRST, 15);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(FIRST.getStatus());
    }
}