import java.net.*;

public class CompairingUri {
    public static void main(String[] args) throws Exception {
        URI uri1 = new URI("https://example.com");
        URI uri2 = new URI("https://example.com");
        URI uri3 = new URI("https://example.com/page.html");

        System.out.println("uri1 and uri2 are same: " + uri1.equals(uri2));
        System.out.println("uri1 and uri3 are same: " + uri1.equals(uri3));
    }
}
