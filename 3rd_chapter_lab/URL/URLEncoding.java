import java.net.*;
import java.nio.charset.StandardCharsets;

public class URLEncoding {
    public static void main(String[] args) {
        try{
            String filename = "report #1.pdf";
            String encodedFilename = URLEncoder.encode(filename, StandardCharsets.UTF_8);

            String sentence = "Hello world! I am fit & healthy";
            String encodedSentence = URLEncoder.encode(sentence, StandardCharsets.UTF_8);

            System.out.println("Original Filename:" + filename);
            System.out.println("Encoded Filename:" + encodedFilename);

            System.out.println("Original Sentence:" + sentence);
            System.out.println("Encoded Sentence:" + encodedSentence);
        }
        catch(Exception e){
            System.out.println("An eror occur: " + e.getMessage());
        }
    }
}
