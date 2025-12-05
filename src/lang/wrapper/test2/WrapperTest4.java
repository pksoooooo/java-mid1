package lang.wrapper.test2;

public class WrapperTest4 {
    static void main(String[] args) {
        String str = "100";

        Integer integer = Integer.valueOf(str);
        int i = integer;
        Integer integer2 = i;

        System.out.println("integer = " + integer);
        System.out.println("i = " + i);
        System.out.println("integer2 = " + integer2);
    }
}
