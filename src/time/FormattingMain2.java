package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {


    public static void main(String[] args) {
        //포맷팅 날짜와 시간을 문자로
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatedDateTime = now.format(formatter);

        System.out.println("포맷팅 날짜와 시간을 문자 = " + formatedDateTime);
        System.out.println("now = " + now);

        // 파싱 : 문자를 날짜와 시간으로
        String dateTimeString = "2030-01-01 12:30:45";
        LocalDateTime parseedDateItme = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("문자를 날짜와 시간 = " + parseedDateItme);

    }

}
