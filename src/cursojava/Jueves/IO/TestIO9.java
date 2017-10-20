package cursojava.Jueves.IO;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO9 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout = new FileOutputStream("C:\\Hola.txt");
        FileOutputStream fout2 = new FileOutputStream("C:\\uno.txt");
        
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fout);
        bout.writeTo(fout2);
        bout.flush();
        bout.close();
        
        System.out.println("Listo");
    }
}
