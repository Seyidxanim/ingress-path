package lesson_8;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;

    private List<Book> books;

    private Book book;

    private Integer age;

    public Person getCurrentPerson() {
        return this;
    }

    public Person(String name, List<Book> books, Integer age) {
        this.books = books;
        this.age = age;
        this.name = name;

    }

    String getName() {
        return name;
    }

    Integer getAge() {
        return age;
    }

    List<Book> getBooks() {
        return books;
    }

    public boolean addBook(Book book) {

        if (book.getIsForSale()) {
            books.add(book);
            return true;
        }
        return false;
    }

    public Book findBookWithMaxPageCount() {
        if (books.isEmpty()) {
            return null;
        }
        Book maxPageCount = books.get(0);
        for (Book book : books) {
            if (book.getPageCount() > maxPageCount.getPageCount()) {
                maxPageCount = book;
            }
        }
        return maxPageCount;
    }

    boolean deleteBook(String bookName) {
        return books.removeIf(book -> book.getBookName().equals(bookName));
    }


    // toString metodunu yaza bilmedim


    @Override
    public String toString() {
        return "Person{name='%s', books=%s, age=%d}".formatted(name, books, age);
    }
}
