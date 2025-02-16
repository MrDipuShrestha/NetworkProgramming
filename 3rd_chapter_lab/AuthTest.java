import java.net.*;
import java.io.IOException;

public class AuthTest {
    public static void main(String[] args) {
        try {
            //set the custom authenticator
            Authenticator.setDefault(new MyAuthenticator());

            // Access a password-protectred url
            URI uri =new URI("https://httpbin.org/basic-auth/user/passwd");
            URL url = uri.toURL();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //send request and get response
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
