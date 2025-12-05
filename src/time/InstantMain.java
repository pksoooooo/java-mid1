package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    static void main(String[] args) {
        //생성
        Instant now = Instant.now();
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt.toInstant());
        System.out.println("from = " + from);

        //조회
        Instant epochSecond = Instant.ofEpochSecond(0);
        System.out.println("epochSecond = " + epochSecond);

        //계산
        Instant instant = epochSecond.plusSeconds(3600);
        System.out.println("instant = " + instant);

        //조회
        long instantEpochSecond = instant.getEpochSecond();
        System.out.println("instantEpochSecond = " + instantEpochSecond);
    }
}
