/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {

    public static final int MAX_BOOKS_IN_LIBRARY = 10;
    public Book[] currentlyAvailableBooks;


    public Library() {
        this.currentlyAvailableBooks = new Book[MAX_BOOKS_IN_LIBRARY];
        for (int libraryIndex = 0; libraryIndex < MAX_BOOKS_IN_LIBRARY; libraryIndex++) {
            this.currentlyAvailableBooks[libraryIndex] = new Book();
        }
    }


    public Library(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }
}
