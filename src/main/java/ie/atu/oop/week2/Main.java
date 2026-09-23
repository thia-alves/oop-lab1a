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

        System.out.println("this Book is " + firstBook.title);
        System.out.println("the author of this book is " + firstBook.author);
        System.out.println("the page count of this book is " + firstBook.paegcount);
        System.out.println("the status of this book is " + firstBook.available);

    }
}