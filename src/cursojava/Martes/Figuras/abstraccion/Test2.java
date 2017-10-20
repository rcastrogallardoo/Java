package cursojava.Martes.Figuras.abstraccion;
abstract class Bike{
    Bike(){
        System.out.println("La bicicleta se ha creado");
    }
    abstract void run();
    void changeColor(){
        System.out.println("Color cambiado");
    }
}
class Honda extends Bike{
    void run(){
        System.out.println("Corriendo");
    }
}
public class Test2 {
    public static void main(String[] args){
        Bike H = new Honda();
        H.run();
        H.changeColor();
    }
    
}
