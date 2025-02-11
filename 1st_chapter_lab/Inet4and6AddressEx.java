
import java.net.*;

public class Inet4and6AddressEx {

    public static void main(String[] args) throws Exception {
        //ipv4
        InetAddress address = Inet4Address.getByName("www.google.com");
        System.out.println("IPv4:" + address.getHostAddress());
        System.out.println("IPv4 Address:" + address.getHostAddress());
        System.out.println("Is IPv4:" + (address instanceof Inet4Address));

        //ipv6
        InetAddress address1 = Inet6Address.getByName("ipv6.google.com");
        System.out.println("IPv6:" + address1.getHostAddress());
        System.out.println("IPv6 Address:" + address1.getHostAddress());
        System.out.println("Is IPv6:" + (address1 instanceof Inet6Address));
    }
}
