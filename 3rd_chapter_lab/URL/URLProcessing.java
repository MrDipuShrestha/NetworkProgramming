import java.net.*;

public class URLProcessing {
    
     public static void main (String[] args){
        try{
            System.out.println("Creating URL:-");
            URI uri=new URI("https://username:password@example.com:8000/blog/article.html?id=3#frag");
            URL url = uri.toURL();
            System.out.println("URL:" +url);

            System.out.println("Retrieving URL:-");  
            System.out.println("Protocol:" + url.getProtocol());
            System.out.println("Host:" + url.getHost());
            System.out.println("Path:" + url.getPath());
            System.out.println("Query:" + url.getQuery());
            System.out.println("Port:" + url.getPort());
            System.out.println("Fragment:" + url.getRef());

            System.out.println("Splitting URL:-");
            System.out.println("Authority: " + url.getAuthority()); 
            System.out.println("File: " + url.getFile());
            System.out.println("User information: " + url.getUserInfo());


        }
        catch(Exception e){
       System.out.println("An error occurred:" + e.getMessage());
        }
    }
}
