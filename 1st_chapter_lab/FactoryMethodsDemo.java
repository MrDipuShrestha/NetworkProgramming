

import java.net.*;

public class FactoryMethodsDemo {
    public static void main(String[] args) {
        try {
            // Using getByName() to fetch Google's IP address
            InetAddress google = InetAddress.getByName("google.com");
            System.out.println("Google's Host Name: " + google.getHostName());
            System.out.println("Google's IP Address: " + google.getHostAddress());

            // Using getLocalHost() to fetch local system's details
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("\nLocal Host Name: " + local.getHostName());
            System.out.println("Local IP Address: " + local.getHostAddress());

        } catch (Exception e) {
            System.out.println("Could not resolve the host.");
        }
    }
}
