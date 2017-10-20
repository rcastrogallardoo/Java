
package cursojava.Lunes.Banco1.Banco2;

public class Banco{
    float getintereses(){
        return 0;
    }
}

class SBI extends Banco{
    float getintereses(){
        return 7.5f;
    }
    
}
class AXIS extends Banco{
    float getintereses(){
        return 8.5f;
    }
}
class ICICI extends Banco{
    float getintereses(){
        return 9.5f;
    }
}
class Test{
    public static void main(String[] args)
    {
        //Polimorfismo en tiempo de ejecucion
        Banco b;
        b = new SBI();
        System.out.println("SBI tasa de interes: "+b.getintereses());
        b = new ICICI();
        System.out.println("ICICI tasa de interes: "+b.getintereses());
        b = new AXIS();
        System.out.println("AXIS tasa de interes: "+b.getintereses());
    }
}