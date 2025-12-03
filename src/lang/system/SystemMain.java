package lang.system;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

public class SystemMain {
    public static void main(String[] args) {

        //현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다.
        long currentNanoTime = System.nanoTime();
        System.out.println("currentNanoTime = " + currentNanoTime);

        //환경 변수를 읽는다. 운영체제
        Map<String, String> getenv = System.getenv();
        System.out.println("getenv = " + getenv);

        //시스템 속성을 읽는다. 자바
        Properties properties = System.getProperties();
        System.out.println("properties = " + properties);
        String property = System.getProperty("java.version");
        System.out.println("property = " + property);

        // 배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copieArray = new char[5];
        System.arraycopy(originalArray, 0, copieArray, 0, originalArray.length);

        //배열 출력
        System.out.println("copieArray = " + copieArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copieArray));

        //프로그램 종료
        System.exit(0); //가급적 사용 금지

    }
}
