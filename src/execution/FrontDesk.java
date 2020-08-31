/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int NEW_BOOK = 1;
    private static final int LAST_BOOK = 2;
    private static final int MY_ISSUED_BOOK = 3;
    private static final int EXIT = 4;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clientInput;
        Student myInfo = new Student();

        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("how may I help you today?");
            System.out.println("1. Issue a new book for me: ");
            System.out.println("2. Return a previously issued1 book by me: ");
            System.out.println("3. Show my issued book: ");
            System.out.println("4. Exit: ");
            clientInput = scanner.nextInt();

            switch(clientInput){
                case  NEW_BOOK:
                    System.out.println("Enter your name: ");
                    scanner.nextLine();
                    String FirstName = scanner.nextLine();
                    String MiddleName = scanner.nextLine();
                    String LAstName = scanner.nextLine();
                    System.out.println("Enter university roll no: ");
                    long studentRollNo = scanner.nextLong();
                    myInfo.nameOfTheStudent(FirstName, MiddleName,LAstName);
                    myInfo.universityRollNumber(studentRollNo);
                    System.out.println("issue a new book");
                    myInfo.booksAvailable();
                    break;

                case LAST_BOOK:
                    System.out.println("Enter your name: ");
                    scanner.nextLine();
                    String FirstName1 = scanner.nextLine();
                    String MiddleName1 = scanner.nextLine();
                    String LAstName1 = scanner.nextLine();
                    System.out.println("Enter university roll no: ");
                    long studentRollNo1 = scanner.nextLong();
                    myInfo.nameOfTheStudent(FirstName1, MiddleName1,LAstName1);
                    myInfo.universityRollNumber(studentRollNo1);
                    myInfo.booksAvailable();
                    break;

                case MY_ISSUED_BOOK:
                    System.out.println("Enter your name: ");
                    scanner.nextLine();
                    String FirstName2 = scanner.nextLine();
                    String MiddleName2 = scanner.nextLine();
                    String LAstName2 = scanner.nextLine();
                    System.out.println("Enter university roll no: ");
                    long studentRollNo2 = scanner.nextLong();
                    myInfo.nameOfTheStudent(FirstName2, MiddleName2,LAstName2);
                    myInfo.universityRollNumber(studentRollNo2);
                    System.out.println("numberOfBooksIssuedByStudent: ");
                    int  numberOfBooksIssued = scanner.nextInt();
                    myInfo.numberOfBooksIssuedByStudent(numberOfBooksIssued);
                    myInfo.booksAvailable();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
            }while (clientInput != EXIT);
        scanner.close();
    }

}




