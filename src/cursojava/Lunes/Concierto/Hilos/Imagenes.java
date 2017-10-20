package cursojava.Lunes.Concierto.Hilos;


import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;



public class Imagenes extends Component{
      BufferedImage img = null;
    public void run(){
        String imagen="";
        
        for(int i = 1;i<=3;i++){
            imagen="C:/Users/sandra/Downloads/Imagenes/imagen";
            imagen+=i+".jpg";
            if(i==1){
                JFrame f=new JFrame("Gerardo Ortiz");
                f.addWindowListener(new WindowAdapter (){
                    public void wiindowClosing(WindowEvent e){
                        System.exit(0);
                    }
                });
                f.add(new Imagenes(imagen));
                f.pack();
                f.setVisible(true);
                try {
                    Thread.sleep (500);
                } catch (Exception e) {
                    System.out.println(e);
                }
                f.setVisible(false);
            }
            else if(i==2){
                JFrame f=new JFrame("Joan Sebastian");
                f.addWindowListener(new WindowAdapter (){
                    public void wiindowClosing(WindowEvent e){
                        System.exit(0);
                    }
                });
                f.add(new Imagenes(imagen));
                f.pack();
                f.setVisible(true);
                try {
                    Thread.sleep (500);
                } catch (Exception e) {
                    System.out.println(e);
                }
                f.setVisible(false);
            }
            else if(i==3){
                JFrame f=new JFrame("Alfredito Olivas");
                f.addWindowListener(new WindowAdapter (){
                    public void wiindowClosing(WindowEvent e){
                        System.exit(0);
                    }
                });
                f.add(new Imagenes(imagen));
                f.pack();
                f.setVisible(true);
                try {
                    Thread.sleep (500);
                } catch (Exception e) {
                    System.out.println(e);
                }
                f.setVisible(false);
            }
            
        }
    }
    
     public void paint(Graphics g){
         g.drawImage(img, 0, 0, null); 
    }
     public Imagenes(String imagen){
         try{
             img = ImageIO.read(new File(imagen));
         }catch(IOException e){
             System.out.println(e);
         }
     }
     public Dimension getPreferredSize(){
         if(img == null){
             return new Dimension (100,100);
         }else{
             return new Dimension(img.getWidth(null),img.getHeight(null));
         }
     }
}
