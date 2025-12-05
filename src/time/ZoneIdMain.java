package time;

import java.time.ZoneId;

public class ZoneIdMain {

    public static void main(String[] args) {
        for(String availableZoneId : ZoneId.getAvailableZoneIds()){

            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(availableZoneId + " | " + zoneId.getRules());
        }


        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId = " + zoneId);

        ZoneId zoneId1 = ZoneId.of("Asia/Seoul");
        System.out.println("zoneId1 = " + zoneId1);
    }
}
