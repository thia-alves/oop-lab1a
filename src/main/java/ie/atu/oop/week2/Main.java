package ie.atu.oop.week2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("hello OOP");

        Book firstBook = new Book();
        firstBook.title = "dune";
        firstBook.author = "frank herbert";
        firstBook.paegcount = 412;

       firstBook.displayDetails();
        System.out.println("\n");
       firstBook.borrowBook();
        System.out.println("\n");
       firstBook.displayDetails();

        Book secondBook = new Book();
        secondBook.title = "The life and times of thunderbolt";
        secondBook.author = "frank black";
        secondBook.paegcount = 12;
        secondBook.available = true;

       secondBook.displayDetails();

    }
}