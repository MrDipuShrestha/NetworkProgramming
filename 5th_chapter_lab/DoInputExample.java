import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class DoInputExample {
    public static void main(String[] args) {
        try{
            URI uri = new URI("http://www.example.com");
            URL url = uri.toURL();

            URLConnection uc = url.openConnection();

            //check if input is allowed, if not. enable it

            if (!uc.getDoInput()) {
                uc.setDoInput(true);
            }

            //Read data from URL
            BufferedReader reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));

            //print the first few lines of the page content

            String line;
            int count = 0;
            while ((line = reader.readLine()) != null && count < 5) {
                // Limiting outout to 5
                System.out.println(line);
                count++;
            }

            //Close the reader
            reader.close();
        }catch(URISyntaxException e){
            System.out.println("Invalid URI: " + e.getMessage());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
