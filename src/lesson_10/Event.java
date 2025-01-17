package lesson_10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Event {
    private String title;
    private Integer id;
    private String description;
    private LocalDate date;
    private LocalTime time;


    public Event(String title, String description, Integer id, LocalDate date, LocalTime time) {
        this.title = title;
        this.description = description;
        this.id = id;
        this.date = date;
        this.time = time;

         //user id name add delete
         // product id name price, user id, immutable
         // add product
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public Integer getId() {
        return id;
    }


    public LocalDateTime getDataTime() {
        return LocalDateTime.of(date, time);
    }
}
