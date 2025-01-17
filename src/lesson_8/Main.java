package lesson_8;

import lesson_3.taskClass.Car;
import lesson_9.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Student student = new Student();
//        student.compareTo(new Student());
        Person person = new Person(null, null, null);
        System.out.println("res: " + person);
        System.out.println("res2: " + person.getCurrentPerson());
        System.out.println(new Person(null,null,null).getCurrentPerson());

        Author authorMark = new Author("Mark Zuckerberg", true, "21091970");
        Author authorElon = new Author("Elon Mask", true, "06051980");

        List<Author> authors = new ArrayList<>();
        authors.add(authorMark);
        authors.add(authorElon);

        System.out.println(authors);

        System.out.println("-----------------------------------------------------------------------------------");

        Book book1 = new Book(authors, "Programming", 700, true, "Programming for Architectures");
        Book book2 = new Book(authors, "Programming2", 800, true, "Programming for Architectures 2");
        Book book3 = new Book(authors, "Grokking Algorithms", 1200, false, "Algorithms for Beginners");

        List<Book> books = new ArrayList<>();
        books.add(book1);

        System.out.println(books);

        System.out.println("-----------------------------------------------------------------------------------");


        Person personAnar = new Person("Anar", books, 30);

        System.out.println("Book is added? " + personAnar.addBook(book2));
        System.out.println("Book is added? " + personAnar.addBook(book3));
        System.out.println("All books: " + personAnar.getBooks());
        System.out.println("Book with max page count: " + personAnar.findBookWithMaxPageCount());
        System.out.println("Book is deleted? " + personAnar.deleteBook("Programming"));
        System.out.println("All books: " + personAnar.getBooks());


    }
}
