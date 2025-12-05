package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    static void main(String[] args) {

        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime ofDateTime = LocalDateTime.of(2013,11,21,12,30,45);

        System.out.println("nowDateTime = " + nowDateTime);
        System.out.println("ofDateTime = " + ofDateTime);

        LocalDateTime localDateTime = ofDateTime.plusDays(1000).plusHours(10).plusHours(1);
        System.out.println("localDateTime = " + localDateTime);

        LocalDate localDate = ofDateTime.toLocalDate();
        System.out.println("localDate = " + localDate);

        LocalTime localTime = ofDateTime.toLocalTime();
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime1 = " + localDateTime1);

        LocalDateTime localDateTime2 = ofDateTime.plusYears(1);
        System.out.println("localDateTime2 = " + localDateTime2);

        //비교
        System.out.println(ofDateTime.isBefore(localDateTime2));
        System.out.println(ofDateTime.isAfter(localDateTime2));
        System.out.println(ofDateTime.isEqual(localDateTime2));

    }
}
