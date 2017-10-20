package cursojava.Jueves.IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class TestIO11 {
    public static void main(String[] args) throws IOException{
        FileInputStream in = new FileInputStream("C:\\Todos.txt");
        DataInputStream din = new DataInputStream(in);
        
        int c = in.available();
        byte [] array = new byte[c];
        in.read(array);
        
        for(byte n : array){
            char l = (char)n;
            System.out.print(l+"*");
        }
        in.close();
        din.close();
    }
}
