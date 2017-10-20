package cursojava.Miercoles;
//Join
public class TestJ extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
                  System.out.println(i);
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
    public static void main(String[] args){
        TestJ t1 = new TestJ(),
              t2 = new TestJ(),
              t3 = new TestJ();
        t1.start();
        try{
            t1.join();
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
        t2.start();
        t3.start();
    }
    
}
