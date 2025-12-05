package lang.wrapper.test2;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer integer1 = Integer.valueOf(str);
        int i = integer1.intValue();
        Integer integer2 = Integer.valueOf(i);

        System.out.println("integer1 = " + integer1);
        System.out.println("i = " + i);
        System.out.println("integer2 = " + integer2);

    }
}
