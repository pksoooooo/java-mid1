package lang.clazz;

public class ClassCreateMain {
    static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
//        Class helloClass = Class.forName("lang.clazz.Hello");

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);

        Hello hello1 = new Hello();
        String result1 = hello1.hello();
        System.out.println("result1 = " + result1);
    }
}
