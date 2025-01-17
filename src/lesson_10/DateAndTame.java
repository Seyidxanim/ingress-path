package lesson_10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTame {
    public static void main(String[] args) {
//        Date date=new Date();
//        DateFormat df=new SimpleDateFormat("yyy-MM-E");
//        System.out.println(df.format(date));

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String stringDate = sdf.format(new Date());
        System.out.println("Today is: "+stringDate);

    }
}
