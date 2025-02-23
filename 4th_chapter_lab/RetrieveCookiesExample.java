import java.net.*;
import java.util.List;

public class RetrieveCookiesExample {
    public static void main(String[] args) throws Exception {
        // Set up a Cookie Manager to handle cookies

        CookieManager cookieManager = new CookieManager();
        CookieHandler.setDefault(cookieManager);

        //Send a requet to a website that sets cookies
        URI uri = new URI("https://httpbin.org/cookies/set?user=JohnDoe&session=abc123");
        URL url = uri.toURL();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.getResponseCode();

        //Retrieve stored cookies
        CookieStore cookieStore = cookieManager.getCookieStore();
        List<HttpCookie> cookies = cookieStore.getCookies();

        // Display Cookies
        System.out.println("Stored Cookies:");
        if(cookies.isEmpty()){
            System.out.println("No cookies stored.");
        }else{
            for(HttpCookie cookie : cookies){
                System.out.println("Name:" + cookie.getName());
                System.out.println("Value:" + cookie.getValue());
                System.out.println("Domain:" + cookie.getDomain());
                System.out.println("Path:" + cookie.getPath());
                System.out.println("Max Age:" + cookie.getMaxAge());
                System.out.println("Secure:" + cookie.getSecure());
                System.out.println("-----------------------");
            }
        }
    }
}
