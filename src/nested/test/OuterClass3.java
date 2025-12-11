package nested.test;

public class OuterClass3 {
    public void myMehod() {
        class LocalClass {
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }

        new LocalClass().hello();
    }


}
