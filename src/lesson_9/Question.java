package lesson_9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Question {


    public static void main(String[] args) {
        Integer[] integers = {5, null, 3, 9, null, null, 1};
        Arrays.sort(integers, Comparator.nullsLast(Comparator.naturalOrder()));
        for (Integer el : integers) {
            if (Objects.nonNull(el)) {
                System.out.print(el + " ");
            }
        }


    }

    public static void sortDesc() {
        Integer[] integers = {5, null, 3, 9, null, null, 1};
        Comparator<Integer> comparator = Comparator.nullsLast(Comparator.naturalOrder());
        Comparator<Integer> reversedComparator = comparator.reversed();
        Arrays.sort(integers, reversedComparator);
        for (Integer el : integers) {
            if (Objects.nonNull(el)) {
                System.out.print(el + " ");
            }

        }

    }

}
