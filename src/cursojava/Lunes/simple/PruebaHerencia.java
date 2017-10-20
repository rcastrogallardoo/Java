
package cursojava.Lunes.simple;

class Animal {
    void comer(){
        System.out.println("Comiendo...");
    }
}
class Perro extends Animal{
    void ladrar(){
        System.out.println("Ladrando...");
    }
}
class cachorro extends Perro
{
    void correr()
    {
        System.out.println("Corrindo");
    }
}
public class PruebaHerencia {
   public static void main(String[] args)
   {
       cachorro c = new cachorro();
       c.comer();
       c.ladrar();
       c.correr();
   }
    
}
