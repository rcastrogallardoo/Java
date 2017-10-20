
package cursojava.Lunes;

class Vehicle{
    void run(){
        System.out.println("El Vehiculo esta corriendo");
    }
}
public class Bike extends Vehicle{
    void run (){
        System.out.println("La bicicleta esta corriendo");
    }
    public static void main(String[] args)
    {
        Bike b = new Bike();
        b.run();
    }
}
