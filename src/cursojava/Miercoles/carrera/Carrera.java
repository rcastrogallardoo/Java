package cursojava.Miercoles.carrera;

public class Carrera {
    public static void main(String[] args) {
        Tortuga tortuga = new Tortuga();
       /* Liebre liebre = new Liebre();
        Thread Liebre = new  Thread(liebre);*/
        Thread liebre = new Thread(new Liebre());
        
        tortuga.start();
        liebre.start();
    }
}
