/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

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

    public String getNameOfTheBook() {
        return bookName;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.bookName = nameOfTheBook;
    }

    public String getNameOfTheAuthorOfTheBook() {
        return authorOfBook;
    }

    public void setNameOfTheAuthorOfTheBook(String nameOfTheAuthorOfTheBook) {
        this.authorOfBook = nameOfTheAuthorOfTheBook;
    }

    public String getThirteenDigitISBNNumberOfTheBook() {
        return theISBNNumber;
    }

    public void setThirteenDigitISBNNumberOfTheBook(String thirteenDigitISBNNumberOfTheBook) {
        this.theISBNNumber = thirteenDigitISBNNumberOfTheBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName) &&
                authorOfBook.equals(book.authorOfBook) &&
                theISBNNumber.equals(book.theISBNNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorOfBook, theISBNNumber);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorOfBook='" + authorOfBook + '\'' +
                ", theISBNNumber='" + theISBNNumber + '\'' +
                '}';
    }
}

