
/*  Created by IntelliJ IDEA.
 *  User: Utkarsh Ojha
 *  Date: 25/08/20
 *  Time: 9:00 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n" +
                "How may I help you today?\n" +
                "1. Issue a new book for me.\n" +
                "2. Return a previously issues book for me.\n" +
                "3. Show me all my issues books.\n" +
                "4. Exit.\n");
        int choice;
        do {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Book Name : ");
                    String bookName = scanner.nextLine();
                    System.out.println("Enter Author Name : ");
                    String authorName = scanner.nextLine();
                    System.out.println("Enter ISBN Number of Book");
                    String isbnNumber = scanner.nextLine();
                    Book book = new Book(bookName, authorName, isbnNumber);
                    student.addBook(book);
                    break;
                case 2:
                    System.out.println("Enter name of book which you want to return");
                    String returnBookName = scanner.nextLine();
                    student.returnPreviouslyIsssuedBook(returnBookName);
                    break;
                case 3:
                    student.showAllBooks();
                    break;
                default:
                    System.out.println("Wrong Choice.");
                    break;
            }
        } while (choice != 4);
    }
}
