
package cursojava.Miercoles;

/**
 *
 * @author sandra
 */
public class TestN2 extends Thread{
    public void run(){
        System.out.println("running");
    }
    public static void main(String[] args) {
        TestN2 t1 = new TestN2();
        TestN2 t2 = new TestN2();
        
        System.out.println("Nombre T1: "+t1.getName());
        System.out.println("Nombre T2: "+t2.getName());
        
        t1.start();
        t2.start();
        t1.setName("Hilo 1");
        t2.setName("Hilo 2");
        System.out.println("Despues del Cambio T1 "+t1.getName());
        System.out.println("Despues del Cambio T2 "+t2.getName());
    }
}
