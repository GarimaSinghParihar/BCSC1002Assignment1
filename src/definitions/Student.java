/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String[] nameOfStudentFormatFirstMiddleLast;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] nameOfBooksIssued;

    public Student(String nameOfTheStudent, long universityRollNo, int numberOfBooksIssued) {
        this.nameOfStudentFormatFirstMiddleLast = nameOfTheStudent.split(" ");
        this.universityRollNumber = universityRollNo;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.nameOfBooksIssued = new Book[numberOfBooksIssued];
    }

    /**
     * this method return the name of the student (first name, middle name, last name- all String).
     *
     * @return the name of the student (first name, middle name, last name- all String).
     */

    public String[] getNameOfStudentFormatFirstMiddleLast() {
        return nameOfStudentFormatFirstMiddleLast;
    }

    public void setNameOfStudentFormatFirstMiddleLast(String[] nameOfStudentFormatFirstMiddleLast) {
        this.nameOfStudentFormatFirstMiddleLast = nameOfStudentFormatFirstMiddleLast;
    }

    /**
     * This method the university roll number of the student (long).
     *
     * @return the university roll number of the student (long).
     */
    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }
}

