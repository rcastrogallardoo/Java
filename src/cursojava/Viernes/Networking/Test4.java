package cursojava.Viernes.Networking;

import java.net.InetAddress;

public class Test4 {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.oracle.com");
            System.out.println("Nombre Host: "+ip.getHostName());
            System.out.println("Direccion IP: "+ip.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
