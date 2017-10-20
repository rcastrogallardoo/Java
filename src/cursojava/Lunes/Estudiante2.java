
package cursojava.Lunes;


public class Estudiante2 {
    int matricula;
    String nombre;
    String msg;
    static String escuela= "ITL";
    
    static void cambio(){
        escuela = "UG";
    }
    Estudiante2(int i, String n){
        matricula = i;
        nombre = n;
    }
    
    void display(){
        msg=" Matricula: "+matricula;
        msg+="\n Nombre: "+nombre;
        msg+="\n Escuela: "+escuela;
        System.out.println(msg);
    }
    public static void main(String[] args)
    {
        Estudiante2.cambio();
        
        Estudiante2 s4 = new Estudiante2(111,"David");
        Estudiante2 s5 = new Estudiante2(112,"Maria");
        Estudiante2 s6 = new Estudiante2(113,"Isabel");
        
        s4.display();
        s5.display();
        s6.display();
    }
}
