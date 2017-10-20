package cursojava.Miercoles;

public class MultiHilos extends Thread{
    public void run(){
        System.out.println("Corriendo");
    }
    public static void main(String[] args){
        MultiHilos t1 = new MultiHilos();
        t1.start();
        
    }
    
}
