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
        System.out.println("\n");

        Book secondBook = new Book();
        secondBook.title = "The life and times of thunderbolt";
        secondBook.author = "frank black";
        secondBook.paegcount = 12;
        secondBook.available = true;
        System.out.println("this Book is " + secondBook.title);
        System.out.println("the author of this book is " + secondBook.author);
        System.out.println("the page count of this book is " + secondBook.paegcount);
        System.out.println("the status of this book is " + secondBook.available);
        System.out.println("\n");

    }
}