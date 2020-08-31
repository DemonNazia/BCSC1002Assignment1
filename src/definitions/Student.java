/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {

    public static final int MAX_BOOK_ISSUED = 5;
    private String studentName;
    private long studentUniversityRollNumber;
    private int numberOfBooksIssued;
    private Book[] namesOfTheBooksIssued;

    public Student() {
        this.studentName = "null";
        this.studentUniversityRollNumber = 0L;
        this.numberOfBooksIssued = 0;
        this.namesOfTheBooksIssued = new Book[MAX_BOOK_ISSUED];
        for (int i = 0; i < MAX_BOOK_ISSUED; i++) {
            this.namesOfTheBooksIssued[i] = new Book();
        }
    }

    public Student(String studentName,
                   long studentUniversityRollNumber,
                   int numberOfBooksIssued,
                   Book[] namesOfTheBooksIssued){
        this.studentName = studentName;
        this.studentUniversityRollNumber = studentUniversityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.namesOfTheBooksIssued = namesOfTheBooksIssued;
    }

}
