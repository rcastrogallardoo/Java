package cursojava.Viernes.Networking.Socket1.Socket2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        String msg = "", msg2="";
        
        ServerSocket ss = new ServerSocket(3000);
        Socket s = ss.accept();
        
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dot = new DataOutputStream(s.getOutputStream());
        br = new BufferedReader(new InputStreamReader(System.in));
        
        while(!msg.equals("stop")){
            msg = din.readUTF();
            System.out.println("El cliente dice: "+msg);
            
            msg2 = br.readLine();
            dot.writeUTF(msg2);
            dot.flush();
            
        }
        closeStream(din, dot, s);
        
        
        
    }

    private static void closeStream(DataInputStream din, DataOutputStream dot, Socket s) throws IOException {
        din.close();
        dot.close();
        s.close();
    }
    
    
}
