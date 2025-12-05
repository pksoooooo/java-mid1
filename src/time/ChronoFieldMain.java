package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {
    static void main(String[] args) {

        for (ChronoField value : ChronoField.values()) {
            System.out.println(value + ", range = " + value.range());
        }

        System.out.println("ChronoField.MONTH_OF_YEAR.range() = " + ChronoField.MONTH_OF_YEAR.range());
        System.out.println("ChronoField.DAY_OF_MONTH.range() = " + ChronoField.DAY_OF_MONTH.range());
    }
}
