package ie.atu.oop.week2;

public class Book {
    private  final String title;
    private final String author;
    private final int pagecount;
    private  BookStatus status;


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
        this.status = BookStatus.AVAILABLE;
    }

    public BookStatus getStatus() {
        return status;
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
    public void BorrowBook(){
        if (status == BookStatus.ON_LOAN ){
            throw new IllegalStateException("Book is already borrowed");
        }
        status = BookStatus.ON_LOAN;
    }
    public void ReturnBook(){
        if (status == BookStatus.AVAILABLE){
            throw new IllegalStateException("Book is already returned");
        }
        status = BookStatus.AVAILABLE;
    }

    public void remove(Book bookByTitle)
    {

    }
}

