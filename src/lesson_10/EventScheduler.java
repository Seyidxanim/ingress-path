package lesson_10;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EventScheduler {


    private static final List<Event> event = new ArrayList<>();

    int eventIdCounter=0;
    private static final Scanner scanner = new Scanner(System.in);





    // date isteyecik yyyy- MM-dd alaciq string formasinda
    // time HH:mm ,23:15


    public static void addEvent() {
        System.out.println("");
        String title = scanner.nextLine();
        System.out.println("");
        String d = scanner.nextLine();
        System.out.println("");
        Integer id = scanner.nextInt();
        System.out.println("");
        String date = scanner.nextLine();
        System.out.println("");
        String time = scanner.nextLine();

    }


    public static void main(String[] args) {

        System.out.println("Menu:");
        System.out.println("Add ");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Exit");
    }
}
