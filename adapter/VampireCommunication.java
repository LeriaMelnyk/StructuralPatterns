package adapter;

public class VampireCommunication implements Communication {
    public void sendMessage(String message) {
        System.out.println("Vampire Communication sent message: " + message);
    }

}
