package nested.inner;

public class InnerOuterMain {

    static void main(String[] args) {
        InnerOuter innerOuter = new InnerOuter();
        InnerOuter.Inner inner = innerOuter.new Inner();
        inner.print();

        System.out.println("innerOuter = " + innerOuter.getClass());
        System.out.println("inner = " + inner.getClass());
    }
}
