package exception.ex4.exception;


public class ConnectExceptionV4 extends NetworkClientExcerptionV4 {

    private final String address;

    public ConnectExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        System.out.println("address = " + address);
        return address;
    }
}
