import java.net.PasswordAuthentication;

public class PasswordAuthExample {
    public static void main(String[] args) {
        PasswordAuthentication auth = new PasswordAuthentication("user", "passwd".toCharArray());

        System.out.println("Username: " + auth.getUserName());
        System.out.println("Password: " + new String(auth.getPassword()));

    }
}
