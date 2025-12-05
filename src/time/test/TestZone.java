package time.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.of(2024, 1, 1, 9, 0, 0, 0, ZoneId.of("Asia/Seoul"));
        System.out.println("서울의 회의 시간: " + zdt);

        ZonedDateTime zonedDateTime = zdt.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("런던의 회의 시간: " + zonedDateTime);

        ZonedDateTime zonedDateTime1 = zdt.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("뉴욕의 회의 시간: " + zonedDateTime1);
    }


}
