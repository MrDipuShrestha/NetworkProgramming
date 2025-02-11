import java.net.*;

public class ConvertUrl {
    public static void main(String[] args) throws Exception{
        URI uri = new URI("https://example.com:8080/blog/article.html");

        URL url = uri.toURL();

        System.out.println("TO String: " + url.toString());
        System.out.println("TO External Form: " + url.toExternalForm());
    }
}
