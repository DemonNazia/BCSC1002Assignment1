/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String authorOfBook;
    private String theISBNNumber;

    public Book() {
        this.bookName = "null";
        this.authorOfBook = "null";
        this.theISBNNumber = "null";
    }

    public Book(String nameOfTheBook, String nameOfTheAuthorOfTheBook, String thirteenDigitISBNNumberOfTheBook){
        this.bookName = nameOfTheBook;
        this.authorOfBook = nameOfTheAuthorOfTheBook;
        this.theISBNNumber = thirteenDigitISBNNumberOfTheBook;
    }


}

