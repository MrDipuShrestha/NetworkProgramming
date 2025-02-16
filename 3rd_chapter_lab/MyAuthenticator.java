import java.net.*;

public class MyAuthenticator extends Authenticator {
    protected PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication("user", "passwd".toCharArray());
    }
}
