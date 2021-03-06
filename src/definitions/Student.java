/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

public class Student {

    Book[] nameOfTheBookIssueByStudent;

    public Student() {
        this.nameOfTheBookIssueByStudent = new Book[5];
        for (int i = 0; i < nameOfTheBookIssueByStudent.length; i++) {
            nameOfTheBookIssueByStudent[i] = new Book("Book Number: " + (i + 1));
        }
    }

    public Student(Book[] nameOfTheBookIssueByStudent) {
        this.nameOfTheBookIssueByStudent = nameOfTheBookIssueByStudent;
    }

    public Book[] getNameOfTheBookIssueByStudent() {
        return nameOfTheBookIssueByStudent.clone();
    }

    public void setNameOfTheBookIssueByTheStudent(Book[] nameOfTheBookIssueByStudent) {
        this.nameOfTheBookIssueByStudent = nameOfTheBookIssueByStudent;
    }
    public void nameOfTheStudent(String firstName, String middleName, String lastName) {
        System.out.println("Name of the student " + firstName + " " + middleName + " " + lastName);
    }

    public void universityRollNumber(long number) {
        System.out.println("University Roll NUmber: " + number);
    }

    public void numberOfBooksIssuedByStudent(int number) {
        System.out.println("Number Of Books Issued By Student" + number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Arrays.equals(nameOfTheBookIssueByStudent, student.nameOfTheBookIssueByStudent);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(nameOfTheBookIssueByStudent);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameOfTheBookIssueByStudent=" + Arrays.toString(nameOfTheBookIssueByStudent) +
                '}';
    }

    public void booksAvailable() {
        for (Book books : nameOfTheBookIssueByStudent) {
            System.out.println(books);
        }
    }
}






