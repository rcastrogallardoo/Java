package cursojava.Jueves.IO;

import java.io.Console;
import java.io.IOException;
//Solo Por Consola
public class TestIO12 {
    public static void main(String[] args) throws IOException{
        Console c = System.console();
        String n = null;
        if(c != null){
             n = c.readLine("Nombre: ");
        }
        System.out.println("Bienvenido "+n);
    }
}
