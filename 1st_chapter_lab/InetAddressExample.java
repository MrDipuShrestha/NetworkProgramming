
import java.net.*;
public class InetAddressExample{
	public static void main(String[] args){
		try{
			//InetAddress address=InetAddress.getByName("www.google.com");
			InetAddress address=InetAddress.getLocalHost();
			System.out.println(address);
			System.out.println("Host:name"+address.getHostName());
			System.out.println("Ip address:"+ address.getHostAddress());
			System.out.println("Hashed address:" + address.hashCode());
			System.out.println("String representation:"+ address.toString());
			System.out.println("Canoical hostname:" + address.getCanonicalHostName());
			System.out.println(address);

			InetAddress anotherAddress = InetAddress.getByName("www.facebook.com");
			System.out.println("Is equal:" + address.equals(anotherAddress));
		}
		catch(Exception e){
			//TODO: handle exception
			System.out.println("an error occured");
		}
	}
}
