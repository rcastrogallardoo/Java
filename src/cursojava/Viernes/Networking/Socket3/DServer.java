/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.Viernes.Networking.Socket3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author sandra
 */
public class DServer {
    public static void main(String[] args) throws Exception{
        System.out.println("Cliente");
        DatagramSocket ds = new DatagramSocket();
        String str = "Hola";
        
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),
                ip,3000);
        
        ds.send(dp);
        ds.close();
        
    }
}
