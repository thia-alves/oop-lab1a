package ie.atu.oop.week2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book FIRST = new Book("Dune", "Frank Herbert", 412);
        Book SECOND = new Book("De", "Fnk Hrt", 42);
        LibraryService libraryService = new LibraryService();

        libraryService.addBook(FIRST);
        libraryService.addBook(SECOND);

        System.out.println("we have " + libraryService.getBookCount() + " books");

        for (Book book : libraryService.getallBooks())
        {
            System.out.println(book.getTitle());
        }
        Book found = libraryService.findBookByTitle("Dune");

        if (found != null) {
            System.out.println("found " + found.getTitle());
        }

        Book Missing = libraryService.findBookByTitle("De");

        if (Missing != null) {
            System.out.println("Missing " + Missing.getTitle());
        }
    }
}