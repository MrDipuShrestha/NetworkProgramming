
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class HttpOptionsExample {
	public static void main(String[] args) throws Exception{
		URI uri=new URI("https://httpbin.org/");
		URL url=uri.toURL();
		HttpURLConnection conn=(HttpURLConnection) url.openConnection();
		conn.setRequestMethod("OPTIONS");

		//get response code 
		int responseCode=conn.getResponseCode();
		System.out.println("Response Code: " + responseCode);
	
		//get allowed methods
		String allowedMethods=conn.getHeaderField("ALLOW");
		System.out.println("Allowed Methods: " + allowedMethods);
	}
}
