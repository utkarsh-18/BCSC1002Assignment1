/*  Created by IntelliJ IDEA.
 *  User: Utkarsh Ojha
 *  Date: 25/08/20
 *  Time: 6:49 PM
 *  File Name : Student.java
 * */

package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String nameOfStudent;
    private long universityRollNumberOfStudent;
    private int numberOfBooksIssuedByStudent;
    private Book[] booksIssuedByStudent;

    public Student(String nameOfStudent, long universityRollNumberOfStudent, int numberOfBooksIssuedByStudent, Book[] booksIssuedByStudent) {
        this.nameOfStudent = nameOfStudent;
        this.universityRollNumberOfStudent = universityRollNumberOfStudent;
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
        this.booksIssuedByStudent = booksIssuedByStudent;
    }
    public Student(){ }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public long getUniversityRollNumberOfStudent() {
        return universityRollNumberOfStudent;
    }

    public void setUniversityRollNumberOfStudent(long universityRollNumberOfStudent) {
        this.universityRollNumberOfStudent = universityRollNumberOfStudent;
    }

    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    public void setNumberOfBooksIssuedByStudent(int numberOfBooksIssuedByStudent) {
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
    }

    public Book[] getBooksIssuedByStudent() {
        return booksIssuedByStudent;
    }

    public void setBooksIssuedByStudent(Book[] booksIssuedByStudent) {
        this.booksIssuedByStudent = booksIssuedByStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollNumberOfStudent == student.universityRollNumberOfStudent &&
                numberOfBooksIssuedByStudent == student.numberOfBooksIssuedByStudent &&
                Objects.equals(nameOfStudent, student.nameOfStudent) &&
                Arrays.equals(booksIssuedByStudent, student.booksIssuedByStudent);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nameOfStudent, universityRollNumberOfStudent, numberOfBooksIssuedByStudent);
        result = 31 * result + Arrays.hashCode(booksIssuedByStudent);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameOfStudent='" + nameOfStudent + '\'' +
                ", universityRollNumberOfStudent=" + universityRollNumberOfStudent +
                ", numberOfBooksIssuedByStudent=" + numberOfBooksIssuedByStudent +
                ", booksIssuedByStudent=" + Arrays.toString(booksIssuedByStudent) +
                '}';
    }
    public void addBook(Book book){
        System.out.println(book.getNameOfBook()+" book is issued. ");
    }
    public void returnPreviouslyIsssuedBook(String bookName){
        System.out.println(bookName+" is returned");
    }

    public void showAllBooks(){
        booksIssuedByStudent = new Book[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Book"+(i+1));
        }
    }
}
