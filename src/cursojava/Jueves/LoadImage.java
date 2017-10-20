package cursojava.Jueves;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.JFrame;

public class LoadImage  extends Thread{
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
        f.add(new LoadImagenApp(imagen));
        f.pack();
        f.setVisible(true);
        Thread.sleep(40000);
        f.setVisible(false);
    }
    
    public static void main(String[] args) throws IOException {
        LoadImage t1 = new LoadImage();
        LoadMusica m1 = new LoadMusica();
        t1.start();
        m1.CargarMusica("C:/Users/sandra/Downloads/Musica/cancion1.wav");
        
        
    }
    
}
