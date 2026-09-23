package ie.atu.oop.week2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("hello OOP");

        Book firstBook = createBook("Dune","frank herbert",412);
        Book secondBook = createBook("clean code","robert c",464);
        Book thirdBook = createBook("the c programming language","kerlin and pitchie",274);

       firstBook.displayDetails();
       secondBook.displayDetails();
       thirdBook.displayDetails();

        System.out.println("\n");
       firstBook.borrowBook();
        System.out.println("\n");
       firstBook.displayDetails();




    }
    private static Book createBook(String title, String author, int pageCount)
    {
        Book book = new Book();
        book.title = title;
        book.author = author;
        book.paegcount = pageCount;
        book.available = true;
        return book;
    }
}


