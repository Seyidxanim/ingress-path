package lesson_14;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<String> predicate = word -> word.equalsIgnoreCase("hello");
//        System.out.println(predicate.test("HELLO"));
//
//        Predicate<Integer> predicate1 = number -> number % 2 != 0;
//        System.out.println(predicate1.test(7));
//
//        Predicate<String> predicate2= word1 -> word1.equals("java");
//        System.out.println(predicate2.test("Java"));


//        Consumer<String> consumer = word -> System.out.println(word);
//        consumer.accept("Java");


        Consumer<Integer> consumer1 = System.out::println;
        consumer1.accept(23);

        Function <String,Integer> function= word -> word.length();
        System.out.println(function.apply("Java"));



    }
}
