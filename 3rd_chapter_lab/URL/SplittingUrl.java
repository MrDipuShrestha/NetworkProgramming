import java.net.*;

public class SplittingUrl {
    public static void main(String[] args) throws Exception {
        URI uri = new URI("https://username:password@example.com:8000/blog/article.html?id=3");
        URL url = uri.toURL();
        System.out.println("Authority: " + url.getAuthority()); // authority = domian + port + userInfo
        System.out.println("File: " + url.getFile());
        System.out.println("User information: " + url.getUserInfo());
    }
}
