
import java.io.*;
import java.net.*;

public class UseCachesExample {

    public static void main(String[] args) {
        try {
            // Define the URL
            URI uri = new URI("https://www.example.com");
            URL url = uri.toURL();

            //Open connection
            URLConnection uc = url.openConnection();

            //Disable cachimg ot always fetch fresh copy
            uc.setUseCaches(false);

            //Read and print the response 
            BufferedReader reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            // Close the reader
            reader.close();

        } catch (URISyntaxException e) {
            // TODO: handle exception
            System.out.println("Ivalid URI: " + e.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
