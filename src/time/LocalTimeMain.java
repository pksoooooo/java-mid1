package time;

import java.time.LocalTime;

public class LocalTimeMain {
    static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(12, 30, 45);

        System.out.println("현재 시간 = " + nowTime);
        System.out.println("지정 시간 = " + ofTime);
        
        //계산(불변)
        LocalTime ofTimePlus = ofTime.plusHours(10);
        System.out.println("ofTimePlus = " + ofTimePlus);
    }
}
