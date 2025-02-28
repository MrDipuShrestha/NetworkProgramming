import java.net.*;
import java.io.*;

public class DoOutputExamle {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://www.example.com/submit");
            URL url = uri.toURL();

            //open a connection to the URL
            URLConnection uc = url.openConnection();

            //Check if output is allowed; if not, enable it
            if(!uc.getDoOutput()){
                uc.setDoOutput(true);
            }

            //Send data to the server using Outputstream
            OutputStream outputStream = uc.getOutputStream();
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"));

            //write data
            writer.println("message=HelloServer&name=User123");
            writer.flush(); //Ensure data is sent

            //Close the writer
            writer.close();

            System.out.println("Data sent successfully!");
        } catch (URISyntaxException e) {
            System.err.println("Invalid URL: " + e.getMessage());
        }
        catch(IOException ex){
            System.err.println("Error: " + ex.getMessage());
        }
    }
}

