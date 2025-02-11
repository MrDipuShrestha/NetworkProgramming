import java.net.*;

public class CreatingUri {
    public static void main(String[] args) throws Exception {
        URI uri = new URI("https://username=dipesh@example.com:8080/page.html?name=value");

        System.out.println("URI: " + uri);

    }
}
