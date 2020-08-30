/*  Created by IntelliJ IDEA.
 *  User: Utkarsh Ojha
 *  Date: 25/08/20
 *  Time: 6:05 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String nameOfBook;
    private String nameOfAuthorOfBook;
    private String isbnNumberOfBook;

    public Book(String nameOfBook, String nameOfAuthorOfBook, String isbnNumberOfBook) {
        this.nameOfBook = nameOfBook;
        this.nameOfAuthorOfBook = nameOfAuthorOfBook;
        this.isbnNumberOfBook = isbnNumberOfBook;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getNameOfAuthorOfBook() {
        return nameOfAuthorOfBook;
    }

    public void setNameOfAuthorOfBook(String nameOfAuthorOfBook) {
        this.nameOfAuthorOfBook = nameOfAuthorOfBook;
    }

    public String getIsbnNumberOfBook() {
        return isbnNumberOfBook;
    }

    public void setIsbnNumberOfBook(String isbnNumberOfBook) {
        this.isbnNumberOfBook = isbnNumberOfBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameOfBook, book.nameOfBook) &&
                Objects.equals(nameOfAuthorOfBook, book.nameOfAuthorOfBook) &&
                Objects.equals(isbnNumberOfBook, book.isbnNumberOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, nameOfAuthorOfBook, isbnNumberOfBook);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", nameOfAuthorOfBook='" + nameOfAuthorOfBook + '\'' +
                ", isbnNumberOfBook='" + isbnNumberOfBook + '\'' +
                '}';
    }
}
