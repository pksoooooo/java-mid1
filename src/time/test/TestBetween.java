package time.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        System.out.println("시작 날짜 :" + startDate);
        System.out.println("남은 날짜 :" + endDate);

        Period reminedDate = Period.between(startDate, endDate);
        long dayBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println(
                "남은 기간 : " +
                        reminedDate.getYears() + "년 " +
                        reminedDate.getMonths() + "개월 " +
                        reminedDate.getDays() + "일"
        );

        System.out.println("디데이 : " + dayBetween + "일 남음");


    }
}
