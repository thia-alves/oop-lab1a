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


## lab 5
a throw statment inside the book shows that an error or invalid thing happened while a catch block handles the error thrown by another method.
Path.of("data", "books.csv") makes a path showing the location of the cvs file in the data directory, getparent() gives the parent directory and
readalllines() reads all the lines in the csv.
lab 5 adds csv and exception handling which manages errors and invalid operations and stuff, csv lets bookj info be saved to a file and used again.
unchecked NumberFormatException this happens when a string cant be made into a number java doesnt need it to be caught  or declared with throws.
checked IOException this happens when the output or input operatuion fails.
path means the location of the file.
files means it gives static methods for performing file operations like reading or writing data
1. title 
2. author
3. pagecount
4. status
 eg
 dune,someguy,412,ON_LOAN

