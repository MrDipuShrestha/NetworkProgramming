import java.net.*;
import java.nio.charset.StandardCharsets;

public class URLDecoding {
     public static void main(String[] args) {
        try{
            String encodedSentence = "Hello+world%21+I+am+fit+%26+healthy";
            String decodedSentence = URLDecoder.decode(encodedSentence, StandardCharsets.UTF_8);

            System.out.println("Encoded Sentence: " + encodedSentence);
            System.out.println("Decoded Sentence: " + decodedSentence);
        }
        catch(Exception e){
            System.out.println("An eror occur: " + e.getMessage());
        }
    }
}
