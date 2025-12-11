package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalander {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        System.out.println("Su Mo Tu We Th Fr Sa ");

        LocalDate localDate = LocalDate.of(year, month, 1);

        int firstDay = localDate.getDayOfMonth();
        int lastDay = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();

        for (int i = 1; i <= lastDay; i++) {

            System.out.print(i + " ");
            if(i % 7 == 0){
                System.out.println();
            }

        }



    }

}
