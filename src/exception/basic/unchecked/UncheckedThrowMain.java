package exception.basic.unchecked;

public class UncheckedThrowMain {
    static void main(String[] args) {
        Service service = new Service();
        service.callThrow();
    }
}
