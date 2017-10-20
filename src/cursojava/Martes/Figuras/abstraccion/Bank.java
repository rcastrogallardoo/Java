
package cursojava.Martes.Figuras.abstraccion;

abstract class Bank {
    abstract float getRateOfInterest();
}

class SBI extends Bank{
    float getRateOfInterest(){
        return 7.3f;
    }
}

class PNB extends Bank{
    float getRateOfInterest(){
        return 8.15f;
    }
}
class ICICI  extends Bank{
    float getRateOfInterest(){
        return 9.45f;
    }
}

class Test {
    public static void main(String[] args){
        Bank b;
        String msg="",msg2="",msg3="";
        b = new SBI();
        msg+="Rate of intereest is: ";
        msg+=+b.getRateOfInterest();
        msg+=" %\n";
        System.out.println(msg);
        
        b = new PNB();
        msg2+="Rate of intereest is: ";
        msg2+=+b.getRateOfInterest();
        msg2+=" %\n";
        System.out.println(msg2);
        
        b = new ICICI();
        msg3+="Rate of intereest is: ";
        msg3+=+b.getRateOfInterest();
        msg3+=" %\n";
        System.out.println(msg3);
    }
}