/*  Created by IntelliJ IDEA.
 *  User: Garima Singh Parihar (191500287)
 *  Date: 30/08/20
 *  Time: 8:00 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int LIST_INVENTORY = 3;
    private static final int EXIT = 4;
    private Library[] studentDetailsThoseAreCurrentlyInteracting;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clientInput;
        String nameOfTheStudent;
        long universityRollNumber;
        Library myLibrary = new Library();
        do {
            System.out.println("_=_=__=_=_Welcome To the Front Desk_=_=__=_=_");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return the previously issues books");
            System.out.println("3. Show all previously issue books");
            System.out.println("4. Exit");
            System.out.println("Enter your choice (1..4): ");

            clientInput = scanner.nextInt();
            switch (clientInput) {
                case ISSUE_BOOK:
                    System.out.println("enter your name");
                    scanner.nextLine();
                    nameOfTheStudent = scanner.next();
                    System.out.println("enter your university Rollno");
                    universityRollNumber = scanner.nextLong();
                    System.out.println("Enter the name of the book that you want to issue");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    Library.doIssueBook(bookName);
                    break;
                case RETURN_BOOK:
                    System.out.println("enter your name");
                    nameOfTheStudent = scanner.next();
                    scanner.nextLine();
                    System.out.println("enter your university Rollno");
                    universityRollNumber = scanner.nextLong();
                    System.out.println("Enter the name of the book that you want to return");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    Library.doReturnBook(bookName);
                    break;
                case LIST_INVENTORY:
                    Library.listInventory();
                    break;
                default:
                    System.out.println("WRONG CHOICE");
            }
        } while (clientInput != EXIT);
        scanner.close();
    }
}
