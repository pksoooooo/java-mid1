package exception.ex1;

public class NetworkServiceV1_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);

        String connectionResult = client.connect();
        //결과가 성공이 아니다 -> 오류다.
        if (isError(connectionResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectionResult);
            return;
        }

        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            return;
        }

        client.disconnect();
    }

    private static boolean isError(String connectionResult) {
        return !"success".equals(connectionResult);
    }
}
