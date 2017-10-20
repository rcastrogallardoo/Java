package cursojava.Miercoles.carrera;

public class Liebre implements Runnable{
    public void run(){
        int i =0;
        System.out.println("Inicia la Liebre");
        while(i<5)
        {
            try{
                 Thread.sleep(500);
                System.out.println("Da un paso la Liebre");
            }catch(InterruptedException ie){
                 System.out.println(ie);
            }
            i++;
        }
        System.out.println("Da un paso la Liebre");
    }
    
}
