import example.client.Client;

public class Main {
    public static void main(String[] args) {
        try {
            new Client().setUpNetworking();
            Client client = new Client();
            client.sendToServer("Logged in Bryan");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}