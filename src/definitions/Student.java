/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

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

    /**
     * This method return the number of books issued by the student .
     *
     * @return the number of books issued by the student
     */
    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    /**
     * This method return the names of books issued by the student .
     *
     * @return the names of books issued by the student
     */
    public Book[] getNameOfBooksIssued() {
        return nameOfBooksIssued;
    }

    public void setNameOfBooksIssued(Book[] nameOfBooksIssued) {
        this.nameOfBooksIssued = nameOfBooksIssued;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameOfStudentFormatFirstMiddleLast=" + Arrays.toString(nameOfStudentFormatFirstMiddleLast) +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", nameOfBooksIssued=" + Arrays.toString(nameOfBooksIssued) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollNumber == student.universityRollNumber &&
                numberOfBooksIssued == student.numberOfBooksIssued &&
                Arrays.equals(nameOfStudentFormatFirstMiddleLast, student.nameOfStudentFormatFirstMiddleLast) &&
                Arrays.equals(nameOfBooksIssued, student.nameOfBooksIssued);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(universityRollNumber, numberOfBooksIssued);
        result = 31 * result + Arrays.hashCode(nameOfStudentFormatFirstMiddleLast);
        result = 31 * result + Arrays.hashCode(nameOfBooksIssued);
        return result;
    }
}

