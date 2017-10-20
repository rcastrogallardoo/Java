
package cursojava.Lunes;
/*
La palabra reservada static es principalmente usada para la administraion de memoria
la palabra static 
*/
public class Estudiante {
    int matricula;
    String nombre;
    String msg;
    static String escuela = "ITL";
    
    
    Estudiante(int matricula, String nombre)
    {
        this.matricula = matricula;
        this.nombre = nombre;
    }
    
    void display()
    {
        msg+="matricula: "+matricula;
        msg+="\n nombre: "+nombre;
        msg+="\n escuela: "+escuela;
        System.out.println(msg);
    }
    
    public static void main(String[] args)
    {
        Estudiante s1 = new Estudiante(111,"Jose");
        Estudiante s2 = new Estudiante(112,"Maria");
        
        s1.display();
        s2.display();
    }
}
