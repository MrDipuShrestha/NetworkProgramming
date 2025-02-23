
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

public class StoreRetrieveCookies {
	public static void main(String[] args) throws Exception {
		//custom cookiemanager that accepts all cookies
		CookieManager customCookieManager=new CookieManager(null,CookiePolicy.ACCEPT_ALL);
		CookieHandler.setDefault(customCookieManager);

		//request to set cookies
		URI uri = new URI("https://httpbin.org/cookies/set?username=JohnDoe");
		URL url=uri.toURL();
		HttpURLConnection conn=(HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");

		//read response 
		BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
		while(in.readLine()!=null){

		}// ignore content
		in.close();

		//retrieve stored cookies
		CookieStore cookieStore=customCookieManager.getCookieStore();
		List<HttpCookie> cookies = cookieStore.getCookies();
		System.out.println("Stored Cookies:");
		for(HttpCookie cookie: cookies){
			System.out.println(cookie);
		}

	}
}
