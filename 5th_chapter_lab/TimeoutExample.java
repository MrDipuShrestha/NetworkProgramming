
import java.io.*;
import java.net.*;

public class TimeoutExample {

    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.example.com");
            URL url = uri.toURL();
            URLConnection connection = url.openConnection();

            // Set timeouts(5 seconds for connection, 3 seconds for reading)
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(3000);

            //print tiemout values
            System.out.println("Connection Timeout: " + connection.getConnectTimeout() + " ms");
            System.out.println("Read Timeout: " + connection.getReadTimeout() + " ms");

            //Open the connection and read data
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            System.out.println("response: " + reader.readLine());
            reader.close();
        } catch (URISyntaxException e) {
            // TODO: handle exception
            System.err.println(" Invalid URI: " + e.getMessage());
        } catch (SocketTimeoutException e) {
            System.out.println("Request Time out!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
