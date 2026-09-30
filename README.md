## oop lab1: Java Book Tracker
Name: Thiago Alves \
student ID: G00478189
## Run
Open project in IntelliJ with JKD 21+ and run Main.Java

## Object model
Book defines \
public String title; \
public String author; \
public int pagecount; \
public boolean available; \
public void displayDetails displays all the details of the book in a readable manner\
public void borrowBook borrow book changes availability from true to false showing the book has been borrowed \
private static Book createBook makes a new book and sets its values for title author pagecount and avalibility, and its outside of main because Java doesn't allow you to define a normal method inside another method. \
firstBook its a copy of the book class that contains four fields \
secondBook and thirdBook are the same as firstBook


## Verification 
it first prints out Hello OOP at the top \
createBook adds the titles author pagecount and avaliblity to firstbook second and third \
firstBook.displaydetails then displays the title author is its avalible and pagecount, and secondBook and thirdBook does the same \
firstBook.borrowBook chnages the avalibility of firstBook to false and then displaydetails used again will show that avalibility is false.
