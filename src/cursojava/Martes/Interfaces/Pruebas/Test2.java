package cursojava.Martes.Interfaces.Pruebas;
import cursojava.Martes.Interfaces.Bank;

class SBI implements Bank{
    @Override
    public float getRateOfIntereset() {
      return 9.15f;
    }
}
class PNB implements Bank{
    @Override
    public float getRateOfIntereset() {
         return 9.7f;
    }

   
}
class ICICI implements Bank{
    @Override
    public float getRateOfIntereset() {
        return 8.3f;
    }

    
}
public class Test2 {
    public static void main(String[] args){
        Bank b= new SBI();
        System.out.println("ROI: "+b.getRateOfIntereset());
    }
}
