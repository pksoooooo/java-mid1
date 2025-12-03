package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    static void main(String[] args) throws Exception {

        //Class 조회
//        Class clazz = String.class;
//        Class clazz = new String().getClass();
        Class clazz = Class.forName("java.lang.String");

        // 모든 필드 출력
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("field : " + declaredField.getType() + " " + declaredField.getName());
        }

        //모든 메서드 출력
        for (Method declaredMethod : clazz.getDeclaredMethods()) {
            System.out.println("declaredMethod = " + declaredMethod);
        }

        // 상위 클래스 정보 출력
        String name = clazz.getSuperclass().getName();
        System.out.println("name = " + name);

        // 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("anInterface = " + anInterface);
        }


    }
}
