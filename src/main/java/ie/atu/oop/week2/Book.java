package ie.atu.oop.week2;

public class Book {
    public String title;
    public String author;
    public int pagecount;
    public boolean available = true;





    public void displayDetails()
    {
        System.out.println("The title is: " + title);
        System.out.println("The author is: " + author);
        System.out.println("The pagecount is: " + pagecount);
        System.out.println("The available is: " + available);
        System.out.println("\n");
    }

    public void borrowBook()
    {
       if (available)
       {
           available = false;
           System.out.println(title + " borrowed successfully");
       }
       else
       {
           System.out.println(title + " not available");
       }
    }

}

