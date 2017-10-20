
package cursojava.Lunes.Jerarquia;

class Animal{
    void comer()
    {
        System.out.println("Comiendo...");
    }
}
class perro extends Animal{
    void ladrar(){
        System.out.println("Ladrando...");
    }
}
class Gato extends Animal {
    void maullar(){
        System.out.println("Maullando...");
    }
}
public class PruebaHerencia {
    public static void main(String[] args)
    {
        Gato g = new Gato();
        g.maullar();
        g.comer();
    }
}
