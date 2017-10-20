package cursojava.Jueves.Sincronizacion;

class Mesa{
    synchronized void mostrarMesa(int n){
        for(int i = 1; i<=5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
class MyT extends Thread{
    Mesa m;
    MyT(Mesa m){
        this.m =m;
    }
    public void  run(){
        m.mostrarMesa(5);
    }
}
class MyT2 extends Thread{
    Mesa m;
    MyT2(Mesa m){
        this.m =m;
    }
    public void  run(){
        m.mostrarMesa(100);
    }
}

public class Test {
    public static void main(String[] args) {
        Mesa mesa = new Mesa();
        MyT t1 = new MyT(mesa);
        MyT2 t2 = new MyT2(mesa);
        
        t1.start();
        t2.start();
    }
    
}
