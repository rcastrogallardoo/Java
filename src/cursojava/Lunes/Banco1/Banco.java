
package cursojava.Lunes.Banco1;

class Intereses{
    void SBI(double interes){
        System.out.println("Inteses del SBI "+interes+"%");
    }
    void ICICI(double interes){
        System.out.println("Interes del ICICI "+interes+"%");
    }
    void AXIS(){
        System.out.println("Interes del 7% AXIS");
    }
}
public class Banco extends Intereses{
    public static void main(String[] args){
        Intereses tasa = new Intereses();
        tasa.AXIS();
        tasa.ICICI(9.2);
        tasa.SBI(8.5);
    }
}

