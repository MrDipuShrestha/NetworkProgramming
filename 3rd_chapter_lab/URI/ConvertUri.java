import java.net.*;

public class ConvertUri {
     public static void main(String[] args) throws Exception{
        URI uri = new URI("https://example.com:8080/path/to/page?query=value#section");

        System.out.println("TO String: " + uri.toString());
        System.out.println("Raw path: " + uri.getRawPath());
        System.out.println("Raw Query: " + uri.getRawQuery());
        System.out.println("Raw Fragment: " + uri.getRawFragment());
    }
}
