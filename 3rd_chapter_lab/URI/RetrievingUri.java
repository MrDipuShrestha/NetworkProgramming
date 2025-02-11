import java.net.*;
public class RetrievingUri {
    public static void main(String[] args) throws Exception {
        URI uri = new URI("https://example.com:8080/blog/article.html?name=value");

        System.out.println("Scheme: " + uri.getScheme());
        System.out.println("Host: " + uri.getHost());
        System.out.println("Port: " + uri.getPort());
        System.out.println("query: " + uri.getQuery());
        System.out.println("Authority: " + uri.getAuthority());
    }
}
