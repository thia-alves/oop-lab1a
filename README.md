## oop lab1: encasulation
Name: Thiago Alves \
student ID: G00478189
## Run
Open project in IntelliJ with JKD 21+ and run Main.Java

## Object model
Book defines \
private String title; \
private String author; \
private int pagecount; \
private void borrowBook borrow book changes availability from true to false showing the book has been borrowed \
first its a copy of the book class that contains four fields \
second and is the same as first

public enum BookStatus is where AVALIBILITY AND ON_LOAN are
public class LibraryService
private static final int MAX_LOAN_DAYS = 14;
public void loanBook
public void ReturnBook
book.ReturnBook();
private  BookStatus status;



1
2 title, author,and pageCount are final because they shouldnt change after the book is created
3 status isnt final because it changes between AVAILABLE and ON_LOAN
4 BorrowBook and returnBoo protect the books status
5  book
    Checks that title is not null or blank.
    Checks that author is not null or blank.
    Checks that pagecount is greater than 0.
    Checks that the book is not already ON_LOAN before borrowing.
    Checks that the book is not already AVAILABLE before returning.
libraryservices
    Checks that the Book object is not null.
    Checks that loanDays is between 1 and 14.
    Calls BorrowBook() after the loan checks pass.

6 A rejected loan happens when the loan is outside 1  to 14 days or the book is already on loan   A rejected return happens when the book is already AVAILABLE.
7 it goes through beacuse 7 is greater than 1 while day 15 does not go through beacuse 15 is bigger than 14

## maven

[book-tracker1-1.0-SNAPSHOT.jar](target/book-tracker1-1.0-SNAPSHOT.jar)


## lab 4
library service now has a List<book> 
List<bok> is a list made to store book objects
you can still add and remove books, it makes it so books cannot go to a diffrent list
the loop goes through every book in the list
searches for a book by its title, if exsists returns that book if it doesnt returns null 
removebook needs to find the book and it uses findbookbytitle if book is found it removes it