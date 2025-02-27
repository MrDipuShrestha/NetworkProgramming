// Program to print the URL of a URLConnection to https://orielly.com

import java.io.IOException;
import java.net.*;

public class URLPrinter {

    public static void main(String[] args) {
        try{
            URI uri = new URI("https://www.oreilly.com");
            URL url = uri.toURL();

            //Open connection
            URLConnection uc = url.openConnection();

            //Print the url
            System.out.println("Connection to: " + uc.getURL());
        }catch(URISyntaxException e){
            System.out.println("Invalid URI: " + e.getMessage());
        }catch(IOException ex){
            System.out.println("IO Error: " + ex.getMessage());
        }
    }
}