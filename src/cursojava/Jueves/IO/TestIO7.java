package cursojava.Jueves.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TestIO7 {
    public static void main(String[] args) throws IOException{
        FileInputStream fin = new FileInputStream("C:\\uno.txt");
        FileInputStream fin2 = new FileInputStream("C:\\Hola.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fin, fin2);
        int j;
        while((j=sis.read())!=-1){
            System.out.print((char)j);
        }
        sis.close();
        fin.close();
        fin2.close();
    }
}
