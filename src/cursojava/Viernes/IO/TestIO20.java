package cursojava.Viernes.IO;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestIO20 {
    public static void main(String[] args) throws IOException{
        CharArrayWriter out = new CharArrayWriter();
        
        out.write("Hola Coppel");
        
        FileWriter f1 = new FileWriter("C:\\1.txt");
        FileWriter f2 = new FileWriter("C:\\2.txt");
        FileWriter f3 = new FileWriter("C:\\3.txt");
        FileWriter f4 = new FileWriter("C:\\4.txt");
        
        writeToFile(out, f1, f2, f3, f4);
        closeStreams(f1, f2, f3, f4);
        
    }
    
    private static void closeStreams(FileWriter f1, FileWriter f2, FileWriter f3, FileWriter f4) throws IOException {
        f1.close();
        f2.close();
        f3.close();
        f4.close();
    }
    
    private static void writeToFile(CharArrayWriter out, FileWriter f1, FileWriter f2, FileWriter f3, FileWriter f4) throws IOException {
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);
        out.writeTo(f4);
    }
}
