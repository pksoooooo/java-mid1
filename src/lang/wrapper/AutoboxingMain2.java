package lang.wrapper;

public class AutoboxingMain2 {
    static void main(String[] args) {

        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱(Auto-Boxing)

        //Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언받싱(Auto-UnBoxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
