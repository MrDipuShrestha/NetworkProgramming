import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;

public class GetRequestExample{
    public static void main(String[]args){
        try {
            // Base url of the serve-side program (Change this to an actual APU)

            String baseUrl = "https://jsonplaceholder.typicode.com/posts/1";

            // Query parameters (encode them properly)
            String param1 = URLEncoder.encode("value1", "UTF-8");
            String param2 = URLEncoder.encode("value2", "UTF-8");

            //Construct the full URL with query parameter
            String fullUrl = baseUrl + "?param1=" + param1 + "?param2=" + param2;

            //Create the url objct
            URI uri = new URI(fullUrl);
            URL url = uri.toURL();

            //open a connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET"); //specify GET method

            //option1: Set request header
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            //Get the sresponse code
            int responseCode = connection.getResponseCode();
            System.out.println("Response code: " + responseCode);

            //REad response data
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            //Print the response
            System.out.println("Response from server: " + response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}