package ie.atu.oop.week2;

public class Book {
    private  String title;
    private String author;
    private int pagecount;

    public Book(String title, String author, int pagecount)
    {
        if (title == null || title.isBlank())
        {
            throw new IllegalArgumentException("title is null or blank");
        }
        if (author == null || author.isBlank()){
            throw new IllegalArgumentException("author is null or blank");
        }
        if (pagecount <= 0)
        {
            throw new IllegalArgumentException("pagecount is negative");
        }

        this.title = title;
        this.author = author;
        this.pagecount = pagecount;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagecount() {
        return pagecount;
    }
}

