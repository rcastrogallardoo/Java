package cursojava.Concierto;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.JFrame;

public class Main extends Thread{
    String imagen;
    public void run(){
        try{
            System.out.println("Muestra Imagen");
            Thread.sleep(500);
            for(int i=1;i<=3;i++){
                display("C:/Users/sandra/Downloads/Imagenes/imagen"+i+".jpg");
                
            }
            System.out.println("Imagen");
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
    }
    public  void display(String imagen) throws InterruptedException{
        this.imagen = imagen;
        JFrame f=new JFrame("Load");
        f.addWindowListener(new WindowAdapter (){
            public void wiindowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        f.add(new MainImagen(imagen));
        f.pack();
        f.setVisible(true);
        Thread.sleep(40000);
        f.setVisible(false);
    }
    
    public static void main(String[] args) throws IOException {
        Main t1 = new Main();
        MainMusica m1 = new MainMusica();
        t1.start();
        m1.CargarMusica("C:/Users/sandra/Downloads/Musica/cancion1.wav");
        
        
    }
}
