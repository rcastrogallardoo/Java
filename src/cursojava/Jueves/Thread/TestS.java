package cursojava.Jueves.Thread;

class MThread extends Thread{
    public void run(){
        System.out.println("Shutdow");
    }
}
public class TestS {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new MThread());
        
        System.out.println("No main ... press ctrl+c");
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
