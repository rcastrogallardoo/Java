package cursojava.Martes.Interfaces;

public class Printable implements Print {
    public void print(){
        System.out.println("Hola");
    }
    
    public static void main(String[] args){
        Printable p = new Printable();
        p.print();
    }
}
