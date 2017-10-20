
package cursojava.Lunes;

public class Contador {
    // int i = 0;
    static int i = 0;
    
    Contador()
    {
        i++;
        System.out.println(i);
    }
    
    public static void main (String[] args)
    {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        
    }
    
}
