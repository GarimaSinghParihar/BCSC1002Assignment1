/*  Created by IntelliJ IDEA.
 *  User: Garima Singh Parihar(191500287)
 *  Date: 30/08/20
 *  Time: 5:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private static Book[] booksCurrentlyAvailable;

    public Library() {
        booksCurrentlyAvailable = new Book[15];
        for (int index = 0; index < booksCurrentlyAvailable.length; index++) {
            booksCurrentlyAvailable[index] = new Book("Books" + (index + 1));
        }
    }

    public Library(Book[] booksCurrentlyAvailable) {
        Library.booksCurrentlyAvailable = booksCurrentlyAvailable;
    }

    /**
     * This method add a book to a library.
     *
     * @param name of the book to be added.
     */

    public static void doIssueBook(String name) {
        System.out.println(name + "book is issued for you");
    }

    /**
     * This method returns the book back to the library .
     *
     * @param name The name of the book you want to return
     */

    public static void doReturnBook(String name) {
        System.out.println("thank You for returning " + name + ".Hope you read it and find its content useful");
    }

    /**
     * This method shows a list of books in our inventory
     */

    public static void listInventory() {
        for (Book book : booksCurrentlyAvailable) {
            System.out.println(book);
        }
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
        Library.booksCurrentlyAvailable = booksCurrentlyAvailable;
    }

    @Override
    public String toString() {
        return "Library{" +
                "booksCurrentlyAvailable=" + Arrays.toString(booksCurrentlyAvailable) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(booksCurrentlyAvailable, booksCurrentlyAvailable);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(booksCurrentlyAvailable);
    }

    /**
     * This method add a book to a library.
     *
     * @param name of the book to be added.
     */

    public void doIssueBook(String name) {
        System.out.println(name + "book is issued for you");
    }

    /**
     * This method returns the book  to the library .
     *
     * @param name The name of the book you want to return
     */

    public void doReturnBook(String name) {
        System.out.println("thank You for returning" + name + ".Hope you read and find its content intresting ");
    }
}
