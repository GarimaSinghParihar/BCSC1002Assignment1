/*  Created by IntelliJ IDEA.
 *  User: Garima Singh Parihar (191500287)
 *  Date: 30/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */

package definitions;

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

}




