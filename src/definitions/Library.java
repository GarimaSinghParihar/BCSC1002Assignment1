/*  Created by IntelliJ IDEA.
 *  User: Garima Singh Parihar(191500287)
 *  Date: 30/08/20
 *  Time: 5:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] booksCurrentlyAvailable;

    public Library() {
        this.booksCurrentlyAvailable = new Book[15];
        for (int index = 0; index < booksCurrentlyAvailable.length; index++) {
            booksCurrentlyAvailable[index] = new Book("Books" + (index + 1));
        }
    }

    public Library(Book[] booksCurrentlyAvailable) {
        this.booksCurrentlyAvailable = booksCurrentlyAvailable;
    }

    /**
     * This method return current book that are currently available book[] .
     *
     * @return This method return current book that are currently available book[] .
     */
    public Book[] getBooksCurrentlyAvailable() {
        return booksCurrentlyAvailable;
    }

    public void setBooksCurrentlyAvailable(Book[] booksCurrentlyAvailable) {
        this.booksCurrentlyAvailable = booksCurrentlyAvailable;
    }
}
