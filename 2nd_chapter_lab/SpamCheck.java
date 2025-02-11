import java.net.*;

public class SpamCheck {
    public static void main(String[] args){
        String spamServer = "spam.example.com";

        try{
            InetAddress address = InetAddress.getByName(spamServer);
            System.out.println("This might be a spam address:" + address.getHostAddress());
        }
        catch (Exception e){
            System.out.println("This is not a spam address.");
        }
     }
}
