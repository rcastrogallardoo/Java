package cursojava.Miercoles;
//Name,Id,Prioridad,Estado,CurrentThread
public class TestN extends Thread{
    public void run(){
        System.out.println("running");
    }
    public static void main(String[] args) {
        TestN t1 = new TestN();
        TestN t2 = new TestN();
        
        System.out.println("Nombre T1: "+t1.getName());
        System.out.println("Nombre T2: "+t2.getName());
        
        System.out.println("Id T1: "+t1.getId());
        System.out.println("Id T2: "+t2.getId());
        
        System.out.println("prioridad T1: "+t1.getPriority());
        System.out.println("prioridad T2: "+t2.getPriority());
        
        System.out.println("state T1: "+t1.getState());
        System.out.println("state T1: "+t2.getState());
        
        System.out.println("Nombre T1: "+Thread.currentThread().getName());
        System.out.println("Nombre T2: "+Thread.currentThread().getName());
        
         System.out.println("toString T1: "+t1.toString());
        System.out.println ("toString T1: "+t2.toString());
        t1.start();
        t2.start();
    }
}
