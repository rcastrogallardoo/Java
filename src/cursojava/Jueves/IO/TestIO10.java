package cursojava.Jueves.IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

 class TestIO10 {
     public static void main(String[] args) throws IOException{
         FileOutputStream fout = new FileOutputStream("C:\\Hola.txt");
         
         DataOutputStream data = new DataOutputStream(fout);
         data.writeInt(65);
         data.flush();
         data.close();
         System.out.println("Listo");
     }
}
