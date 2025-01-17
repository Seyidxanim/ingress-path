package person;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Salam");
        list.add("Sagol");
//        System.out.println(list);
//        list.remove("Salam");
//        System.out.println(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}
