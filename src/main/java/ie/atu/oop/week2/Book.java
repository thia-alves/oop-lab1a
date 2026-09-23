package ie.atu.oop.week2;

public class Book {
    public String title;
    public String author;
    public int paegcount;
    public boolean available = true;

    public void displayDetails() {
        System.out.println("The title is: " + title);
        System.out.println("The author is: " + author);
        System.out.println("The paegcount is: " + paegcount);
        System.out.println("The available is: " + available);
        System.out.println("\n");
    }
}

