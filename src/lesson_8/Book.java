package lesson_8;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private final List<Author> authors;

    private final String bookName;

    private final Integer pageCount;

    private final Boolean isForSale;

    private final String description;

    public Book(List<Author> authors, String bookName, Integer pageCount, boolean isForSale, String description) {
        this.authors = authors;
        this.bookName = bookName;
        this.pageCount = pageCount;
        this.isForSale = isForSale;
        this.description = description;
    }

    List<Author> getAuthors() {
        return authors;
    }

    public void addAuthors(Author author) {
        authors.add(author);
    }

    String getBookName() {
        return this.bookName;
    }

    Integer getPageCount() {
        return this.pageCount;
    }

    Boolean getIsForSale() {
        return this.isForSale;
    }

    String getDescription() {
        return this.description;
    }

    public String toString() {
        return "Book name: " + bookName + "," + " Page count: " + pageCount + "," + " is for sale: "
                + isForSale + "," + " Description: " + description;
    }


}
