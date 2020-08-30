/*  Created by IntelliJ IDEA.
 *  User: Garima Singh Parihar (191500287)
 *  Date: 30/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */

package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String bookAuthorName;
    private String thirteenDigitISBNNumber;

    /**
     * This method returns book name , author name , book ISBN number .
     *
     * @param bookName                This return name of the book .
     * @param bookAuthorName          This return book author name of the book .
     * @param thirteenDigitISBNNumber This return ISBN number of the book .
     */
    public Book(String bookName, String bookAuthorName, String thirteenDigitISBNNumber) {
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.thirteenDigitISBNNumber = thirteenDigitISBNNumber;
    }

    public Book() {

    }

    public Book(String bookName) {
        this.bookName = "Life is what you make it";
        this.bookAuthorName = " Preeti Shenoy .";
        this.thirteenDigitISBNNumber = "2345678912345";
    }

    /**
     * This method return name of book .
     *
     * @return The name of the books
     */
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {

        this.bookName = bookName;
    }

    /**
     * This method return author name of book .
     *
     * @return The author name of the books
     */
    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    /**
     * This method return ISBN number of book .
     *
     * @return The ISBN number of the books
     */
    public String getThirteenDigitISBNNumber() {
        return thirteenDigitISBNNumber;
    }

    public void setThirteenDigitISBNNumber(String thirteenDigitISBNNumber) {
        this.thirteenDigitISBNNumber = thirteenDigitISBNNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthorName='" + bookAuthorName + '\'' +
                ", thirteenDigitISBNNumber='" + thirteenDigitISBNNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(bookAuthorName, book.bookAuthorName) &&
                Objects.equals(thirteenDigitISBNNumber, book.thirteenDigitISBNNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuthorName, thirteenDigitISBNNumber);
    }
}




